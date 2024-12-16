package kr.ac.kumoh.s20210080.w24BackEnd.model

import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "ramen_db")
data class Ramen(
    val id: String? = null,
    val ramenBase: String,
    val ramenMix: String,
    val mixedRamen: String,
    val rating: String,
)
