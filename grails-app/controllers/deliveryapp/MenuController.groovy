package deliveryapp

import java.awt.Menu

class MenuController {

    def ShoppingCartService

    def displayMenu() {

        String userType
        if (session.user == null) {
            userType = "unregistered"
        } else {
            userType = "registered"
        }

        Restaurant restaurant = Restaurant.findByRestName(params.restaurantName)
        List<MenuItem> menuList = restaurant.getMenuItems()

        String shoppingCartId = ShoppingCartService.createCart()

        render (view: "index", model: [userType: userType, restaurant: restaurant, menuList: menuList, shoppingCartId: shoppingCartId])
    }

    def incrementItem() {
        String shoppingCartId = params.shoppingCartId
        String itemId = params.itemId

        ShoppingCart shoppingCart = ShoppingCart.get(shoppingCartId)
        ShoppingCartService.incrementItemInCart(itemId, shoppingCartId)

        //Implement refresh cart
    }

    def decrementItem() {
        String shoppingCartId = params.shoppingCartId
        String itemId = params.itemId

        ShoppingCart shoppingCart = ShoppingCart.get(shoppingCartId)
        ShoppingCartService.decrementItemInCart(shoppingCartId)

        //Implement refresh cart
    }
}
