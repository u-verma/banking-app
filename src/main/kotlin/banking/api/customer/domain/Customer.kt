package banking.api.customer.domain

import banking.account.domain.Account

data class Customer(
    val firstName: String,
    val lastName: String,
    val email: String,
    val phone: String,
    val address: List<Address>,
    val accounts: List<Account>
)

data class Address(
    val street: String,
    val city: String,
    val state: String,
    val zip: String
)