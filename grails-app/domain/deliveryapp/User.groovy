package deliveryapp

class User {

    static hasMany = [addresses: Address, transaction: Transaction]
    static hasOne = [creditCard: CreditCard]

    static constraints = {
    }
}
