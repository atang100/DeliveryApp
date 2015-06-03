package deliveryapp

class Restaurant {

    String restName
    String category
    String description
    List hourOperation
    String phoneNumber

    static hasMany = [menuItems: MenuItem]

    static constraints = {
    }
}
