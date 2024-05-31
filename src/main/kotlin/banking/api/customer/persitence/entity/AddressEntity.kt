package banking.api.customer.persitence.entity

import banking.api.customer.domain.AddressType
import banking.util.generateStringUUID
import banking.util.now
import java.time.ZonedDateTime

data class AddressEntity(
    val id: String = generateStringUUID(),
    val type: AddressType,
    val street: String,
    val city: String,
    val state: String,
    val zip: String,
    val createdAt: ZonedDateTime = now(),
    val modifyAt: ZonedDateTime = now(),
)