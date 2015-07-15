package deliveryapp

class Restaurant {

    String restName
    String category
    String description
    String phoneNumber

    static hasMany = [menuItems: MenuItem]

    static constraints = {
    }
}
