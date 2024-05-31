package banking.api.customer.service

import banking.api.customer.convertor.toCustomerEntity
import banking.api.customer.domain.CustomerRequest
import banking.api.customer.domain.CustomerResponse

class CustomerService {

    fun registerCustomer(request: CustomerRequest): CustomerResponse {

        val customerEntity = request.toCustomerEntity()
        return CustomerResponse(
            id = customerEntity.id,
        )
    }
}