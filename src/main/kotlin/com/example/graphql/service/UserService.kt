package com.example.graphql.service

import com.example.graphql.entity.User
import com.example.graphql.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService @Autowired constructor(private val userRepository: UserRepository){

    fun findAll(): MutableIterable<User> {
        return userRepository.findAll()
    }

    fun create(user: User): User {
       return userRepository.save(user)
    }
}

