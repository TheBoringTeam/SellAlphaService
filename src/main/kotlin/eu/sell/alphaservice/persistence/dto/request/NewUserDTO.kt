package eu.sell.alphaservice.persistence.dto.request

class NewUserDTO(private val registerForm: RegisterUserForm) {
    val username: String = registerForm.username
    val publicName: String = registerForm.publicName
    var password: String = registerForm.password
    val email: String = registerForm.email
}