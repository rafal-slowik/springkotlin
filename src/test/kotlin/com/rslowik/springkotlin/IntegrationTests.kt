package com.rslowik.springkotlin

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.client.getForEntity
import org.springframework.http.HttpStatus
import java.util.UUID

/**
 * Created by rslowik on 10/11/2023.
 */
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class IntegrationTests constructor(@Autowired val restTemplate : TestRestTemplate) {

    val path = "/api/v1/users"

    @Test
    fun `get user by ID`() {
        val response = restTemplate.getForEntity<String>("$path/{id}", UUID.randomUUID())
        Assertions.assertThat(response.statusCode).isEqualTo(HttpStatus.OK)
    }
}