package com.example.kotlinGraphql.repository

import com.example.kotlinGraphql.entity.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : CrudRepository<User,Long> {

}