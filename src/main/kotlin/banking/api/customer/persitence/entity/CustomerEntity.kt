package banking.api.customer.persitence.entity

import banking.util.now
import java.time.LocalDate
import java.time.ZonedDateTime
import java.util.UUID

data class CustomerEntity(
    val id: String = UUID.randomUUID().toString(),
    val firstName: String,
    val lastName: String,
    val email: String,
    val phone: String,
    val dateOfBirth: LocalDate,
    val addresses: List<AddressEntity>,
    val createdAt: ZonedDateTime = now(),
    val modifyAt: ZonedDateTime = now(),
)