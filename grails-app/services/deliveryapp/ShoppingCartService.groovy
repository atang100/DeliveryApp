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

            List <ShoppingCartItem> shoppingCartItemList = shoppingCart.getShoppingCartItems()

            boolean successfullyIncrementItem = false;

            for (int i = 0; i < shoppingCartItemList.size(); i++) {
                if (shoppingCartItemList.get(i).getItemId().equals(shoppingCartId)) {
                    ShoppingCartItem shoppingCartItem = ShoppingCartItem.findByItemId(shoppingCartId)
                    shoppingCartItem.quantity++
                    shoppingCartItem.totalPrice = shoppingCartItem.price*shoppingCartItem.quantity
                    shoppingCartItem.save(failOnError: true)
                    successfullyIncrementItem = true;
                    break
                }
            }

            if (successfullyIncrementItem == false) {
                ShoppingCartItem shoppingCartItem = new ShoppingCartItem(
                        itemId: menuItem.itemId,
                        itemName: menuItem.itemName,
                        quantity: 1,
                        price: menuItem.price,
                        totalPrice: menuItem.price,
                        shoppingCart: shoppingCart
                )
                shoppingCartItem.save(failOnError: true)
            }
        } catch (Exception e) {
            System.println("Failure to increment item in cart!")
            System.println("Error Msg:  " + e)
        }
    }

    def decreaseItemInCart(String shoppingCartId) {
        try {
            ShoppingCartItem shoppingCartItem = ShoppingCartItem.get(shoppingCartId)
            if (shoppingCartItem != null) {
                shoppingCartItem.quantity--;
                if (shoppingCartItem.quantity <= 0) {
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
