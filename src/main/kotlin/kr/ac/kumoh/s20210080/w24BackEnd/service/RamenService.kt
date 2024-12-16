package kr.ac.kumoh.s20210080.w24BackEnd.service

import kr.ac.kumoh.s20210080.w24BackEnd.model.Ramen
import kr.ac.kumoh.s20210080.w24BackEnd.repository.RamenRepository
import org.springframework.stereotype.Service

@Service
class RamenService(private val repository: RamenRepository) {
    fun getRamen(): List<Ramen> = repository.findAll()
}