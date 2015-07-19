package deliveryapp

class CheckoutController {

    def index() {
        Restaurant restaurant = Restaurant.findByRestName(params.restName)
        ShoppingCart shoppingCart = ShoppingCart.get(params.shoppingCartId)
        List<ShoppingCartItem> shoppingCartItemList = ShoppingCartItem.findAllByShoppingCart(shoppingCart)

        render (view: "index", model: [restaurant: restaurant, shoppingCart: shoppingCart, shoppingCartItemList: shoppingCartItemList])
    }

}
