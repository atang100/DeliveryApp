package deliveryapp

class Restaurant {

    String restName
    String category
    String description
    String phoneNumber
    int deliveryTime

    static hasMany = [menuItems: MenuItem]

    static constraints = {
    }
}
