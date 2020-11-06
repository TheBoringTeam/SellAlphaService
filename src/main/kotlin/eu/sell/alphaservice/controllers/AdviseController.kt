package eu.sell.alphaservice.controllers

import org.springframework.http.HttpStatus
import org.springframework.validation.FieldError
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus

@ControllerAdvice
class AdviseController {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException::class)
    fun handleValidationExceptions(e: MethodArgumentNotValidException): HashMap<String, String> {
        val errorMap = hashMapOf<String, String>()
        e.bindingResult.allErrors.forEach { error ->
            errorMap[(error as FieldError).field] = error.defaultMessage!!
        }
        return errorMap
    }
}