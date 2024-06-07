package banking.api.customer.convertor

import banking.api.customer.domain.CustomerRequest
import banking.api.customer.persitence.entity.AddressEntity
import banking.api.customer.persitence.entity.CustomerEntity
import banking.util.toLocalDate


fun CustomerRequest.toCustomerEntity(): CustomerEntity {
    return CustomerEntity(
        firstName = firstName,
        lastName = lastName,
        email = email,
        phone = phone,
        dateOfBirth = dateOfBirth.toLocalDate(),
        addresses = addresses.map { address -> address.toAddressEntity() }
    )
}

fun CustomerRequest.Address.toAddressEntity() =
    AddressEntity(
        type = type,
        street = street,
        city = city,
        state = state,
        zip = zip
    )