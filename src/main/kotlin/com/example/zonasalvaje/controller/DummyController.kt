package com.example.zonasalvaje.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DummyController {
  @GetMapping("/")
  fun dummy(): String = "Dummy"
}