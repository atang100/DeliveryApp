import deliveryapp.Restaurant
import deliveryapp.MenuItem

class BootStrap {

    def init = { servletContext ->
        Restaurant restaurant1 = new Restaurant(restName: "Lucky House", category: "most popular", description: "Lucky House has been serving Canadians for the last 25 years with real authentic chinese food from China.", phoneNumber: "613-713-3434", deliveryTime: 30);
        restaurant1.save(failOnError: true);
        Restaurant restaurant2 = new Restaurant(restName: "The Works", category: "most popular", description: "Famous for making famous custom burgers with ridiclous ingridients. ", phoneNumber: "613-654-2851", deliveryTime: 40);
        restaurant2.save(failOnError: true);
        Restaurant restaurant3 = new Restaurant(restName: "Five Guys", category: "most popular", description: "Voted once of the best burgers in the world that serves fresh food.", phoneNumber: "613-836-1235", deliveryTime: 50);
        restaurant3.save(failOnError: true);
        Restaurant restaurant4 = new Restaurant(restName: "Montana's", category: "most popular", description: "A Canadian restaurant that is famous for in-house smoked por ribs.", phoneNumber: "613-828-3234", deliveryTime: 30);
        restaurant4.save(failOnError: true);
        Restaurant restaurant5 = new Restaurant(restName: "Turkish Village", category: "most popular", description: "Started by Mr.Chan, turkish village has been known to serve the best turkish food in ottawa at affordable.", phoneNumber: "613-324-3464", deliveryTime: 25);
        restaurant5.save(failOnError: true);
        Restaurant restaurant6 = new Restaurant(restName: "Rangoli", category: "most popular", description: "Rangoli has been around for 20 years serving the people in Ottawa amazing indian food.", phoneNumber: "613-900-7763", deliveryTime: 35);
        restaurant6.save(failOnError: true);
        Restaurant restaurant7 = new Restaurant(restName: "Dantessa", category: "most popular", description: "Newly open, dantessa offers a wide variety of italian food.", phoneNumber: "613-789-7712", deliveryTime: 40);
        restaurant7.save(failOnError: true);
        Restaurant restaurant8 = new Restaurant(restName: "Yang Tze", category: "most popular", description: "Has been around for 30 years and is in the heart of china town and offers authentic chinese food. ", phoneNumber: "613-400-3156", deliveryTime: 60);
        restaurant8.save(failOnError: true);
        Restaurant restaurant9 = new Restaurant(restName: "Korean Palace", category: "normal", description: "Known for our karaoke and great food.", phoneNumber: "613-424-4020", deliveryTime: 35);
        restaurant9.save(failOnError: true);
        Restaurant restaurant10 = new Restaurant(restName: "168 Sushi", category: "normal", description: "We offer a wide variety of sushi and is known in many cities. ", phoneNumber: "613-424-4807", deliveryTime: 40);
        restaurant10.save(failOnError: true);
        Restaurant restaurant11 = new Restaurant(restName: "Shawarma Palace", category: "normal", description: "The most popular shawarma restaurant in all of ottawa. Known for huge portions.", phoneNumber: "613-319-9876", deliveryTime: 50);
        restaurant11.save(failOnError: true);
        Restaurant restaurant12 = new Restaurant(restName: "Aiyara Thai", category: "normal", description: "Offers exsquiste food and authetic vietnamese food. ", phoneNumber: "613-219-8788", deliveryTime: 30);
        restaurant12.save(failOnError: true);
        Restaurant restaurant13 = new Restaurant(restName: "Red Lobster", category: "normal", description: "A chain that's known across the country that serves fresh seafood.", phoneNumber: "613-883-3113", deliveryTime: 30);
        restaurant13.save(failOnError: true);
        Restaurant restaurant14 = new Restaurant(restName: "Caribbean Sizzler", category: "normal", description: "Get a taste of the Caribbean here from our chefs that cook authentic food.", phoneNumber: "613-316-4156", deliveryTime: 55);
        restaurant14.save(failOnError: true);
        Restaurant restaurant15 = new Restaurant(restName: "iPho", category: "normal", description: "iPho has been around for 20 years and is in the byward market that serves great vietnamese food.", phoneNumber: "613-824-3102", deliveryTime: 45);
        restaurant15.save(failOnError: true);
        Restaurant restaurant16 = new Restaurant(restName: "Kallisto Greek", category: "normal", description: "The most prestigious greek restaurant in all of Ottawa. Known for the wraps.", phoneNumber: "613-837-1618", deliveryTime: 40);
        restaurant16.save(failOnError: true);
        Restaurant restaurant17 = new Restaurant(restName: "Smoque Shack", category: "nothing", description: "Voted one of the best ribs in all of Ottawa 3 times in a row. Come enjoy our BBQ food.", phoneNumber: "613-210-3174", deliveryTime: 30);
        restaurant17.save(failOnError: true);
        Restaurant restaurant18 = new Restaurant(restName: "Black Cat", category: "nothing", description: "Voted number one restaurant in Ottawa and a must go.", phoneNumber: "613-225-2145", deliveryTime: 60);
        restaurant18.save(failOnError: true);
        Restaurant restaurant19 = new Restaurant(restName: "Cacao 70", category: "nothing", description: "Your destination for dessert when you are in need of sweets.", phoneNumber: "613-456-9631", deliveryTime: 60);
        restaurant19.save(failOnError: true);
        Restaurant restaurant20 = new Restaurant(restName: "Ichido Ramen", category: "nothing", description: "A taste of ramen from Japan is now here in Ottawa.", phoneNumber: "613-729-7985", deliveryTime: 50);
        restaurant20.save(failOnError: true);

        MenuItem menuItem1 = new MenuItem(itemId: "1", itemName: "Fried Won Ton", price: 5.00, description: "Deep fried won ton that comes with sweet and sour sauce.", type: "appetizer", restaurant: restaurant1);
        menuItem1.save(failOnError: true);
        MenuItem menuItem2 = new MenuItem(itemId: "2", itemName: "Won Ton Soup", price: 4.60, description: "Soup that includes dumplings, BBQ Pork, and vegetables.", type: "appetizer", restaurant:restaurant1);
        menuItem2.save(failOnError: true);
        MenuItem menuItem3 = new MenuItem(itemId: "3", itemName: "Hot and Sour Soup", price: 4.60, description: "Onion, egg, vegetable soup. ", type: "appetizer", restaurant:restaurant1);
        menuItem3.save(failOnError: true);
        MenuItem menuItem4 = new MenuItem(itemId: "4", itemName: "Fried Won Ton with Meat", price: 5.50, description: "Fried won ton with meat and comes with sweet and sour sauce.", type: "appetizer", restaurant:restaurant1);
        menuItem4.save(failOnError: true);
        MenuItem menuItem5 = new MenuItem(itemId: "5", itemName: "French Fries", price: 4.50, description: "Traditional normal french fries", type: "appetizer", restaurant:restaurant1);
        menuItem5.save(failOnError: true);

        //Mains
        MenuItem menuItem6 = new MenuItem(itemId: "6", itemName: "General Tao Chicken", price: 15.85, description: "Deep fried battered chicken cooked in our special sauce.", type: "mains", restaurant:restaurant1);
        menuItem6.save(failOnError: true);
        MenuItem menuItem7 = new MenuItem(itemId: "7", itemName: "Kung Pao Chicken", price: 13.60, description: "Chicken with vegetables with our special sauce. ", type: "mains", restaurant:restaurant1);
        menuItem7.save(failOnError: true);
        MenuItem menuItem8 = new MenuItem(itemId: "8", itemName: "Fried Flat Noodle with Beef and Black Bean Sauce", price: 14.00, description: "Rice noodles cooked with green peppers, onions, beef, and our black bean sauce. ", type: "mains", restaurant:restaurant1);
        menuItem8.save(failOnError: true);
        MenuItem menuItem9 = new MenuItem(itemId: "9", itemName: "Cantonese Chao Mien", price: 14.25, description: "Soft egg noodle with BBQ pork, chicken, shrimp, and vegetables. ", type: "mains", restaurant:restaurant1);
        menuItem9.save(failOnError: true);
        MenuItem menuItem10 = new MenuItem(itemId: "10", itemName: "Chicken Fried Rice", price: 7.80, description: "Chicken with rice.", type: "mains", restaurant:restaurant1);
        menuItem10.save(failOnError: true);
        MenuItem menuItem11 = new MenuItem(itemId: "11", itemName: "Yang Chow Fried Rice", price: 11.30, description: "Chicken, BBQ Pork, Shrimp and onions with rice.", type: "mains", restaurant:restaurant1);
        menuItem11.save(failOnError: true);
        MenuItem menuItem12 = new MenuItem(itemId: "12", itemName: "Almond Guy Din", price: 5.55, description: "Small pieces of chicken with celery, broccoli, cauliflower, and covered in almonds.", type: "mains", restaurant:restaurant1);
        menuItem12.save(failOnError: true);
        MenuItem menuItem13 = new MenuItem(itemId: "13", itemName: "Garlic Spare Ribs", price: 5.55, description: "Our ribs that are cooked in our special garlic sauce.", type: "mains", restaurant:restaurant1);
        menuItem13.save(failOnError: true);
        MenuItem menuItem14= new MenuItem(itemId: "14", itemName: "Shanghai Noodles", price: 5.55, description: "Long traditional shanghai style noodles that have BBQ pork, chicken and vegetables. ", type: "mains", restaurant:restaurant1);
        menuItem14.save(failOnError: true);
        MenuItem menuItem15= new MenuItem(itemId: "15", itemName: "Crispy Beef", price: 5.55, description: "Deep fried battered beef with onions and our special sauce. ", type: "mains", restaurant:restaurant1);
        menuItem15.save(failOnError: true);

        //Desserts
        MenuItem menuItem16 = new MenuItem(itemId: "16", itemName: "Almond Cookie", price: 1.00, description: "Cookie that’s made with almonds and dough.", type: "dessert", restaurant:restaurant1);
        menuItem16.save(failOnError: true);
        MenuItem menuItem17 = new MenuItem(itemId: "17", itemName: "Mango Ice Cream", price: 2.00, description: "Mango and ice cream.", type: "dessert", restaurant:restaurant1);
        menuItem17.save(failOnError: true);
        MenuItem menuItem18 = new MenuItem(itemId: "18", itemName: "Leechi Ice Cream", price: 2.00, description: "Leechi ice cream.", type: "dessert", restaurant:restaurant1);
        menuItem18.save(failOnError: true);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////-

                //Restaurant 2
        //Appetizers
        MenuItem menuItem19 = new MenuItem(itemId: "19", itemName: "French Fries", price: 7.00, description: "Deep fried potatoes.", type: "appetizer", restaurant:restaurant2);
        menuItem19.save(failOnError: true);
        MenuItem menuItem20 = new MenuItem(itemId: "20", itemName: "Onion Rings", price: 8.00, description: "Deep fried onion rings.", type: "appetizer", restaurant:restaurant2);
        menuItem20.save(failOnError: true);
        MenuItem menuItem21 = new MenuItem(itemId: "21", itemName: "Mac and Cheese", price: 7.00, description: "KD mac and cheese.", type: "appetizer", restaurant:restaurant2);
        menuItem21.save(failOnError: true);
        MenuItem menuItem22= new MenuItem(itemId: "22", itemName: "Sweet Potato Fries", price: 6.30, description: "Healthy sweet potato fries that are baked. ", type: "appetizer", restaurant:restaurant2);
        menuItem22.save(failOnError: true);
        MenuItem menuItem23 = new MenuItem(itemId: "23", itemName: "Tower of Rings", price: 10.00, description: "A tower of onion rings with our special sauce. Good for friends.", type: "appetizer", restaurant:restaurant2);
        menuItem23.save(failOnError: true);


        //Mains
        MenuItem menuItem24 = new MenuItem(itemId: "24", itemName: "Eggcellent Burger", price: 12.55, description: "Burger with egg, lettuce and tomato.", type: "mains", restaurant:restaurant2);
        menuItem24.save(failOnError: true);
        MenuItem menuItem25 = new MenuItem(itemId: "25", itemName: "Boring Burger", price: 11.00, description: "Your boring typical burger with just meat and lettuce.", type: "mains", restaurant:restaurant2);
        menuItem25.save(failOnError: true);
        MenuItem menuItem26 = new MenuItem(itemId: "26", itemName: "Boring 2 Burger", price: 13.00, description: "Boring burger with meat, lettuce, and cheese.", type: "mains", restaurant:restaurant2);
        menuItem26.save(failOnError: true);
        MenuItem menuItem27= new MenuItem(itemId: "27", itemName: "Halo Heaven", price: 14.20, description: "3 onion rings with your burger and grilled mushrooms.", type: "mains", restaurant:restaurant2);
        menuItem27.save(failOnError: true);
        MenuItem menuItem28 = new MenuItem(itemId: "28", itemName: "Peanut Butter Burger", price: 16.70, description: "Your burger with a bun smeared in peanut butter.", type: "mains", restaurant:restaurant2);
        menuItem28.save(failOnError: true);
        MenuItem menuItem29 = new MenuItem(itemId: "29", itemName: "KD Burger ", price: 16.89, description: "Burger covered with kraft dinner.", type: "mains", restaurant:restaurant2);
        menuItem29.save(failOnError: true);
        MenuItem menuItem30 = new MenuItem(itemId: "30", itemName: "Ask Burger", price: 11.40, description: "Your special burger that’s voted number 1. Comes with mushrooms, onions, mushrooms, tomato, cheese and bacon.", type: "mains", restaurant:restaurant2);
        menuItem30.save(failOnError: true);
        MenuItem menuItem31 = new MenuItem(itemId: "31", itemName: "Chicken Burger", price: 15.40, description: "Your choice of dressing with a chicken grilled or fried burger.", type: "mains", restaurant:restaurant2);
        menuItem31.save(failOnError: true);
        MenuItem menuItem32= new MenuItem(itemId: "32", itemName: "Lamb Burger", price: 13.84, description: "Your choice of dressings with a lamb burger. ", type: "mains", restaurant:restaurant2);
        menuItem32.save(failOnError: true);
        MenuItem menuItem33 = new MenuItem(itemId: "33", itemName: "Monster Burger", price: 19.47, description: "Chicken, lamb, and beef burger tower. Comes with all the dressings you desire", type: "mains", restaurant:restaurant2);
        menuItem33.save(failOnError: true);

        //Desserts
        MenuItem menuItem34 = new MenuItem(itemId: "34", itemName: "Mountain Sundae", price: 7.30, description: "A humongous sundae with chocolate and strawberry.", type: "dessert", restaurant:restaurant2);
        menuItem34.save(failOnError: true);
        MenuItem menuItem35 = new MenuItem(itemId: "35", itemName: "Milkshake Heaven", price: 8.50, description: "Chocolate and strawberry milkshake. ", type: "dessert", restaurant:restaurant2);
        menuItem35.save(failOnError: true);
        MenuItem menuItem36 = new MenuItem(itemId: "36", itemName: "Lava Cake", price: 9.00, description: "A lava cake with ice cream.", type: "dessert", restaurant:restaurant2);
        menuItem36.save(failOnError: true);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////-

                //Restaurant 3
        //Appetizers
        MenuItem menuItem37 = new MenuItem(itemId: "37", itemName: "French fries", price: 6.00, description: "Deep fried cut up potatoes. ", type: "appetizer", restaurant:restaurant3);
        menuItem37.save(failOnError: true);
        MenuItem menuItem38 = new MenuItem(itemId: "38", itemName: "Chili Fries", price: 8.00, description: "Fries smothered in our chili.", type: "appetizer", restaurant:restaurant3);
        menuItem38.save(failOnError: true);
        MenuItem menuItem39 = new MenuItem(itemId: "39", itemName: "Onion rings", price: 6.60, description: "Batter onion rings deep fried.", type: "appetizer", restaurant:restaurant3);
        menuItem39.save(failOnError: true);
        MenuItem menuItem40= new MenuItem(itemId: "40", itemName: "Monster Fries", price: 9.00, description: "Fries with our special monster sauce and onions and sour cream.", type: "appetizer", restaurant:restaurant3);
        menuItem40.save(failOnError: true);
        MenuItem menuItem41 = new MenuItem(itemId: "41", itemName: "Sweet Potato Fries", price: 7.00, description: "Baked small pieces of sweet potato.", type: "appetizer", restaurant:restaurant3);
        menuItem41.save(failOnError: true);

        //Mains
        MenuItem menuItem42 = new MenuItem(itemId: "42", itemName: "Little burger", price: 5.55, description: "Small burger only.", type: "mains", restaurant:restaurant3);
        menuItem42.save(failOnError: true);
        MenuItem menuItem43 = new MenuItem(itemId: "43", itemName: "Little cheeseburger", price: 6.55, description: "Traditional small cheese burger.", type: "mains", restaurant:restaurant3);
        menuItem43.save(failOnError: true);
        MenuItem menuItem44 = new MenuItem(itemId: "44", itemName: "Little bacon burger", price: 7.55, description: "Small bacon burger.", type: "mains", restaurant:restaurant3);
        menuItem44.save(failOnError: true);
        MenuItem menuItem45= new MenuItem(itemId: "45", itemName: "Little Bacon cheeseburger", price: 8.55, description: "Small cheese bacon burger.", type: "mains", restaurant:restaurant3);
        menuItem45.save(failOnError: true);
        MenuItem menuItem46 = new MenuItem(itemId: "46", itemName: "Big Burger", price: 9.55, description: "Big normal burger.", type: "mains", restaurant:restaurant3);
        menuItem46.save(failOnError: true);
        MenuItem menuItem47 = new MenuItem(itemId: "47", itemName: "Big cheeseburger", price: 10.55, description: "Big cheese burger", type: "mains", restaurant:restaurant3);
        menuItem47.save(failOnError: true);
        MenuItem menuItem48 = new MenuItem(itemId: "48", itemName: "Big bacon burger", price: 11.55, description: "Big bacon burger", type: "mains", restaurant:restaurant3);
        menuItem48.save(failOnError: true);
        MenuItem menuItem49 = new MenuItem(itemId: "49", itemName: "Big bacon cheeseburger ", price: 12.55, description: "Big bacon and cheeseburger", type: "mains", restaurant:restaurant3);
        menuItem49.save(failOnError: true);
        MenuItem menuItem50= new MenuItem(itemId: "50", itemName: "Hot dog", price: 8.55, description: "Hot a dog in a toast bun.", type: "mains", restaurant:restaurant3);
        menuItem50.save(failOnError: true);
        MenuItem menuItem51 = new MenuItem(itemId: "51", itemName: "Cheese and Bacon hot dog", price: 9.55, description: "Contains a small pieces of bacon with melted cheese.", type: "mains", restaurant:restaurant3);
        menuItem51.save(failOnError: true);

        //Desserts
        MenuItem menuItem52 = new MenuItem(itemId: "52", itemName: "Sundae Madness", price: 5.55, description: "Sundae with peanuts and brownie pieces", type: "dessert", restaurant:restaurant3);
        menuItem52.save(failOnError: true);
        MenuItem menuItem53 = new MenuItem(itemId: "53", itemName: "Double Trouble", price: 6.55, description: "Strawberry and chocolate brownies", type: "dessert", restaurant:restaurant3);
        menuItem53.save(failOnError: true);
        MenuItem menuItem54 = new MenuItem(itemId: "54", itemName: "Brownie Heaven", price: 7.55, description: "Caramel brownie with a lot of hazelnut.", type: "dessert", restaurant:restaurant3);
        menuItem54.save(failOnError: true);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////-

                //Restaurant 4 Montana's BBQ and Bar
        //Appetizers
        MenuItem menuItem55 = new MenuItem(itemId: "55", itemName: "Chorizo Nachos", price: 13.00, description: "Classic nachos layered with marble cheese, peppers, onions, and creamy cilantro sauce.", type: "appetizer", restaurant:restaurant4);
        menuItem55.save(failOnError: true);
        MenuItem menuItem56 = new MenuItem(itemId: "56", itemName: "Over-baked antojitos", price: 9.00, description: "A blend of cheese, onion, red pepper rolled up in a flour tortilla. ", type: "appetizer", restaurant:restaurant4);
        menuItem56.save(failOnError: true);
        MenuItem menuItem57 = new MenuItem(itemId: "57", itemName: "Kapow Shrimp", price: 9.40, description: "Deep fried shrimp and tossed in our famous KAPOW sauce", type: "appetizer", restaurant:restaurant4);
        menuItem57.save(failOnError: true);
        MenuItem menuItem58= new MenuItem(itemId: "58", itemName: "Smoked Meat Poutine", price: 10.25, description: "Fresh cut fries served with montreal style smoked meat", type: "appetizer", restaurant:restaurant4);
        menuItem58.save(failOnError: true);
        MenuItem menuItem59 = new MenuItem(itemId: "59", itemName: "Bamboo", price: 13.00, description: "Fried pickles with a dip.", type: "appetizer", restaurant:restaurant4);
        menuItem59.save(failOnError: true);

        //Mains
        MenuItem menuItem60 = new MenuItem(itemId: "60", itemName: "Specialty Ribs", price: 15.55, description: "Ribs grilled to perfection topped with our special house BBQ sauce", type: "mains", restaurant:restaurant4);
        menuItem60.save(failOnError: true);
        MenuItem menuItem61 = new MenuItem(itemId: "61", itemName: "Grilled Chicken", price: 12.20, description: "Grilled chicken with our lemon sauce.", type: "mains", restaurant:restaurant4);
        menuItem61.save(failOnError: true);
        MenuItem menuItem62 = new MenuItem(itemId: "62", itemName: "Beef and Ribs", price: 14.00, description: "Beef ribs.", type: "mains", restaurant:restaurant4);
        menuItem62.save(failOnError: true);
        MenuItem menuItem63= new MenuItem(itemId: "63", itemName: "Peanut butter Burger", price: 9.90, description: "Your burger with a bun smeared in peanut butter.", type: "mains", restaurant:restaurant4);
        menuItem63.save(failOnError: true);
        MenuItem menuItem64 = new MenuItem(itemId: "64", itemName: "KD Burger", price: 13.89, description: "Burger Covered with kraft dinner.", type: "mains", restaurant:restaurant4);
        menuItem64.save(failOnError: true);
        MenuItem menuItem65 = new MenuItem(itemId: "65", itemName: "Ask Burger", price: 14.00, description: "Your special burger that’s voted number 1. Comes with mushrooms, onions, mushrooms, tomato, cheese and bacon.", type: "mains", restaurant:restaurant4);
        menuItem65.save(failOnError: true);
        MenuItem menuItem66 = new MenuItem(itemId: "66", itemName: "Chicken Burger", price: 14.79, description: "Your choice of dressing with a chiken grilled or fried burger.", type: "mains", restaurant:restaurant4);
        menuItem66.save(failOnError: true);
        MenuItem menuItem67 = new MenuItem(itemId: "67", itemName: "Lamb Burger", price: 15.00, description: "Your choice of dressings with a lamb burger. ", type: "mains", restaurant:restaurant4);
        menuItem67.save(failOnError: true);
        MenuItem menuItem68= new MenuItem(itemId: "68", itemName: "Monster Burger", price: 15.67, description: "Chicken, lamb, and beef burger tower. Comes with all the ", type: "mains", restaurant:restaurant4);
        menuItem68.save(failOnError: true);
        MenuItem menuItem69 = new MenuItem(itemId: "69", itemName: "Rice and Friends", price: 14.70, description: "Rice with chicken, lamb, and steak.", type: "mains", restaurant:restaurant4);
        menuItem69.save(failOnError: true);

        //Desserts
        MenuItem menuItem70 = new MenuItem(itemId: "70", itemName: "Cheese Cake", price: 8.55, description: "Delicious piece of cheesecake from the farthest mountains.", type: "dessert", restaurant:restaurant4);
        menuItem70.save(failOnError: true);
        MenuItem menuItem71 = new MenuItem(itemId: "71", itemName: "Lava Form", price: 9.55, description: "A new take on lava cake covered with sundaes.", type: "dessert", restaurant:restaurant4);
        menuItem71.save(failOnError: true);
        MenuItem menuItem72 = new MenuItem(itemId: "72", itemName: "Peanut Couture.", price: 11.55, description: "Peanut butter with lava cake and sundae. ", type: "dessert", restaurant:restaurant4);
        menuItem72.save(failOnError: true);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////-
                //Restaurant 5
        //Appetizers
        MenuItem menuItem73 = new MenuItem(itemId: "73", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant5);
        menuItem73.save(failOnError: true);
        MenuItem menuItem74 = new MenuItem(itemId: "74", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant5);
        menuItem74.save(failOnError: true);
        MenuItem menuItem75 = new MenuItem(itemId: "75", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant5);
        menuItem75.save(failOnError: true);
        MenuItem menuItem76= new MenuItem(itemId: "76", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant5);
        menuItem76.save(failOnError: true);
        MenuItem menuItem77 = new MenuItem(itemId: "77", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant5);
        menuItem77.save(failOnError: true);

        //Mains
        MenuItem menuItem78 = new MenuItem(itemId: "78", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant5);
        menuItem78.save(failOnError: true);
        MenuItem menuItem79 = new MenuItem(itemId: "79", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant5);
        menuItem79.save(failOnError: true);
        MenuItem menuItem80 = new MenuItem(itemId: "80", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant5);
        menuItem80.save(failOnError: true);
        MenuItem menuItem81= new MenuItem(itemId: "81", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant5);
        menuItem81.save(failOnError: true);
        MenuItem menuItem82 = new MenuItem(itemId: "82", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant5);
        menuItem82.save(failOnError: true);
        MenuItem menuItem83 = new MenuItem(itemId: "83", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant5);
        menuItem83.save(failOnError: true);
        MenuItem menuItem84 = new MenuItem(itemId: "84", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant5);
        menuItem84.save(failOnError: true);
        MenuItem menuItem85 = new MenuItem(itemId: "85", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant5);
        menuItem85.save(failOnError: true);
        MenuItem menuItem86= new MenuItem(itemId: "86", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant5);
        menuItem86.save(failOnError: true);
        MenuItem menuItem87 = new MenuItem(itemId: "87", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant5);
        menuItem87.save(failOnError: true);

        //Desserts
        MenuItem menuItem88 = new MenuItem(itemId: "88", itemName: "cookie", price: 5.55, description: "fooddescription", type: "dessert", restaurant:restaurant5);
        menuItem88.save(failOnError: true);
        MenuItem menuItem89 = new MenuItem(itemId: "89", itemName: "cookie", price: 5.55, description: "fooddescription", type: "dessert", restaurant:restaurant5);
        menuItem89.save(failOnError: true);
        MenuItem menuItem90 = new MenuItem(itemId: "90", itemName: "cookie", price: 5.55, description: "fooddescription", type: "dessert", restaurant:restaurant5);
        menuItem90.save(failOnError: true);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////-
                //Restaurant 6
        //Appetizers
        MenuItem menuItem91 = new MenuItem(itemId: "91", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant6);
        menuItem91.save(failOnError: true);
        MenuItem menuItem92 = new MenuItem(itemId: "92", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant6);
        menuItem92.save(failOnError: true);
        MenuItem menuItem93 = new MenuItem(itemId: "93", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant6);
        menuItem93.save(failOnError: true);
        MenuItem menuItem94= new MenuItem(itemId: "94", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant6);
        menuItem94.save(failOnError: true);
        MenuItem menuItem95 = new MenuItem(itemId: "95", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant6);
        menuItem95.save(failOnError: true);

        //Mains
        MenuItem menuItem96 = new MenuItem(itemId: "96", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant6);
        menuItem96.save(failOnError: true);
        MenuItem menuItem97 = new MenuItem(itemId: "97", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant6);
        menuItem97.save(failOnError: true);
        MenuItem menuItem98 = new MenuItem(itemId: "98", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant6);
        menuItem98.save(failOnError: true);
        MenuItem menuItem99= new MenuItem(itemId: "99", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant6);
        menuItem99.save(failOnError: true);
        MenuItem menuItem100 = new MenuItem(itemId: "100", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant6);
        menuItem100.save(failOnError: true);
        MenuItem menuItem101 = new MenuItem(itemId: "101", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant6);
        menuItem101.save(failOnError: true);
        MenuItem menuItem102 = new MenuItem(itemId: "102", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant6);
        menuItem102.save(failOnError: true);
        MenuItem menuItem103 = new MenuItem(itemId: "103", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant6);
        menuItem103.save(failOnError: true);
        MenuItem menuItem104= new MenuItem(itemId: "104", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant6);
        menuItem104.save(failOnError: true);
        MenuItem menuItem105 = new MenuItem(itemId: "105", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant6);
        menuItem105.save(failOnError: true);

        //Desserts
        MenuItem menuItem106 = new MenuItem(itemId: "106", itemName: "cookie", price: 5.55, description: "fooddescription", type: "dessert", restaurant:restaurant6);
        menuItem106.save(failOnError: true);
        MenuItem menuItem107 = new MenuItem(itemId: "107", itemName: "cookie", price: 5.55, description: "fooddescription", type: "dessert", restaurant:restaurant6);
        menuItem107.save(failOnError: true);
        MenuItem menuItem108 = new MenuItem(itemId: "108", itemName: "cookie", price: 5.55, description: "fooddescription", type: "dessert", restaurant:restaurant6);
        menuItem108.save(failOnError: true);

        //Restaurant 7
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////-
                //Appetizers
        MenuItem menuItem109 = new MenuItem(itemId: "109", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant7);
        menuItem109.save(failOnError: true);
        MenuItem menuItem110 = new MenuItem(itemId: "110", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant7);
        menuItem110.save(failOnError: true);
        MenuItem menuItem111 = new MenuItem(itemId: "111", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant7);
        menuItem111.save(failOnError: true);
        MenuItem menuItem112= new MenuItem(itemId: "112", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant7);
        menuItem112.save(failOnError: true);
        MenuItem menuItem113 = new MenuItem(itemId: "113", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant7);
        menuItem113.save(failOnError: true);

        //Mains
        MenuItem menuItem114 = new MenuItem(itemId: "114", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant7);
        menuItem114.save(failOnError: true);
        MenuItem menuItem115 = new MenuItem(itemId: "115", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant7);
        menuItem115.save(failOnError: true);
        MenuItem menuItem116 = new MenuItem(itemId: "116", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant7);
        menuItem116.save(failOnError: true);
        MenuItem menuItem117= new MenuItem(itemId: "117", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant7);
        menuItem117.save(failOnError: true);
        MenuItem menuItem118 = new MenuItem(itemId: "118", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant7);
        menuItem118.save(failOnError: true);
        MenuItem menuItem119 = new MenuItem(itemId: "119", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant7);
        menuItem119.save(failOnError: true);
        MenuItem menuItem120 = new MenuItem(itemId: "120", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant7);
        menuItem120.save(failOnError: true);
        MenuItem menuItem121 = new MenuItem(itemId: "121", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant7);
        menuItem121.save(failOnError: true);
        MenuItem menuItem122= new MenuItem(itemId: "122", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant7);
        menuItem122.save(failOnError: true);
        MenuItem menuItem123 = new MenuItem(itemId: "123", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant7);
        menuItem123.save(failOnError: true);

        //Desserts
        MenuItem menuItem124 = new MenuItem(itemId: "124", itemName: "cookie", price: 5.55, description: "fooddescription", type: "dessert", restaurant:restaurant7);
        menuItem124.save(failOnError: true);
        MenuItem menuItem125 = new MenuItem(itemId: "125", itemName: "cookie", price: 5.55, description: "fooddescription", type: "dessert", restaurant:restaurant7);
        menuItem125.save(failOnError: true);
        MenuItem menuItem126 = new MenuItem(itemId: "126", itemName: "cookie", price: 5.55, description: "fooddescription", type: "dessert", restaurant:restaurant7);




        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////-
                // Restaurant 8
        //Appetizers
        MenuItem menuItem127 = new MenuItem(itemId: "127", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant8);
        menuItem127.save(failOnError: true);
        MenuItem menuItem128 = new MenuItem(itemId: "128", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant8);
        menuItem128.save(failOnError: true);
        MenuItem menuItem129 = new MenuItem(itemId: "129", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant8);
        menuItem129.save(failOnError: true);
        MenuItem menuItem130= new MenuItem(itemId: "130", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant8);
        menuItem130.save(failOnError: true);
        MenuItem menuItem131 = new MenuItem(itemId: "131", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant8);
        menuItem131.save(failOnError: true);

        //Mains
        MenuItem menuItem132 = new MenuItem(itemId: "132", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant8);
        menuItem132.save(failOnError: true);
        MenuItem menuItem133 = new MenuItem(itemId: "133", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant8);
        menuItem133.save(failOnError: true);
        MenuItem menuItem134 = new MenuItem(itemId: "134", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant8);
        menuItem134.save(failOnError: true);
        MenuItem menuItem135= new MenuItem(itemId: "135", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant8);
        menuItem135.save(failOnError: true);
        MenuItem menuItem136 = new MenuItem(itemId: "136", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant8);
        menuItem136.save(failOnError: true);
        MenuItem menuItem137 = new MenuItem(itemId: "137", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant8);
        menuItem137.save(failOnError: true);
        MenuItem menuItem138 = new MenuItem(itemId: "138", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant8);
        menuItem138.save(failOnError: true);
        MenuItem menuItem139 = new MenuItem(itemId: "139", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant8);
        menuItem139.save(failOnError: true);
        MenuItem menuItem140= new MenuItem(itemId: "140", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant8);
        menuItem140.save(failOnError: true);
        MenuItem menuItem141 = new MenuItem(itemId: "141", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant8);
        menuItem141.save(failOnError: true);

        //Desserts
        MenuItem menuItem142 = new MenuItem(itemId: "142", itemName: "cookie", price: 5.55, description: "fooddescription", type: "dessert", restaurant:restaurant8);
        menuItem142.save(failOnError: true);
        MenuItem menuItem143 = new MenuItem(itemId: "143", itemName: "cookie", price: 5.55, description: "fooddescription", type: "dessert", restaurant:restaurant8);
        menuItem143.save(failOnError: true);
        MenuItem menuItem144 = new MenuItem(itemId: "144", itemName: "cookie", price: 5.55, description: "fooddescription", type: "dessert", restaurant:restaurant8);
        menuItem144.save(failOnError: true);




        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////-
                // Restaurant 9
        //Appetizers
        MenuItem menuItem145 = new MenuItem(itemId: "145", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant9);
        menuItem145.save(failOnError: true);
        MenuItem menuItem146 = new MenuItem(itemId: "146", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant9);
        menuItem146.save(failOnError: true);
        MenuItem menuItem147 = new MenuItem(itemId: "147", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant9);
        menuItem147.save(failOnError: true);
        MenuItem menuItem148= new MenuItem(itemId: "148", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant9);
        menuItem148.save(failOnError: true);
        MenuItem menuItem149 = new MenuItem(itemId: "149", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant9);
        menuItem149.save(failOnError: true);

        //Mains
        MenuItem menuItem150 = new MenuItem(itemId: "150", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant9);
        menuItem150.save(failOnError: true);
        MenuItem menuItem151 = new MenuItem(itemId: "151", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant9);
        menuItem151.save(failOnError: true);
        MenuItem menuItem152 = new MenuItem(itemId: "152", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant9);
        menuItem152.save(failOnError: true);
        MenuItem menuItem153= new MenuItem(itemId: "153", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant9);
        menuItem153.save(failOnError: true);
        MenuItem menuItem154 = new MenuItem(itemId: "154", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant9);
        menuItem154.save(failOnError: true);
        MenuItem menuItem155 = new MenuItem(itemId: "155", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant9);
        menuItem155.save(failOnError: true);
        MenuItem menuItem156 = new MenuItem(itemId: "156", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant9);
        menuItem156.save(failOnError: true);
        MenuItem menuItem157 = new MenuItem(itemId: "157", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant9);
        menuItem157.save(failOnError: true);
        MenuItem menuItem158= new MenuItem(itemId: "158", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant9);
        menuItem158.save(failOnError: true);
        MenuItem menuItem159 = new MenuItem(itemId: "159", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant9);
        menuItem159.save(failOnError: true);

        //Desserts
        MenuItem menuItem160 = new MenuItem(itemId: "160", itemName: "cookie", price: 5.55, description: "fooddescription", type: "dessert", restaurant:restaurant9);
        menuItem160.save(failOnError: true);
        MenuItem menuItem161 = new MenuItem(itemId: "161", itemName: "cookie", price: 5.55, description: "fooddescription", type: "dessert", restaurant:restaurant9);
        menuItem161.save(failOnError: true);
        MenuItem menuItem162 = new MenuItem(itemId: "162", itemName: "cookie", price: 5.55, description: "fooddescription", type: "dessert", restaurant:restaurant9);
        menuItem162.save(failOnError: true);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////-
                // Restaurant 10
        //Appetizers
        MenuItem menuItem163 = new MenuItem(itemId: "163", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant10);
        menuItem163.save(failOnError: true);
        MenuItem menuItem164 = new MenuItem(itemId: "164", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant10);
        menuItem164.save(failOnError: true);
        MenuItem menuItem165 = new MenuItem(itemId: "165", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant10);
        menuItem165.save(failOnError: true);
        MenuItem menuItem166= new MenuItem(itemId: "166", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant10);
        menuItem166.save(failOnError: true);
        MenuItem menuItem167 = new MenuItem(itemId: "167", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant10);
        menuItem167.save(failOnError: true);

        //Mains
        MenuItem menuItem168 = new MenuItem(itemId: "168", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant10);
        menuItem168.save(failOnError: true);
        MenuItem menuItem169 = new MenuItem(itemId: "169", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant10);
        menuItem169.save(failOnError: true);
        MenuItem menuItem170 = new MenuItem(itemId: "170", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant10);
        menuItem170.save(failOnError: true);
        MenuItem menuItem171= new MenuItem(itemId: "171", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant10);
        menuItem171.save(failOnError: true);
        MenuItem menuItem172 = new MenuItem(itemId: "172", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant10);
        menuItem172.save(failOnError: true);
        MenuItem menuItem173 = new MenuItem(itemId: "173", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant10);
        menuItem173.save(failOnError: true);
        MenuItem menuItem174 = new MenuItem(itemId: "174", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant10);
        menuItem174.save(failOnError: true);
        MenuItem menuItem175 = new MenuItem(itemId: "175", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant10);
        menuItem175.save(failOnError: true);
        MenuItem menuItem176= new MenuItem(itemId: "176", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant10);
        menuItem176.save(failOnError: true);
        MenuItem menuItem177 = new MenuItem(itemId: "177", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant10);
        menuItem177.save(failOnError: true);

        //Desserts
        MenuItem menuItem178 = new MenuItem(itemId: "178", itemName: "cookie", price: 5.55, description: "fooddescription", type: "dessert", restaurant:restaurant10);
        menuItem178.save(failOnError: true);
        MenuItem menuItem179 = new MenuItem(itemId: "179", itemName: "cookie", price: 5.55, description: "fooddescription", type: "dessert", restaurant:restaurant10);
        menuItem179.save(failOnError: true);
        MenuItem menuItem180 = new MenuItem(itemId: "180", itemName: "cookie", price: 5.55, description: "fooddescription", type: "dessert", restaurant:restaurant10);
        menuItem180.save(failOnError: true);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////-
                // Restaurant 11
        //Appetizers
        MenuItem menuItem181 = new MenuItem(itemId: "181", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant11);
        menuItem181.save(failOnError: true);
        MenuItem menuItem182 = new MenuItem(itemId: "182", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant11);
        menuItem182.save(failOnError: true);
        MenuItem menuItem183 = new MenuItem(itemId: "183", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant11);
        menuItem183.save(failOnError: true);
        MenuItem menuItem184= new MenuItem(itemId: "184", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant11);
        menuItem184.save(failOnError: true);
        MenuItem menuItem185 = new MenuItem(itemId: "185", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant11);
        menuItem185.save(failOnError: true);

        //Mains
        MenuItem menuItem186 = new MenuItem(itemId: "186", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant11);
        menuItem186.save(failOnError: true);
        MenuItem menuItem187 = new MenuItem(itemId: "187", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant11);
        menuItem187.save(failOnError: true);
        MenuItem menuItem188 = new MenuItem(itemId: "188", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant11);
        menuItem188.save(failOnError: true);
        MenuItem menuItem189= new MenuItem(itemId: "189", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant11);
        menuItem189.save(failOnError: true);
        MenuItem menuItem190 = new MenuItem(itemId: "190", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant11);
        menuItem190.save(failOnError: true);
        MenuItem menuItem191 = new MenuItem(itemId: "191", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant11);
        menuItem191.save(failOnError: true);
        MenuItem menuItem192 = new MenuItem(itemId: "192", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant11);
        menuItem192.save(failOnError: true);
        MenuItem menuItem193 = new MenuItem(itemId: "193", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant11);
        menuItem193.save(failOnError: true);
        MenuItem menuItem194= new MenuItem(itemId: "194" , itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant11);
        menuItem194.save(failOnError: true);
        MenuItem menuItem195 = new MenuItem(itemId: "195", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant11);
        menuItem195.save(failOnError: true);

        //Desserts
        MenuItem menuItem196 = new MenuItem(itemId: "196", itemName: "cookie", price: 5.55, description: "fooddescription", type: "dessert", restaurant:restaurant11);
        menuItem178.save(failOnError: true);
        MenuItem menuItem197 = new MenuItem(itemId: "197", itemName: "cookie", price: 5.55, description: "fooddescription", type: "dessert", restaurant:restaurant11);
        menuItem179.save(failOnError: true);
        MenuItem menuItem198 = new MenuItem(itemId: "198", itemName: "cookie", price: 5.55, description: "fooddescription", type: "dessert", restaurant:restaurant11);
        menuItem180.save(failOnError: true);


        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////-
                // Restaurant 12
        //Appetizers
        MenuItem menuItem199 = new MenuItem(itemId: "199", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant12);
        menuItem199.save(failOnError: true);
        MenuItem menuItem200 = new MenuItem(itemId: "200", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant12);
        menuItem200.save(failOnError: true);
        MenuItem menuItem201 = new MenuItem(itemId: "201", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant12);
        menuItem201.save(failOnError: true);
        MenuItem menuItem202= new MenuItem(itemId: "202", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant12);
        menuItem202.save(failOnError: true);
        MenuItem menuItem203 = new MenuItem(itemId: "203", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant12);
        menuItem203.save(failOnError: true);

        //Mains
        MenuItem menuItem204 = new MenuItem(itemId: "204", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant12);
        menuItem204.save(failOnError: true);
        MenuItem menuItem205 = new MenuItem(itemId: "205", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant12);
        menuItem205.save(failOnError: true);
        MenuItem menuItem206 = new MenuItem(itemId: "206", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant12);
        menuItem206.save(failOnError: true);
        MenuItem menuItem207= new MenuItem(itemId: "207", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant12);
        menuItem207.save(failOnError: true);
        MenuItem menuItem208 = new MenuItem(itemId: "208", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant12);
        menuItem208.save(failOnError: true);
        MenuItem menuItem209 = new MenuItem(itemId: "209", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant12);
        menuItem209.save(failOnError: true);
        MenuItem menuItem210 = new MenuItem(itemId: "210", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant12);
        menuItem210.save(failOnError: true);
        MenuItem menuItem211 = new MenuItem(itemId: "211", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant12);
        menuItem211.save(failOnError: true);
        MenuItem menuItem212= new MenuItem(itemId: "212" , itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant12);
        menuItem212.save(failOnError: true);
        MenuItem menuItem213 = new MenuItem(itemId: "213", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant12);
        menuItem213.save(failOnError: true);

        //Desserts
        MenuItem menuItem214 = new MenuItem(itemId: "214", itemName: "cookie", price: 5.55, description: "fooddescription", type: "dessert", restaurant:restaurant12);
        menuItem214.save(failOnError: true);
        MenuItem menuItem215 = new MenuItem(itemId: "215", itemName: "cookie", price: 5.55, description: "fooddescription", type: "dessert", restaurant:restaurant12);
        menuItem215.save(failOnError: true);
        MenuItem menuItem216 = new MenuItem(itemId: "216", itemName: "cookie", price: 5.55, description: "fooddescription", type: "dessert", restaurant:restaurant12);
        menuItem216.save(failOnError: true);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////-
                // Restaurant 13
        //Appetizers
        MenuItem menuItem217 = new MenuItem(itemId: "217", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant13);
        menuItem217.save(failOnError: true);
        MenuItem menuItem218 = new MenuItem(itemId: "218", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant13);
        menuItem218.save(failOnError: true);
        MenuItem menuItem219 = new MenuItem(itemId: "219", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant13);
        menuItem219.save(failOnError: true);
        MenuItem menuItem220= new MenuItem(itemId: "220", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant13);
        menuItem220.save(failOnError: true);
        MenuItem menuItem221 = new MenuItem(itemId: "221", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant13);
        menuItem221.save(failOnError: true);

        //Mains
        MenuItem menuItem222 = new MenuItem(itemId: "222", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant13);
        menuItem222.save(failOnError: true);
        MenuItem menuItem223 = new MenuItem(itemId: "223", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant13);
        menuItem223.save(failOnError: true);
        MenuItem menuItem224 = new MenuItem(itemId: "224", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant13);
        menuItem224.save(failOnError: true);
        MenuItem menuItem225= new MenuItem(itemId: "225", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant13);
        menuItem225.save(failOnError: true);
        MenuItem menuItem226 = new MenuItem(itemId: "226", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant13);
        menuItem226.save(failOnError: true);
        MenuItem menuItem227 = new MenuItem(itemId: "227", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant13);
        menuItem227.save(failOnError: true);
        MenuItem menuItem228 = new MenuItem(itemId: "228", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant13);
        menuItem228.save(failOnError: true);
        MenuItem menuItem229 = new MenuItem(itemId: "229", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant13);
        menuItem229.save(failOnError: true);
        MenuItem menuItem230= new MenuItem(itemId: "230" , itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant13);
        menuItem230.save(failOnError: true);
        MenuItem menuItem231 = new MenuItem(itemId: "231", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant13);
        menuItem231.save(failOnError: true);

        //Desserts
        MenuItem menuItem232 = new MenuItem(itemId: "232", itemName: "cookie", price: 5.55, description: "fooddescription", type: "dessert", restaurant:restaurant13);
        menuItem232.save(failOnError: true);
        MenuItem menuItem233 = new MenuItem(itemId: "233", itemName: "cookie", price: 5.55, description: "fooddescription", type: "dessert", restaurant:restaurant13);
        menuItem233.save(failOnError: true);
        MenuItem menuItem234 = new MenuItem(itemId: "234", itemName: "cookie", price: 5.55, description: "fooddescription", type: "dessert", restaurant:restaurant13);
        menuItem234.save(failOnError: true);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////-
                // Restaurant 14
        //Appetizers
        MenuItem menuItem235 = new MenuItem(itemId: "235", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant14);
        menuItem235.save(failOnError: true);
        MenuItem menuItem236 = new MenuItem(itemId: "236", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant14);
        menuItem236.save(failOnError: true);
        MenuItem menuItem237 = new MenuItem(itemId: "237", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant14);
        menuItem237.save(failOnError: true);
        MenuItem menuItem238= new MenuItem(itemId: "238", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant14);
        menuItem238.save(failOnError: true);
        MenuItem menuItem239 = new MenuItem(itemId: "239", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant14);
        menuItem239.save(failOnError: true);

        //Mains
        MenuItem menuItem240 = new MenuItem(itemId: "240", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant14);
        menuItem240.save(failOnError: true);
        MenuItem menuItem241 = new MenuItem(itemId: "241", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant14);
        menuItem241.save(failOnError: true);
        MenuItem menuItem242 = new MenuItem(itemId: "242", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant14);
        menuItem242.save(failOnError: true);
        MenuItem menuItem243= new MenuItem(itemId: "243", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant14);
        menuItem243.save(failOnError: true);
        MenuItem menuItem244 = new MenuItem(itemId: "244", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant14);
        menuItem244.save(failOnError: true);
        MenuItem menuItem245 = new MenuItem(itemId: "245", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant14);
        menuItem245.save(failOnError: true);
        MenuItem menuItem246 = new MenuItem(itemId: "246", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant14);
        menuItem246.save(failOnError: true);
        MenuItem menuItem247 = new MenuItem(itemId: "247", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant14);
        menuItem247.save(failOnError: true);
        MenuItem menuItem248= new MenuItem(itemId: "248" , itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant14);
        menuItem248.save(failOnError: true);
        MenuItem menuItem249 = new MenuItem(itemId: "249", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant14);
        menuItem249.save(failOnError: true);

        //Desserts
        MenuItem menuItem250 = new MenuItem(itemId: "250", itemName: "cookie", price: 5.55, description: "fooddescription", type: "dessert", restaurant:restaurant14);
        menuItem250.save(failOnError: true);
        MenuItem menuItem251 = new MenuItem(itemId: "251", itemName: "cookie", price: 5.55, description: "fooddescription", type: "dessert", restaurant:restaurant14);
        menuItem251.save(failOnError: true);
        MenuItem menuItem252 = new MenuItem(itemId: "252", itemName: "cookie", price: 5.55, description: "fooddescription", type: "dessert", restaurant:restaurant14);
        menuItem252.save(failOnError: true);


        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////-

                // Restaurant 15
        //Appetizers
        MenuItem menuItem253 = new MenuItem(itemId: "253", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant15);
        menuItem253.save(failOnError: true);
        MenuItem menuItem254 = new MenuItem(itemId: "254", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant15);
        menuItem254.save(failOnError: true);
        MenuItem menuItem255 = new MenuItem(itemId: "255", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant15);
        menuItem255.save(failOnError: true);
        MenuItem menuItem256= new MenuItem(itemId: "256", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant15);
        menuItem256.save(failOnError: true);
        MenuItem menuItem257 = new MenuItem(itemId: "257", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant15);
        menuItem257.save(failOnError: true);

        //Mains
        MenuItem menuItem258 = new MenuItem(itemId: "258", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant15);
        menuItem258.save(failOnError: true);
        MenuItem menuItem259 = new MenuItem(itemId: "259", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant15);
        menuItem259.save(failOnError: true);
        MenuItem menuItem260 = new MenuItem(itemId: "260", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant15);
        menuItem260.save(failOnError: true);
        MenuItem menuItem261= new MenuItem(itemId: "261", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant15);
        menuItem261.save(failOnError: true);
        MenuItem menuItem262 = new MenuItem(itemId: "262", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant15);
        menuItem262.save(failOnError: true);
        MenuItem menuItem263 = new MenuItem(itemId: "263", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant15);
        menuItem263.save(failOnError: true);
        MenuItem menuItem264 = new MenuItem(itemId: "264", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant15);
        menuItem264.save(failOnError: true);
        MenuItem menuItem265 = new MenuItem(itemId: "265", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant15);
        menuItem265.save(failOnError: true);
        MenuItem menuItem266= new MenuItem(itemId: "266" , itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant15);
        menuItem266.save(failOnError: true);
        MenuItem menuItem267 = new MenuItem(itemId: "267", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant15);
        menuItem267.save(failOnError: true);

        //Desserts
        MenuItem menuItem268 = new MenuItem(itemId: "268", itemName: "cookie", price: 5.55, description: "fooddescription", type: "dessert", restaurant:restaurant15);
        menuItem268.save(failOnError: true);
        MenuItem menuItem269 = new MenuItem(itemId: "269", itemName: "cookie", price: 5.55, description: "fooddescription", type: "dessert", restaurant:restaurant15);
        menuItem269.save(failOnError: true);
        MenuItem menuItem270 = new MenuItem(itemId: "270", itemName: "cookie", price: 5.55, description: "fooddescription", type: "dessert", restaurant:restaurant15);
        menuItem267.save(failOnError: true);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////-


                // Restaurant 16
        //Appetizers
        MenuItem menuItem271 = new MenuItem(itemId: "271", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant16);
        menuItem271.save(failOnError: true);
        MenuItem menuItem272 = new MenuItem(itemId: "272", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant16);
        menuItem272.save(failOnError: true);
        MenuItem menuItem273 = new MenuItem(itemId: "273", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant16);
        menuItem273.save(failOnError: true);
        MenuItem menuItem274= new MenuItem(itemId: "274", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant16);
        menuItem274.save(failOnError: true);
        MenuItem menuItem275 = new MenuItem(itemId: "275", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant16);
        menuItem275.save(failOnError: true);

        //Mains
        MenuItem menuItem276 = new MenuItem(itemId: "276", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant16);
        menuItem276.save(failOnError: true);
        MenuItem menuItem277 = new MenuItem(itemId: "277", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant16);
        menuItem277.save(failOnError: true);
        MenuItem menuItem278 = new MenuItem(itemId: "278", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant16);
        menuItem278.save(failOnError: true);
        MenuItem menuItem279= new MenuItem(itemId: "279", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant16);
        menuItem279.save(failOnError: true);
        MenuItem menuItem280 = new MenuItem(itemId: "280", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant16);
        menuItem280.save(failOnError: true);
        MenuItem menuItem281 = new MenuItem(itemId: "281", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant16);
        menuItem281.save(failOnError: true);
        MenuItem menuItem282 = new MenuItem(itemId: "282", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant16);
        menuItem282.save(failOnError: true);
        MenuItem menuItem283 = new MenuItem(itemId: "283", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant16);
        menuItem283.save(failOnError: true);
        MenuItem menuItem284= new MenuItem(itemId: "284" , itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant16);
        menuItem284.save(failOnError: true);
        MenuItem menuItem285 = new MenuItem(itemId: "285", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant16);
        menuItem285.save(failOnError: true);

        //Desserts
        MenuItem menuItem286 = new MenuItem(itemId: "286", itemName: "cookie", price: 5.55, description: "fooddescription", type: "dessert", restaurant:restaurant16);
        menuItem286.save(failOnError: true);
        MenuItem menuItem287 = new MenuItem(itemId: "287", itemName: "cookie", price: 5.55, description: "fooddescription", type: "dessert", restaurant:restaurant16);
        menuItem287.save(failOnError: true);
        MenuItem menuItem288 = new MenuItem(itemId: "288", itemName: "cookie", price: 5.55, description: "fooddescription", type: "dessert", restaurant:restaurant16);
        menuItem288.save(failOnError: true);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////-
                // Restaurant 17
        //Appetizers
        MenuItem menuItem289 = new MenuItem(itemId: "289", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant17);
        menuItem289.save(failOnError: true);
        MenuItem menuItem290 = new MenuItem(itemId: "290", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant17);
        menuItem290.save(failOnError: true);
        MenuItem menuItem291 = new MenuItem(itemId: "291", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant17);
        menuItem291.save(failOnError: true);
        MenuItem menuItem292= new MenuItem(itemId: "292", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant17);
        menuItem292.save(failOnError: true);
        MenuItem menuItem293 = new MenuItem(itemId: "293", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant17);
        menuItem293.save(failOnError: true);

        //Mains
        MenuItem menuItem294 = new MenuItem(itemId: "294", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant17);
        menuItem294.save(failOnError: true);
        MenuItem menuItem295 = new MenuItem(itemId: "295", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant17);
        menuItem295.save(failOnError: true);
        MenuItem menuItem296 = new MenuItem(itemId: "296", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant17);
        menuItem296.save(failOnError: true);
        MenuItem menuItem297= new MenuItem(itemId: "297", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant17);
        menuItem297.save(failOnError: true);
        MenuItem menuItem298 = new MenuItem(itemId: "298", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant17);
        menuItem298.save(failOnError: true);
        MenuItem menuItem299 = new MenuItem(itemId: "299", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant17);
        menuItem299.save(failOnError: true);
        MenuItem menuItem300 = new MenuItem(itemId: "300", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant17);
        menuItem300.save(failOnError: true);
        MenuItem menuItem301 = new MenuItem(itemId: "301", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant17);
        menuItem301.save(failOnError: true);
        MenuItem menuItem302= new MenuItem(itemId: "302" , itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant17);
        menuItem302.save(failOnError: true);
        MenuItem menuItem303 = new MenuItem(itemId: "303", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant17);
        menuItem303.save(failOnError: true);

        //Desserts
        MenuItem menuItem304 = new MenuItem(itemId: "304", itemName: "cookie", price: 5.55, description: "fooddescription", type: "dessert", restaurant:restaurant17);
        menuItem304.save(failOnError: true);
        MenuItem menuItem305 = new MenuItem(itemId: "305", itemName: "cookie", price: 5.55, description: "fooddescription", type: "dessert", restaurant:restaurant17);
        menuItem305.save(failOnError: true);
        MenuItem menuItem306 = new MenuItem(itemId: "306", itemName: "cookie", price: 5.55, description: "fooddescription", type: "dessert", restaurant:restaurant17);
        menuItem306.save(failOnError: true);


        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////-
                // Restaurant 18
        //Appetizers
        MenuItem menuItem307 = new MenuItem(itemId: "307", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant18);
        menuItem289.save(failOnError: true);
        MenuItem menuItem308 = new MenuItem(itemId: "308", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant18);
        menuItem290.save(failOnError: true);
        MenuItem menuItem309 = new MenuItem(itemId: "309", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant18);
        menuItem291.save(failOnError: true);
        MenuItem menuItem310= new MenuItem(itemId: "310", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant18);
        menuItem292.save(failOnError: true);
        MenuItem menuItem311 = new MenuItem(itemId: "311", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant18);
        menuItem293.save(failOnError: true);

        //Mains
        MenuItem menuItem312 = new MenuItem(itemId: "312", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant18);
        menuItem312.save(failOnError: true);
        MenuItem menuItem313 = new MenuItem(itemId: "313", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant18);
        menuItem313.save(failOnError: true);
        MenuItem menuItem314 = new MenuItem(itemId: "314", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant18);
        menuItem314.save(failOnError: true);
        MenuItem menuItem315= new MenuItem(itemId: "315", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant18);
        menuItem315.save(failOnError: true);
        MenuItem menuItem316 = new MenuItem(itemId: "316", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant18);
        menuItem316.save(failOnError: true);
        MenuItem menuItem317 = new MenuItem(itemId: "317", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant18);
        menuItem317.save(failOnError: true);
        MenuItem menuItem318 = new MenuItem(itemId: "318", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant18);
        menuItem318.save(failOnError: true);
        MenuItem menuItem319 = new MenuItem(itemId: "319", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant18);
        menuItem319.save(failOnError: true);
        MenuItem menuItem320= new MenuItem(itemId: "320" , itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant18);
        menuItem320.save(failOnError: true);
        MenuItem menuItem321 = new MenuItem(itemId: "321", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant18);
        menuItem321.save(failOnError: true);

        //Desserts
        MenuItem menuItem322 = new MenuItem(itemId: "322", itemName: "cookie", price: 5.55, description: "fooddescription", type: "dessert", restaurant:restaurant18);
        menuItem322.save(failOnError: true);
        MenuItem menuItem323 = new MenuItem(itemId: "323", itemName: "cookie", price: 5.55, description: "fooddescription", type: "dessert", restaurant:restaurant18);
        menuItem323.save(failOnError: true);
        MenuItem menuItem324 = new MenuItem(itemId: "324", itemName: "cookie", price: 5.55, description: "fooddescription", type: "dessert", restaurant:restaurant18);
        menuItem324.save(failOnError: true);


        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////-
                // Restaurant 19
        //Appetizers
        MenuItem menuItem325 = new MenuItem(itemId: "325", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant19);
        menuItem325.save(failOnError: true);
        MenuItem menuItem326 = new MenuItem(itemId: "326", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant19);
        menuItem326.save(failOnError: true);
        MenuItem menuItem327 = new MenuItem(itemId: "327", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant19);
        menuItem327.save(failOnError: true);
        MenuItem menuItem328= new MenuItem(itemId: "328", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant19);
        menuItem328.save(failOnError: true);
        MenuItem menuItem329 = new MenuItem(itemId: "329", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant19);
        menuItem329.save(failOnError: true);

        //Mains
        MenuItem menuItem330 = new MenuItem(itemId: "330", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant19);
        menuItem330.save(failOnError: true);
        MenuItem menuItem331 = new MenuItem(itemId: "331", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant19);
        menuItem331.save(failOnError: true);
        MenuItem menuItem332 = new MenuItem(itemId: "332", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant19);
        menuItem332.save(failOnError: true);
        MenuItem menuItem333= new MenuItem(itemId: "333", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant19);
        menuItem333.save(failOnError: true);
        MenuItem menuItem334 = new MenuItem(itemId: "334", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant19);
        menuItem334.save(failOnError: true);
        MenuItem menuItem335 = new MenuItem(itemId: "335", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant19);
        menuItem335.save(failOnError: true);
        MenuItem menuItem336 = new MenuItem(itemId: "336", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant19);
        menuItem336.save(failOnError: true);
        MenuItem menuItem337 = new MenuItem(itemId: "337", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant19);
        menuItem337.save(failOnError: true);
        MenuItem menuItem338= new MenuItem(itemId: "338" , itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant19);
        menuItem338.save(failOnError: true);
        MenuItem menuItem339 = new MenuItem(itemId: "339", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant19);
        menuItem339.save(failOnError: true);

        //Desserts
        MenuItem menuItem340 = new MenuItem(itemId: "340", itemName: "cookie", price: 5.55, description: "fooddescription", type: "dessert", restaurant:restaurant19);
        menuItem340.save(failOnError: true);
        MenuItem menuItem341 = new MenuItem(itemId: "341", itemName: "cookie", price: 5.55, description: "fooddescription", type: "dessert", restaurant:restaurant19);
        menuItem341.save(failOnError: true);
        MenuItem menuItem342 = new MenuItem(itemId: "342", itemName: "cookie", price: 5.55, description: "fooddescription", type: "dessert", restaurant:restaurant19);
        menuItem342.save(failOnError: true);


        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////-
                // Restaurant 20
        //Appetizers
        MenuItem menuItem343 = new MenuItem(itemId: "343", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant20);
        menuItem343.save(failOnError: true);
        MenuItem menuItem344 = new MenuItem(itemId: "344", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant20);
        menuItem344.save(failOnError: true);
        MenuItem menuItem345 = new MenuItem(itemId: "345", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant20);
        menuItem345.save(failOnError: true);
        MenuItem menuItem346= new MenuItem(itemId: "346", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant20);
        menuItem346.save(failOnError: true);
        MenuItem menuItem347 = new MenuItem(itemId: "347", itemName: "cookie", price: 5.55, description: "fooddescription", type: "appetizer", restaurant:restaurant20);
        menuItem347.save(failOnError: true);

        //Mains
        MenuItem menuItem348 = new MenuItem(itemId: "348", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant20);
        menuItem348.save(failOnError: true);
        MenuItem menuItem349 = new MenuItem(itemId: "349", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant20);
        menuItem349.save(failOnError: true);
        MenuItem menuItem350 = new MenuItem(itemId: "350", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant20);
        menuItem350.save(failOnError: true);
        MenuItem menuItem351= new MenuItem(itemId: "351", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant20);
        menuItem351.save(failOnError: true);
        MenuItem menuItem352 = new MenuItem(itemId: "352", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant20);
        menuItem352.save(failOnError: true);
        MenuItem menuItem353 = new MenuItem(itemId: "353", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant20);
        menuItem353.save(failOnError: true);
        MenuItem menuItem354 = new MenuItem(itemId: "354", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant20);
        menuItem354.save(failOnError: true);
        MenuItem menuItem355 = new MenuItem(itemId: "355", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant20);
        menuItem355.save(failOnError: true);
        MenuItem menuItem356= new MenuItem(itemId: "356" , itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant20);
        menuItem356.save(failOnError: true);
        MenuItem menuItem357 = new MenuItem(itemId: "357", itemName: "cookie", price: 5.55, description: "fooddescription", type: "mains", restaurant:restaurant20);
        menuItem357.save(failOnError: true);

        //Desserts
        MenuItem menuItem358 = new MenuItem(itemId: "358", itemName: "cookie", price: 5.55, description: "fooddescription", type: "dessert", restaurant:restaurant20);
        menuItem358.save(failOnError: true);
        MenuItem menuItem359 = new MenuItem(itemId: "359", itemName: "cookie", price: 5.55, description: "fooddescription", type: "dessert", restaurant:restaurant20);
        menuItem359.save(failOnError: true);
        MenuItem menuItem360 = new MenuItem(itemId: "360", itemName: "cookie", price: 5.55, description: "fooddescription", type: "dessert", restaurant:restaurant20);
        menuItem360.save(failOnError: true);
    }
    def destroy = {
    }
}
