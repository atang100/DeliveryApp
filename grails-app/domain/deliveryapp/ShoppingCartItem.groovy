package deliveryapp

import java.text.DecimalFormat

class ShoppingCartItem {

    String itemId
    double price
    double totalPrice
    int quantity
    String itemName

    static belongsTo = [shoppingCart: ShoppingCart]

    static constraints = {
    }

    public String convertPriceToString() {
        DecimalFormat df = new DecimalFormat("#.00")
        return df.format(totalPrice)
    }
}
