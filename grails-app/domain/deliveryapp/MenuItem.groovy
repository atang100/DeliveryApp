package deliveryapp

class MenuItem {

    String itemName
    String price
    String description
    String type

    MenuItem menuItem

    static belongsTo = [restaurant: Restaurant]

    static constraints = {
    }
}
