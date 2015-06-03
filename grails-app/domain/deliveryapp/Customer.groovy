package deliveryapp

class Customer {

    static hasMany = [addresses: Address, transaction: Transaction]
    static hasOne = [creditCard: CreditCard, shoppingCart: ShoppingCart]

    static constraints = {
    }
}
