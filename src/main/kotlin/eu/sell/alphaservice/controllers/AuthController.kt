package eu.sell.alphaservice.controllers

import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/auth")
class AuthController {
    private val log = LoggerFactory.getLogger(AuthController::class.java)

    @GetMapping("/authorize")
    fun authorize(): ResponseEntity<*> {
        log.info("Start authorization process")
        TODO("Write logic for auth endpoint")
    }
}