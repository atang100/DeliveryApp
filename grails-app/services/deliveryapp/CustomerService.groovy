package deliveryapp

import grails.transaction.Transactional

@Transactional
class CustomerService {

    //Get customer by customerId
    public User getCustomer(String customerId) {
        User customer = User.get(customerId)
        return customer
    }

    def addAddress(Map addressAttributes, String customerId) {
        try {
            User customer = User.get(customerId)
            Address address = new Address(
                    streetName: addressAttributes.streetName,
                    postalCode: addressAttributes.postalCode,
                    city: addressAttributes.city,
                    province: addressAttributes.province,
                    country: addressAttributes.country,
                    customer: customer

            )
            address.save(failOnError: true)
        } catch (Exception e) {
            System.println("Could not add address!")
            System.println("Error Msg:  " + e)
        }
    }

    def removeAddress(String addressId, String customerId){
        try {
            User customer = User.get(customerId)
            Address address = Address.get(addressId)

            if (customer.addresses.equals(address)) {
                address.delete()
            } else {
                throw Exception
            }
        } catch (Exception e) {
            System.println("Could not delete address")
            System.println("Error Msg:  " + e)
        }
    }

    public boolean verifyRegisteredCustomerExist(String username, String emailAddress) {
        List<RegisteredUser> registeredCustomerList1 = RegisteredUser.findAllByUsername(username)
        List<RegisteredUser> registeredCustomerList2 = RegisteredUser.findAllByEmailAddress(emailAddress)

        if (registeredCustomerList1.isEmpty() && registeredCustomerList2.isEmpty()) {
            return true
        }
        return false
    }

    def registerCustomer(Map customerAttributes) {
        try {
            if (verifyRegisteredCustomerExist(customerAttributes.username, customerAttributes.emailAddress) == true) {

            }
        } catch (Exception e) {

        }
    }
    /**
     * To be implemented
     */
    def transferCartFromUnregisterToRegisterUser() {

    }
}
