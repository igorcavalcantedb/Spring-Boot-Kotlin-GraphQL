package com.example.kotlinGraphql.graphql.query

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.coxautodev.graphql.tools.GraphQLResolver
import com.example.kotlinGraphql.repository.UserRepository
import com.example.kotlinGraphql.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class UserQueryResolver @Autowired constructor(private val userService: UserService): GraphQLQueryResolver {
    fun getAllUsers()= userService.findAll();
}