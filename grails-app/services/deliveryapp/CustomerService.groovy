package deliveryapp

import grails.transaction.Transactional

@Transactional
class CustomerService {

    //Get customer by customerId
    public Customer getCustomer(String customerId) {
        Customer customer = Customer.findById(customerId)
        return customer
    }
}
