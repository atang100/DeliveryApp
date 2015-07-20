package deliveryapp

class SummaryController {

    def index() {
        System.println(params)

        String fullName = params.fullName
        String ccNum = params.ccNum
        String ccType = params.ccType
        String ccExpDate = params.ccExpDate
        String ccCw = params.ccCw

        String streetName = params.streetName
        String city = params.city
        String postalCode = params.postalCode
        String phone = params.phone

        String restName = params.restName
        String shoppingCartId = params.shoppingCartId

        String blurredCCNum = ccNum.substring(0,4) + "********" + ccNum.substring(ccNum.length() - 4)

        ShoppingCart shoppingCart = ShoppingCart.get(shoppingCartId)
        Restaurant restaurant = Restaurant.findByRestName(restName)
        List<ShoppingCartItem> shoppingCartItemList = ShoppingCartItem.findAllByShoppingCart(shoppingCart)

        render (view: "index", model: [fullName: fullName,
                                       ccNum: blurredCCNum,
                                       ccType: ccType,
                                       ccExpDate: ccExpDate,
                                       ccCw: ccCw,
                                       streetName: streetName,
                                       city: city,
                                       postalCode: postalCode,
                                       phone: phone,
                                       restaurant: restaurant,
                                       shoppingCart: shoppingCart,
                                       shoppingCartItemList: shoppingCartItemList])
    }
}
