package banking.api.transaction.domain

import banking.account.domain.Account
import java.time.ZonedDateTime
import java.util.UUID

data class Transaction (
    val id: UUID,
    val type: String,
    val amount: Double,
    val timestamp: ZonedDateTime,
    val account: Account
)