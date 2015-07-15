package deliveryapp

class ShoppingCartItem {

    String itemId
    double price
    double totalPrice
    int quantity
    String itemName

    static belongsTo = [shoppingCart: ShoppingCart]

    static constraints = {
    }
}
