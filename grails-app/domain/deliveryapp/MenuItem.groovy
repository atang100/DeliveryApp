package deliveryapp

import java.text.DecimalFormat

class MenuItem {

    String itemId
    String itemName
    double price
    String description
    String type

    MenuItem menuItem

    static belongsTo = [restaurant: Restaurant]

    static constraints = {
    }

    public String convertPriceToString() {
        DecimalFormat df = new DecimalFormat("#.00")
        return df.format(price)
    }
}
