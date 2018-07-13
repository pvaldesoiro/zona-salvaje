package com.example.zonasalvaje

import com.example.zonasalvaje.repository.FerrataRepository
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class ZonaSalvajeApplicationShould {
  @Autowired
  lateinit var ferrataRepository: FerrataRepository

  @Test
	fun loadContext() {}
}
