package com.example.zonasalvaje.config

import com.bedatadriven.jackson.datatype.jts.parsers.PointParser
import com.bedatadriven.jackson.datatype.jts.serialization.GeometryDeserializer
import com.bedatadriven.jackson.datatype.jts.serialization.GeometrySerializer
import com.vividsolutions.jts.geom.GeometryFactory
import com.vividsolutions.jts.geom.Point
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder

@Configuration
class JacksonConfiguration @Autowired constructor(
  val geometryFactory: GeometryFactory
) {
  @Bean
  fun customJackson2ObjectMapperBuilder(): Jackson2ObjectMapperBuilderCustomizer =
    Jackson2ObjectMapperBuilderCustomizer { jacksonObjectMapperBuilder: Jackson2ObjectMapperBuilder ->
      jacksonObjectMapperBuilder.serializers(GeometrySerializer())
      jacksonObjectMapperBuilder.deserializerByType(
        Point::class.java,
        GeometryDeserializer<Point>(PointParser(geometryFactory))
      )
    }
}