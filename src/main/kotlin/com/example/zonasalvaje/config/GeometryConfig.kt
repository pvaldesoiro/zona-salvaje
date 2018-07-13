package com.example.zonasalvaje.config

import com.vividsolutions.jts.geom.GeometryFactory
import com.vividsolutions.jts.geom.PrecisionModel
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class GeometryConfig {
  companion object {
    private val WGS84_SRID = 4326
  }

  @Bean
  fun geometryFactory(): GeometryFactory =
    GeometryFactory(PrecisionModel(), WGS84_SRID)
}