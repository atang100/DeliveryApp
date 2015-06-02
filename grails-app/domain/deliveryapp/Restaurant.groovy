package deliveryapp

class Restaurant {

    String restaurantName
    String category
    String description
    List hourOperation
    String phoneNumber

    static hasMany = [menuItems: MenuItem]

    static constraints = {
    }
}
