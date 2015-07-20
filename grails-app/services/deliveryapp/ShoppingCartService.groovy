package deliveryapp

import grails.transaction.Transactional

@Transactional
class ShoppingCartService {

    def CustomerService

    def createCart() {
        ShoppingCart shoppingCart = new ShoppingCart(
            subTotal: 0,
            tax: 0,
            deliveryCharge: 0,
            total: 0
        )
        shoppingCart.save(failOnError: true)
        return shoppingCart.getId()
    }

    def incrementItemInCart(String itemId, String shoppingCartId) {
        try {
            ShoppingCart shoppingCart = ShoppingCart.get(shoppingCartId)
            MenuItem menuItem = MenuItem.findByItemId(itemId)
            List <ShoppingCartItem> shoppingCartItemList = shoppingCart.getShoppingCartItems().toList()
            boolean successfullyIncrementItem = false

            for (int i = 0; i < shoppingCartItemList.size(); i++) {
                System.println(shoppingCartItemList.get(i).itemId)
                if (shoppingCartItemList.get(i).itemId.equals(itemId)) {
                    ShoppingCartItem shoppingCartItem = ShoppingCartItem.findByItemIdAndShoppingCart(itemId, shoppingCart)
                    shoppingCartItem.quantity++
                    shoppingCartItem.totalPrice = shoppingCartItem.price*shoppingCartItem.quantity
                    shoppingCartItem.save(failOnError: true)
                    successfullyIncrementItem = true
                    break
                }
            }

            if (successfullyIncrementItem == false) {
                ShoppingCartItem shoppingCartItem = new ShoppingCartItem(
                        itemId: menuItem.itemId,
                        itemName: menuItem.itemName,
                        quantity: 1,
                        price: menuItem.price,
                        totalPrice: menuItem.price
                )
                shoppingCart.addToShoppingCartItems(shoppingCartItem)
                shoppingCart.save(failOnError: true)
            }
        } catch (Exception e) {
            System.println("Failure to increment item in cart!")
            System.println("Error Msg:  " + e)
        }
    }

    def decrementItemInCart(String itemId, String shoppingCartId) {
        try {
            ShoppingCart shoppingCart = ShoppingCart.get(shoppingCartId)
            ShoppingCartItem shoppingCartItem = ShoppingCartItem.findByItemIdAndShoppingCart(itemId, shoppingCart)
            if (shoppingCartItem != null && shoppingCart.shoppingCartItems.contains(shoppingCartItem)) {
                shoppingCartItem.quantity--;
                if (shoppingCartItem.quantity <= 0) {
                    shoppingCart.removeFromShoppingCartItems(shoppingCartItem)
                    shoppingCartItem.delete()
                } else {
                    shoppingCartItem.totalPrice = shoppingCartItem.quantity * shoppingCartItem.price
                }
            }
        } catch (Exception e) {
            System.println("Could not remove item in cart!")
            System.println("Error Msg:  " + e)
        }
    }

    def removeAllItemFromCart(String shoppingCartId) {
        try {
            ShoppingCart shoppingCart = ShoppingCart.get(shoppingCartId)
            shoppingCart.shoppingCartItems.clear()
            shoppingCart.save()
        } catch (Exception e) {
            System.println("Could not remove all items from cart!")
            System.println("Error Msg:  " +  e)
        }
    }
}
