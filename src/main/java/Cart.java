
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.LinkedList;


public class Cart {
//instance variables - they are also objects
    //cart is a list of products
    public static LinkedList<Product> cart = new LinkedList<Product>();
    public static Map<Integer, List<Product>> cartRecords = new HashMap<Integer, List<Product>>();


    public static void addToCart(Product product) {
        // Complete the code for the method addToCart()
        // - To add a single product to the cart

        cart.add(product);



    }

    public static void removeFromCart(Product product) {
        // Complete the code for the method addToCart()
        // - To add a single product to the cart

        cart.remove(product);



        }



    public static void addCartToMap(Integer key, List<Product> value) {

        cartRecords.put(key, value);





    }

    public static Double calculateCartTotal() {
        //Calculate the total cost of products in the cart

        double total = 0.0; //container to store our final price
        //for-loop to loop through the products in the cart

        for(Product product: cart){

            //same as:  total = total + product * qty
            total += product.getPrice() * product.getQty();

        }

        return total;
    }




    public static Product findProductInCartByName(String name) {
        //find a product in the cart by its name
        for (Product product :cart) { //looping the products in the cart
            if (product.getName().equals(name)){ //check if the product's name is the same as the name passed to my method
                return product; //returns the product if it matches the name


            }

        }
        return null; //returns nothing
    }










    public static Double priceCheck(String name){
        // return the price of a product based on its name
        for (Product product :cart) { //looping the products in the cart
            if (product.getName().equals(name)) { // if product equals the name - it returns the price of the product
                return product.getPrice();
            }
        }
        return null;

    }



    public static LinkedList<Double> findExpensiveProductsInCart() {
        //Find all expensive products in the cart
        //A product is expensive if it cost $500 or more
        LinkedList<Double> expensiveProducts = new LinkedList<>(); //new list for expensive products
        for (Product product : cart) { //looped through the products inside the cart
            if (product.getPrice() >= 500) { // if the prices are greater than or equal to $500 -
                expensiveProducts.add(product.getPrice()); //add products to new list that was created.
            }
        }
        return expensiveProducts; //return the list with expensive products

    }










    public static Double findMostExpensiveProduct() {
        //Find the most expensive product in the cart
        //A product is expensive if it cost $500 or more

        for (Product product : cart){ //looping through the products inside the cart

            if(product.getPrice()>=500){
                return product.getPrice();
            }

        }

        return null;
    }


    public static int getCartSize() {
        // Number of products in cart

        return cart.size();

    }



    public static int getMapSize() {
        // Number of carts in cartRecord
        return cartRecords.size(); //Returns the number of key-value mappings in this map.
    }


    public static List<Integer> displayKeysOfCartRecords() {
        //display the list of keys for the  cart records added to the  cartRecords Map
        List<Integer> cartKeys = new ArrayList<>(cartRecords.keySet()); //Returns a Set view of the keys contained in this map.



        return cartKeys ;
    }



    public static List<Map.Entry<Integer, List<Product>>> displayAllCartRecords() {
        //display the list of the  cart records added to the  cartRecords Map
        //iterating over key - value pairs of the map
        List<Map.Entry<Integer, List<Product>>> listOfCartRecords = new ArrayList<>(cartRecords.entrySet());
        // new list that displays the keys and values of the cart records added to the cartRecords Map - entrySet() methods returns a set view of the keys and values in map


        return listOfCartRecords;
    }






} //END OF CART CLASS






