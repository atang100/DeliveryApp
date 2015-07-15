package deliveryapp

class ShoppingCart {

    double subTotal
    double tax
    double deliveryCharge
    double total

    static hasMany = [shoppingCartItems: ShoppingCart]

    static constraints = {
    }
}
