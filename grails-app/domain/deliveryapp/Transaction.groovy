package deliveryapp

class Transaction {

    String orderStatus

    static belongsTo = [customer: User]

    static constraints = {
    }
}
