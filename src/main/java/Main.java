
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.LinkedList;
import java.util.Random;



public class Main {


    public static void main(String[] args) {
        //objects are stored in the heap memory in java
        //They are cleaned up by the Garbage collector
        Product product1 = new Product("Bike", 4200.00, 2);
        //Add product1 to the cart
        Cart.addToCart(product1); //used the addToCart method in the Cart class to add product1 to the cart

        Product product2 = new Product("Coke", 4.00, 10);
        //Add product2 to the cart
        Cart.addToCart(product2);

        Product product3 = new Product("Laptop", 1000.0, 4);
        //Add product3 to the cart
        Cart.addToCart(product3);

        Product product4 = new Product("Candy");
        //Add product4 to the cart
        Cart.addToCart(product4);

        LinkedList<Product> cart1 = new LinkedList<Product>();
        cart1.add(product1);
        cart1.add(product3);



        //add a product to the cart1 list
        //add cart1 to the cartRecords (Map)
        Cart.addCartToMap(1, cart1);

        LinkedList<Product> cart2 = new LinkedList<Product>();
        cart2.add(product2);
        cart2.add(product4);

        //add a product to the cart2 list
        //add the cart2 to the cartRecords (Map)
        Cart.addCartToMap(2, cart2);


        //***METHODS WITH TEST CASES ARE BELOW - TO DO: INVOKE/CALL THE METHODS***

        // 5 points
        System.out.println("Print result of getCartSize : " + Cart.getCartSize());
        System.out.println();

        // 5 points
        System.out.println("Print a product's info with printProductInfo: " + product4.printProductInfo());
        System.out.println();

        // 5 points - You can test with product2 cos its on sale
        System.out.println("Print result of getProductQtyIfOnSale : " + Product.getProductQtyIfOnSale(product2));
        System.out.println();

        // 5 points
        System.out.println("Print result after calling decreaseQty :  " + product2.decreaseQty());
        System.out.println();

        // 5 points
        System.out.println("Print result of displayProductNameNTimes : " + Product.displayProductNameNTimes(3, product1 ));
        System.out.println();

        // 5 points
        System.out.println("Print result of findProductInCartByName : " + Cart.findProductInCartByName("Bike"));
        System.out.println();

        // 5 points
        System.out.println("Print result of displayKeysOfCartRecords : " + Cart.displayKeysOfCartRecords());
        System.out.println();



        //*Randomly generated numbers you can use for manually testing if you like or not*
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int randomNumber = arr[new Random().nextInt(arr.length)];
        System.out.println();


        //***METHODS WITHOUT TEST CASES ARE BELOW - TO DO: INVOKE/CALL THE METHODS***

        //5 points
        System.out.println("Print result of getMapSize :  " + Cart.getMapSize());
        System.out.println();

        //5 points
        System.out.println("Print result of calculateCartTotal : " + Cart.calculateCartTotal());
        System.out.println();

        //5 points

        System.out.println("Remove product4 with removeFromCart : " + Cart.getCartSize());
        Cart.removeFromCart(product4);
        //after calling the remove(). Check by getting the carts new size
        System.out.println(Cart.getCartSize());


        //10 points
        System.out.println("Print result of displayPriceAfterTax : " + product1.displayPriceAfterTax() );
        System.out.println();

        //10 points
        System.out.println("Print result of priceCheck :  " + Cart.priceCheck("Laptop"));
        System.out.println();

        //10 points
        System.out.println("Print result of findExpensiveProductsInCart : " + Cart.findExpensiveProductsInCart());
        System.out.println();

        //10 points
        System.out.println("Print result of displayAllCartRecords :  " + Cart.displayAllCartRecords());
        System.out.println();

        //10 points
        System.out.println("Print result of findMostExpensiveProduct :" + Cart.findMostExpensiveProduct());
        System.out.println();






    } // MAIN METHOD ENDS HERE

} // MAIN CLASS ENDS HERE






