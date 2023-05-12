import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.LinkedList;


public class Product {

    private String name;
    private double price;
    private int qty;
    private final float TAX = .05f;

    //Parameterized Constructor
    public Product(String name) {
        this.name = name;
    }

    //overloaded constructor
    public Product(String name, double price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public double getPrice() {
        //fix the code
        return this.price;
    }

    public String getName() {
        //fix the code
        return this.name;
    }

    public int getQty() {
        //fix the code
        return this.qty;
    }


    public String printProductInfo() {




//        String info = "Product Name: " + getName() + "\n"
//                + "Product Price: $" + getPrice() + "\n"
//                + "Product Qty: " + getQty() + "\n";
//        System.out.println(info);
//        return info;

            return "\n" + "Product Name: " + getName() + "\n"
                    + "Product Price: $" + getPrice() + "\n"
                    + "Product Qty: " + getQty() + "\n";





        // Complete the method to print A Product Info in the EXACT format below:
        // Note that each info is on a newline in a certain exact format.
        // Pay attention to details. Ask clarifying questions if unsure !


        /*
         * Product Name :bread
         * Product Price :10.0
         * Product Qty :2
         */

    }


    public int decreaseQty() {
        // Complete the method so we can decrease qty by 1 when invoked

       // qty = qty - 1;

       qty -= 1;

    return qty;

    }


    public static Integer getProductQtyIfOnSale(Product product) {
        //  Complete the code for the method isonSale()
        // (*** NOTE: A product is onsale ONLY if it cost $5 or less ***)

        if (product.getPrice() <= 5) {

            return product.getQty(); // returns the quantity of product if equals or less than $5

        } else {

            return null;
        }
    }




    public String displayPriceAfterTax() {
        // Ensure that the result is formatted to 2 decimal places.

        double priceAfterTax = getPrice() * (TAX) + price; //container for price after tax

        String formattedPrice = String.format("%.2f", priceAfterTax); //container for formatted price - 2 decimal places.

        return  formattedPrice;
    }



    public static String displayProductNameNTimes(int amt, Product product) {
        // Complete the method displayProductNameNTimes to display product names a
        // number of times.
        // let's create a container for our final output
        //we need a loop to repeatedly
        // - return the product's name
        //return the container

        //StringBuilder is a class in Java that provides a way to create and manipulate strings efficiently.
        // StringBuilder objects are mutable, meaning their values can be changed without creating a new object.
        // %s: a placeholder for a string
        // %d: a placeholder for an integer
        // %f: a placeholder for a floating-point number (decimal)



        StringBuilder output = new StringBuilder();


        for (int i = 0; i < amt; i++) {

           output.append(product.getName());

        }

        // Return the final output
        return output.toString(); //Returns a string containing the characters in this sequence in the same order as this sequence
    }



//        for(int i = 0; i < amt; i++){
//
//            System.out.print(product.getName());
//        }
//
//        return product.getName();
//    }



    //HELPER METHOD - (nothing to do here)
    @Override
    public String toString(){
        return "\n" + printProductInfo();
    }




} // END OF PRODUCT CLASS








