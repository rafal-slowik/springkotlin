package com.rslowik.springkotlin.service

import com.rslowik.springkotlin.dto.UserDto
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class UserService {

    private val log = LoggerFactory.getLogger(this.javaClass)
    fun get(userId: UUID): UserDto {
        log.info("User ID {} will be returned", userId)
        return UserDto("Jimmy", "Lenny", UUID.randomUUID().toString())
    }
}
