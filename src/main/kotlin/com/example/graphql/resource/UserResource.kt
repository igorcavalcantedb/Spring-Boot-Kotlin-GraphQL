package com.example.graphql.resource

import com.example.graphql.entity.User
import com.example.graphql.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("user")
class UserResource @Autowired constructor(private  val userService: UserService) {
    @GetMapping
    fun finAll(): MutableIterable<User> {
        return userService.findAll()
    }
    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    fun create(@RequestBody user: User): Unit {
        userService.create(user)
    }

}