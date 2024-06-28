package banking.api.user.service

import banking.api.user.convertor.userResponse
import banking.api.user.convertor.toUserProfileEntity
import banking.api.user.domain.UserProfileRequest
import banking.api.user.domain.UserProfileResponse
import banking.api.user.persitence.repository.UserProfileRepository
import org.springframework.stereotype.Service

@Service
class UserProfileService(
    private val userProfileRepository: UserProfileRepository
) {

    fun createUserProfile(request: UserProfileRequest): UserProfileResponse {
        return userProfileRepository
            .save(request.toUserProfileEntity())
            .userResponse()
    }

    fun getAllUserProfiles(): List<UserProfileResponse> {
        return userProfileRepository.findAll().map { it.userResponse() }
    }

    fun getUserProfileById(id: String): UserProfileResponse {
       return userProfileRepository.findById(id).get().userResponse()
    }

    fun getUserProfileByEmail(email: String): UserProfileResponse {
        return userProfileRepository.findByEmail(email).userResponse()
    }
}