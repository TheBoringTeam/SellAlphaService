package eu.sell.alphaservice.services

import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
class WebAccountService @Autowired constructor(private val restTemplate: RestTemplate) {
    private val log = LoggerFactory.getLogger(WebAccountService::class.java)

    private val SERVICE_URL = "http://account-service-dev"

    fun existsByEmail(email: String): Boolean {
        restTemplate.getForObject("$SERVICE_URL/")
    }
}