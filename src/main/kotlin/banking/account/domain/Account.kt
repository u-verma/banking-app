package banking.account.domain

import banking.api.transaction.domain.Transaction

data class Account (
    val accountId: String,
    val accountType: AccountType,
    val accountBalance: Double,
    val transaction: MutableList<Transaction> = mutableListOf()
)