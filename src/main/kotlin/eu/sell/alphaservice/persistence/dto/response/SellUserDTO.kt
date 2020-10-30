package eu.sell.alphaservice.persistence.dto.response

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.*


class SellUserDTO @JsonCreator constructor(
    @field:JsonProperty("id")
    var id: UUID,
    @field:JsonProperty("username")
    var username: String,
    @field:JsonProperty("email")
    var email: String,
    @field:JsonProperty("public_name")
    var publicName: String,
    @field:JsonProperty("permissions")
    var permissions: List<String>
)