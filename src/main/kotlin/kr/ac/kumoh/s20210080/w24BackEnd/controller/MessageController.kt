package kr.ac.kumoh.s20210080.w24BackEnd.controller

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/message")
@CrossOrigin(origins = ["https://obinramen.netlify.app/"])
class MessageController {
    @GetMapping
    fun getRoot() = mapOf("status" to "success")

    @GetMapping
    // TODO: React 주소 변경할 것
    fun getMessage() = mapOf("status" to "success")
}