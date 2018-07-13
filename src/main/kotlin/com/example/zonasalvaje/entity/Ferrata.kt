package com.example.zonasalvaje.entity

import com.vividsolutions.jts.geom.Point
import org.hibernate.annotations.Type
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "ferratas")
class Ferrata {
  @Id
  @GeneratedValue
  @Type(type = "pg-uuid")
  @Column(columnDefinition = "uuid")
  val id: UUID? = null

  lateinit var name: String

  @Enumerated(EnumType.STRING)
  lateinit var level: Level

  lateinit var location: Point

  enum class Level { K1, K2, K3, K4, K5, K6 }
}