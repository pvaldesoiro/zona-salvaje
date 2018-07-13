package com.example.zonasalvaje.controller

import com.example.zonasalvaje.entity.Ferrata
import com.example.zonasalvaje.repository.FerrataRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/ferratas")
class FerrataController @Autowired constructor(
  private val ferrataRepository: FerrataRepository
) {

  @GetMapping
  fun getFerratas(): List<Ferrata> =
    ferrataRepository.findAll()

  @GetMapping("{ferrataId}")
  fun getFerrata(@PathVariable ferrataId: UUID): Ferrata =
    ferrataRepository.getOne(ferrataId)

  @PostMapping
  fun createFerrata(@RequestBody ferrata: Ferrata): Ferrata =
    ferrataRepository.save(ferrata)
}