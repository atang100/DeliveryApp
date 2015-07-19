package deliveryapp

import java.awt.Menu

class MenuController {

    def ShoppingCartService

    def displayMenu() {

        Restaurant restaurant = Restaurant.findByRestName(params.restaurantName)
        List<MenuItem> menuList = restaurant.getMenuItems().asList()

        String shoppingCartId = ShoppingCartService.createCart()
        ShoppingCart shoppingCart = ShoppingCart.get(shoppingCartId)

        List<ShoppingCartItem> shoppingCartItemList = new ArrayList<ShoppingCartItem>()

        render (view: "index", model: [restName: restaurant.restName, menuList: menuList, shoppingCartId: shoppingCartId, shoppingCart: shoppingCart, shoppingCartItemList: shoppingCartItemList])
    }

    def incrementItem() {
        System.println(getParams())
        String shoppingCartId = params.shoppingCartId
        String itemId = params.itemId

        ShoppingCart shoppingCart = ShoppingCart.get(shoppingCartId)
        ShoppingCartService.incrementItemInCart(itemId, shoppingCartId)

        List<ShoppingCartItem> shoppingCartItemList = ShoppingCartItem.findAllByShoppingCart(shoppingCart)

        //Render Cart
        render(template:"/menu/cart", model:[shoppingCart: shoppingCart, shoppingCartItemList: shoppingCartItemList])
    }

    def decrementItem() {
        System.println(getParams())
        String shoppingCartId = params.shoppingCartId
        String itemId = params.itemId

        ShoppingCart shoppingCart = ShoppingCart.get(shoppingCartId)
        ShoppingCartService.decrementItemInCart(itemId, shoppingCartId)

        List<ShoppingCartItem> shoppingCartItemList = ShoppingCartItem.findAllByShoppingCart(shoppingCart)

        //Render Cart
        render(template:"/menu/cart", model:[shoppingCart: shoppingCart, shoppingCartItemList: shoppingCartItemList])
    }
}
