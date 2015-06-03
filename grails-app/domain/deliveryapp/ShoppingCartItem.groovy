package deliveryapp

class ShoppingCartItem {

    String price
    int quantity
    String itemName

    Restaurant restaurant
    static belongsTo = [shoppingCart: ShoppingCart]

    static constraints = {
    }
}
