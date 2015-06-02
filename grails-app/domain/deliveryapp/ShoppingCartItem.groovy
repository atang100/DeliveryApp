package deliveryapp

class ShoppingCartItem {

    String price
    int quantity
    String itemName

    static belongsTo = [shoppingCart: ShoppingCart]

    static constraints = {
    }
}
