package deliveryapp

class ShoppingCart {

    String subTotal
    String tax
    String deliveryCharge
    String total
    Customer customer

    static hasMany = [shoppingCartItems: ShoppingCart]

    static constraints = {
    }
}
