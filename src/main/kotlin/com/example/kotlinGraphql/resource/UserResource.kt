package com.example.kotlinGraphql.resource

import com.example.kotlinGraphql.entity.User
import com.example.kotlinGraphql.service.UserService
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
    fun create(@RequestBody user: User): User {
        return userService.create(user)
    }

}