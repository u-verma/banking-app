package banking.domain.security

class Role (
    val roleId: String,
    val roleName: String,
    val permission: List<Permission>
)