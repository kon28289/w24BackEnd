package kr.ac.kumoh.s20210080.w24BackEnd.repository

import kr.ac.kumoh.s20210080.w24BackEnd.model.Ramen
import org.springframework.data.mongodb.repository.MongoRepository

interface RamenRepository : MongoRepository<Ramen, String> {

}