package deliveryapp

class Address {

    String streetName
    String postalCode
    String city
    String province
    String country

    static belongsTo = [registeredUser: RegisteredUser]

    static constraints = {
        postalCode size: 6, blank: false
        streetName blank: false
        city blank: false
        province blank: province
        country blank: country
    }
}
