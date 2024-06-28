package banking.api.user.persitence.repository

import banking.api.user.persitence.entity.UserProfileEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UserProfileRepository : CrudRepository<UserProfileEntity, String>{
    fun findByEmail(email: String): UserProfileEntity
}
