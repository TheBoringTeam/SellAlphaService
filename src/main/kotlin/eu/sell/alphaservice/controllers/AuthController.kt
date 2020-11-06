package eu.sell.alphaservice.controllers

import eu.sell.alphaservice.persistence.dto.request.RegisterUserForm
import eu.sell.alphaservice.services.WebAccountService
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation.*
import javax.servlet.http.HttpServletRequest
import javax.validation.Valid

@RestController
@RequestMapping("/auth")
class AuthController @Autowired constructor(
    private val webAccountService: WebAccountService
) {
    private val log = LoggerFactory.getLogger(AuthController::class.java)

    @GetMapping("/authorize")
    fun authorize(): ResponseEntity<*> {
        log.info("Start authorization process")
        TODO("Write logic for auth endpoint")
    }

    @PostMapping("/register")
    @ResponseBody
    fun register(
        @Valid @RequestBody registerForm: RegisterUserForm, bindingResult: BindingResult,
        request: HttpServletRequest
    ): ResponseEntity<*> {
        log.info("Starting registration process for username: ${registerForm.username}, email: ${registerForm.email}}")

        // TODO: add validation for registration form

        val user = webAccountService.registerAccount(registerForm)
        //TODO: add mail send
        return ResponseEntity.ok(user)
    }
}