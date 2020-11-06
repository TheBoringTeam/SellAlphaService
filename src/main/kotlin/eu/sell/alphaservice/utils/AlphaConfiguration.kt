package eu.sell.alphaservice.utils

import org.springframework.cloud.client.loadbalancer.LoadBalanced
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestTemplate

/**
 * Configuration class for the this edge service
 */
@Configuration
class AlphaConfiguration {

    @LoadBalanced
    @Bean
    fun provideRestTemplate(): RestTemplate {
        return RestTemplate()
    }


}