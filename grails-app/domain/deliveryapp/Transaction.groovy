package deliveryapp

class Transaction {

    String orderStatus

    static belongsTo = [customer: Customer]

    static constraints = {
    }
}
