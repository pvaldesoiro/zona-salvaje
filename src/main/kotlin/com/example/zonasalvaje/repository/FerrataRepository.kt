package com.example.zonasalvaje.repository

import com.example.zonasalvaje.entity.Ferrata
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface FerrataRepository : JpaRepository<Ferrata, UUID>