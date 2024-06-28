package banking.api.user.persitence.repository

import banking.api.user.persitence.entity.AddressEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface AddressRepository : CrudRepository<AddressEntity, String>