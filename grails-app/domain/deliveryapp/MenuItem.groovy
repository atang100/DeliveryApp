package deliveryapp

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
}
