package deliveryapp

class Address {

    String streetName
    String postalCode
    String city
    String province
    String country

    static belongsTo = [customer: User]

    static constraints = {
        postalCode size: 6..6, blank: false
        streetName blank: false
        city blank: false
        province blank: false
        country blank: false
    }
}
