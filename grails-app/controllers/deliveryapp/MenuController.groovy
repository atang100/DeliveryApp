package deliveryapp

import java.awt.Menu

class MenuController {

    def ShoppingCartService

    def displayMenu() {

        Restaurant restaurant = Restaurant.findByRestName(params.restaurantName)
        List<MenuItem> menuList = restaurant.getMenuItems().asList()

        String shoppingCartId = ShoppingCartService.createCart()

        render (view: "index", model: [userType: userType, restaurant: restaurant, menuList: menuList, shoppingCartId: shoppingCartId])
    }

    def incrementItem() {
        String shoppingCartId = params.shoppingCartId
        String itemId = params.itemId

        ShoppingCart shoppingCart = ShoppingCart.get(shoppingCartId)
        ShoppingCartService.incrementItemInCart(itemId, shoppingCartId)

        //Render Cart
    }

    def decrementItem() {
        String shoppingCartId = params.shoppingCartId
        String itemId = params.itemId

        ShoppingCart shoppingCart = ShoppingCart.get(shoppingCartId)
        ShoppingCartService.decrementItemInCart(shoppingCartId)

        //Render Cart
    }
}
