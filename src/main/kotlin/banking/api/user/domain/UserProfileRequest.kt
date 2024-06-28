package banking.api.user.domain

import com.fasterxml.jackson.databind.PropertyNamingStrategies
import com.fasterxml.jackson.databind.annotation.JsonNaming

@JsonNaming(PropertyNamingStrategies.LowerCamelCaseStrategy::class)
data class UserProfileRequest(
    val userType: UserType,
    val firstName: String,
    val lastName: String,
    val email: String,
    val phone: String,
    val addresses: List<Address>,
    val dateOfBirth: String,
    val createdAt: Long?
)

data class Address(
    val type: AddressType,
    val street: String,
    val city: String,
    val state: String,
    val zip: String,
    val country: String,
)