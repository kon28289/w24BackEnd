package kr.ac.kumoh.s20210080.w24BackEnd.controller

import kr.ac.kumoh.s20210080.w24BackEnd.model.Ramen
import kr.ac.kumoh.s20210080.w24BackEnd.service.RamenService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/ramen")
class RamenController(private val service: RamenService) {
    @GetMapping
    fun getRamen(): List<Ramen> = service.getRamen()
}