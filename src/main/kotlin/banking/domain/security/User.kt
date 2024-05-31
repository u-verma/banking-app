package banking.domain.security

import banking.domain.UserType
import java.util.UUID

data class User (
    val id: UUID,
    val name: String,
    val email: String,
    val userName: String,
    val password: String,
    val authority: Authority,
    val userType: UserType
)
