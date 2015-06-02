package deliveryapp

class ShoppingCart {

    String subTotal
    String tax
    String deliveryCharge
    String total
    RegisteredUser registeredUser

    static hasMany = [shoppingCartItems: ShoppingCart]

    static constraints = {
    }
}
