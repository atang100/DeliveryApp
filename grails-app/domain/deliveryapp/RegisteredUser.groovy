package deliveryapp

class RegisteredUser {

    String emailAddress
    String surname
    String firstName
    String username
    String password

    static hasMany = [addresses: Address, transaction: Transaction]
    static hasOne = [creditCard: CreditCard, shoppingCart: ShoppingCart]

    static constraints = {
    }
}
