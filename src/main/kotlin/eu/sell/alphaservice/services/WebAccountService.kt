package eu.sell.alphaservice.services

import eu.sell.alphaservice.persistence.dto.request.NewUserDTO
import eu.sell.alphaservice.persistence.dto.request.RegisterUserForm
import eu.sell.alphaservice.persistence.dto.response.SellUserDTO
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpEntity
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
class WebAccountService @Autowired constructor(private val restTemplate: RestTemplate) {
    private val log = LoggerFactory.getLogger(WebAccountService::class.java)

    private val SERVICE_URL = "http://account-service-dev"

    fun existsByEmail(email: String): Boolean {
        TODO("Implement exists by email functionality")
    }

    fun registerAccount(registrationForm: RegisterUserForm): SellUserDTO {
        val request = HttpEntity(registrationForm.getNewUserDTO())
        val response = restTemplate.postForEntity("$SERVICE_URL/create", request, SellUserDTO::class.java)
        if (response.statusCode.isError || response.body == null) {
            throw Exception("Error during registration request")
        }
        return response.body!!
    }
}