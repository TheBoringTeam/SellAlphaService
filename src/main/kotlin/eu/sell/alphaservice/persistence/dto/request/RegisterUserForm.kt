package eu.sell.alphaservice.persistence.dto.request

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.*

class RegisterUserForm @JsonCreator constructor(
    @field:JsonProperty("username")
    @field:NotEmpty(message = "Username could not be empty")
    @field:NotNull(message = "Username could not be empty")
    @field:Size(message = "Login should be from 6 to 32 length", min = 5, max = 32)
    @field:Pattern(
        regexp = "^(?=[a-zA-Z0-9._])(?!.*[_.]{2})[^_.].*[^_.]\$",
        message = "Username format is not correct"
    )
    private val _username: String?,

    @field:JsonProperty("password")
    @field:NotEmpty(message = "Password could not be empty")
    @field:Size(message = "Password should be from 6 to 32 length", min = 6, max = 32)
    private val _password: String?,

    @field:JsonProperty("email")
    @field:NotEmpty(message = "Email could not be empty")
    @field:Email(message = "Email should be properly formatted")
    private val _email: String?
) {
    val username: String
        get() = _username!!

    val password: String
        get() = _password!!

    val email: String
        get() = _email!!
}