package deliveryapp

class SummaryController {

    def index() {
        System.println(params)

        String fullName = params.fullName
        String creditCardNumber = params.creditCardNumber
        String creditCardType = params.creditCardType
        String expiryDate = params.expiryDate
        String cvv = params.cvv

        String streetName = params.streetName
        String city = params.city
        String postalCode = params.postalCode
        String phone = params.phone

        String restName = params.restName
        String shoppingCartId = params.shoppingCartId


        ShoppingCart shoppingCart = ShoppingCart.get(shoppingCartId)
        Restaurant restaurant = Restaurant.findByRestName(restName)
        List<ShoppingCartItem> shoppingCartItemList = ShoppingCartItem.findAllByShoppingCart(shoppingCart)

        render (view: "index", model: [fullName: fullName,
                                       creditCardNumber: creditCardNumber,
                                       creditCardType: creditCardType,
                                       expiryDate: expiryDate,
                                       cvv: cvv,
                                       streetName: streetName,
                                       city: city,
                                       postalCode: postalCode,
                                       phone: phone,
                                       restaurant: restaurant,
                                       shoppingCart: shoppingCart,
                                       shoppingCartItemList: shoppingCartItemList])
    }
}
