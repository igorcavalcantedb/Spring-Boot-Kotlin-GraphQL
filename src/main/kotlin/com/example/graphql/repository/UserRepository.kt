package com.example.graphql.repository

import com.example.graphql.entity.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : CrudRepository<User,Long> {

}