package deliveryapp

class Transaction {

    String orderStatus

    static belongsTo = [registeredUser: RegisteredUser]

    static constraints = {
    }
}
