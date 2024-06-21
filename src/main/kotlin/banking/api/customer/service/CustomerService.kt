package banking.api.customer.service

import banking.api.customer.convertor.toCustomerEntity
import banking.api.customer.domain.CustomerRequest
import banking.api.customer.domain.CustomerResponse
import banking.api.customer.persitence.repository.AddressRepository
import banking.api.customer.persitence.repository.CustomerRepository

class CustomerService {

    private val customerRepository = CustomerRepository()
    private val addressRepository = AddressRepository()

    fun registerCustomer(request: CustomerRequest): CustomerResponse {

        val customerEntity = request.toCustomerEntity()

        customerRepository.save(customerEntity)

        addressRepository.saveAll(customerEntity.addresses)

        return CustomerResponse(
            id = customerEntity.id,
            firstName = customerEntity.firstName,
            lastName = customerEntity.lastName,
            email = customerEntity.email,
        )
    }

    fun getAllCustomer(): List<CustomerResponse> {
        return customerRepository.findAll().map {
            CustomerResponse(
                id = it.id,
                firstName = it.firstName,
                lastName = it.lastName,
                email = it.email,
            )
        }
    }
}