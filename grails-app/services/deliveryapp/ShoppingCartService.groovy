package deliveryapp

import grails.transaction.Transactional

@Transactional
class ShoppingCartService {

    def CustomerService

    def addItemToCart(String restaurantName, String menuItemName, String customerId) {
        try {

            Customer customer = CustomerService.getCustomer(customerId)
            ShoppingCart shoppingCart = ShoppingCart.findByCustomer(customer)

            Restaurant restaurant = Restaurant.findByRestName(restaurantName)
            MenuItem menuItem = MenuItem.findByItemNameAndRestaurant(menuItemName, restaurant)

            ShoppingCartItem shoppingCartItem = ShoppingCartItem.findByItemNameAndRestaurantAndShoppingCart(restaurant, menuItemName, shoppingCart)

            if (shoppingCartItem != null) {
                shoppingCartItem.quantity++;
            } else {
                shoppingCartItem = new ShoppingCartItem(
                        price: menuItem.price,
                        quantity: 1,
                        itemName: menuItem.itemName,
                        shoppingCart: shoppingCart,
                        restaurant: menuItem.restaurant
                )
            }

            shoppingCartItem.save(failOnError: true)

        } catch (Exception e) {
            System.println("Failure to add item to cart!")
            System.println("Error Msg:  " + e)
        }

    }

    def increaseQuantityItemFromCart(String shoppingCartItemId) {
        try {
            ShoppingCartItem shoppingCartItem = ShoppingCartItem.get(shoppingCartItemId)
            if (shoppingCartItem != null) {
                shoppingCartItem.quantity++;
                shoppingCartItem.save(failOnError: true)
            }
        } catch (Exception e) {

        }
    }

    def decreaseQuantityItemFromCart(String shoppingCartItemId) {
        try {
            ShoppingCartItem shoppingCartItem = ShoppingCartItem.get(shoppingCartItemId)
            if (shoppingCartItem != null) {
                shoppingCartItem.quantity--;
                shoppingCartItem.save(failOnError: true)
            }
        } catch (Exception e) {

        }
    }

    def removeItemFromCart(String shoppingCartItemId) {
        try {
            ShoppingCartItem shoppingCartItem = ShoppingCartItem.get(shoppingCartItemId)
            if (shoppingCartItem != null) {
                shoppingCartItem.delete()
            }
        } catch (Exception e) {
            System.println("Could not remove item from cart!")
            System.println("Error Msg:  " +  e)
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
