package com.rslowik.springkotlin.service

import com.rslowik.springkotlin.dto.UserDto
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class UserService {
    fun get(userId: UUID): UserDto {
        return UserDto("Jimmy", "Lenny", UUID.randomUUID().toString())
    }
}
