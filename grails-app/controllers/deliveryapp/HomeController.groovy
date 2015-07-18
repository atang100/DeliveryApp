package deliveryapp

class HomeController {

    def index() {

        List<Restaurant> mostPopularRestaurantList = Restaurant.findAllByCategory("most popular")
        List<Restaurant> restaurantList = Restaurant.findAll()

        render (view: "index", model: [mostPopularRestaurantList: mostPopularRestaurantList, restaurantList: restaurantList])
    }
}
