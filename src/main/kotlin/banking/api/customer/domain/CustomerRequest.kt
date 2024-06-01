package banking.api.customer.domain

data class CustomerRequest(
    val firstName: String,
    val lastName: String,
    val email: String,
    val phone: String,
    val addresses: List<Address>,
    val dateOfBirth: String,
    val createdAt: Long?
){
    data class Address(
        val type: AddressType,
        val street: String,
        val city: String,
        val state: String,
        val zip: String,
        val country: String,
    )
}