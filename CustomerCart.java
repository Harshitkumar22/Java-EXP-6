package customerportal;

import ecommerce.Product;
import java.util.Scanner;

public class CustomerCart{
       public static void main(String[] args) {

        // Input 
        Scanner inp = new Scanner(System.in);
        String name;
        float price;
        int qty;
        float discount;

        System.out.println("Enter Details of Product:- ");
        System.out.print("Name:- ");
        name=inp.nextLine();

        System.out.print("Price:- ");
        price=inp.nextFloat();
        inp.nextLine();

        System.out.print("Quantity:- ");
        qty=inp.nextInt();
        inp.nextLine();

        Product objProduct = new Product(name,price,qty);

        System.out.println("Displaying Product Details:- ");
        objProduct.getProductDetails();

        // System.out.println("Discount:- ");
        // System.out.print("Enter Discount Rate: ");
        // discount=inp.nextFloat();
        // inp.nextLine();
        // objProduct.applyDiscount(discount);
        // objProduct.getProductDetails();

        // System.out.println("Updating Stock:- ");
        // System.out.print("Enter New Added Stock: ");
        // qty=inp.nextInt();
        // inp.nextLine();
        // objProduct.updateStock(qty);

        // System.out.println("Calculating Profit:- ");
        // System.out.println("Net Profit: "+objProduct.calculateProfit());
                   
       }
}