package deliveryapp

class CheckoutController {

    def index() {
        System.println(params)
        Restaurant restaurant = Restaurant.findByRestName(params.restName)
        ShoppingCart shoppingCart = ShoppingCart.get(params.shoppingCartId)
        List<ShoppingCartItem> shoppingCartItemList = ShoppingCartItem.findAllByShoppingCart(shoppingCart)

        if (shoppingCartItemList.size() == 0) {
            redirect(controller: "menu", action: "displayMenu", params: [restName: params.restName, errorMsg: "noItemInCart"])
        }

        render (view: "index", model: [restaurant: restaurant, shoppingCart: shoppingCart, shoppingCartItemList: shoppingCartItemList])
    }

}
