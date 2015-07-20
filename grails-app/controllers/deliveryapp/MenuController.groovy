package deliveryapp

import java.awt.Menu

class MenuController {

    def ShoppingCartService

    def displayMenu() {
        System.println(params)
        String restName = params.restName
        Restaurant restaurant = Restaurant.findByRestName(restName)
        List<MenuItem> menuList = restaurant.getMenuItems().asList()

        String shoppingCartId = ShoppingCartService.createCart()
        ShoppingCart shoppingCart = ShoppingCart.get(shoppingCartId)

        List<ShoppingCartItem> shoppingCartItemList = new ArrayList<ShoppingCartItem>()

        if (params.errorMsg != null && params.errorMsg.equals("noItemInCart")) {
            flash.message = "No items have been added to your order.  Please add items to your order before checking out."
        }

        render (view: "index", model: [restName: restaurant.restName, menuList: menuList, shoppingCartId: shoppingCartId, shoppingCart: shoppingCart, shoppingCartItemList: shoppingCartItemList])
    }

    def incrementItem() {
        System.println(getParams())
        String shoppingCartId = params.shoppingCartId
        String itemId = params.itemId
        String restName = params.restName

        ShoppingCart shoppingCart = ShoppingCart.get(shoppingCartId)
        ShoppingCartService.incrementItemInCart(itemId, shoppingCartId)

        List<ShoppingCartItem> shoppingCartItemList = ShoppingCartItem.findAllByShoppingCart(shoppingCart)

        //Render Cart
        render(template:"/menu/cart", model:[restName: restName, shoppingCart: shoppingCart, shoppingCartItemList: shoppingCartItemList])
    }

    def decrementItem() {
        System.println(getParams())
        String shoppingCartId = params.shoppingCartId
        String itemId = params.itemId
        String restName = params.restName

        ShoppingCart shoppingCart = ShoppingCart.get(shoppingCartId)
        ShoppingCartService.decrementItemInCart(itemId, shoppingCartId)

        List<ShoppingCartItem> shoppingCartItemList = ShoppingCartItem.findAllByShoppingCart(shoppingCart)

        //Render Cart
        render(template:"/menu/cart", model:[restName: restName, shoppingCart: shoppingCart, shoppingCartItemList: shoppingCartItemList])
    }

    def redisplayCart() {
        System.println(params)
        String restName = params.restName
        String shoppingCartId = params.shoppingCartId

        Restaurant restaurant = Restaurant.findByRestName(restName)
        List<MenuItem> menuList = restaurant.getMenuItems().asList()

        ShoppingCart shoppingCart = ShoppingCart.get(shoppingCartId)
        List<ShoppingCartItem> shoppingCartItemList = ShoppingCartItem.findAllByShoppingCart(shoppingCart)

        if (params.errorMsg != null && params.errorMsg.equals("noItemInCart")) {
            flash.message = "No items have been added to your order.  Please add items to your order before checking out."
        }

        render (view: "index", model: [restName: restaurant.restName, menuList: menuList, shoppingCartId: shoppingCartId, shoppingCart: shoppingCart, shoppingCartItemList: shoppingCartItemList])
    }
}
