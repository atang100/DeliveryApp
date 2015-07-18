package deliveryapp

class HomeController {

    def index() {

        List<Restaurant> mostPopularRestaurantList = Restaurant.findAllByCategory("Most Popular")
        List<Restaurant> restaurantList = Restaurant.findAll()

        render (view: "index", model: [userType: userType, mostPopularRestaurantList: mostPopularRestaurantList, restaurantList: restaurantList])
    }
}
