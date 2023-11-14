package com.rslowik.springkotlin.controller

import com.rslowik.springkotlin.dto.UserDto
import com.rslowik.springkotlin.service.UserService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.UUID

/**
 * Created by rslowik on 10/11/2023.
 */
@RestController
@RequestMapping("/api/v1/users")
class UserController constructor(val userService: UserService) {

    private val log = LoggerFactory.getLogger(this.javaClass)

    @GetMapping("/{id}")
    fun get(@Validated @PathVariable("id") userId: UUID): ResponseEntity<UserDto> {
        log.info("Get user request in progress ... test")
        return ResponseEntity.ok(userService.get(userId))
    }
}