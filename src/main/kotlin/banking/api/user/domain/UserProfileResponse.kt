package banking.api.user.domain

class UserProfileResponse (
    val id: String,
    val firstName: String,
    val lastName: String,
    val email: String,
    val phone: String,
    val addresses: List<Address>,
    val dateOfBirth: String,
)