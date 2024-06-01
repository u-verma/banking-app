package banking.api.customer.persitence.repository

import banking.api.customer.persitence.entity.CustomerEntity
import java.util.concurrent.ConcurrentHashMap

class CustomerRepository {

    private val customerDatabase = ConcurrentHashMap<String, CustomerEntity>()

    fun save(customerEntity: CustomerEntity) {
        customerDatabase[customerEntity.id] = customerEntity
    }

    fun findById(id: String): CustomerEntity? {
        return customerDatabase[id]
    }

    fun findAll(): List<CustomerEntity> {
        return customerDatabase.values.toList()
    }

    fun deleteById(id: String) {
        customerDatabase.remove(id)
    }

    fun findByEmail(email: String): CustomerEntity? {
        return customerDatabase.values.find { it.email == email }
    }

    fun findByName(name: String): List<CustomerEntity> {
        return customerDatabase.values.filter { it.firstName == name }
    }
}
