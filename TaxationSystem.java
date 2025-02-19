class TaxCalculator{    // Base class with a final GST_RATE and final method
    final double GST=18.0;

    final void displayGST(){   // Final method to display GST rate
        System.out.println("The GST rate is: " + GST + "%");
    }
}

class Invoice extends TaxCalculator{
    double calculateTotalWithTax(double amount){
        double taxAmount=(amount*GST)/100;
        return amount + taxAmount;
    }

    // Attempting to override displayGST() will result in a compilation error
    /*
    void displayGST() { 
        System.out.println("Overriding attempt"); 
    }
    */

    // Attempting to modify GST_RATE will result in a compilation error
    /*
    void changeGST() { 
        GST_RATE = 20.0; 
    }
    */
}


public class TaxationSystem{  // Main class to test the program
    public static void main(String[] args) {
        Invoice invoice=new Invoice();
        invoice.displayGST(); // Display GST rate

        double amount=1000.0;
        double totalAmount=invoice.calculateTotalWithTax(amount);
        System.out.println("Total amount after GST: " + totalAmount);
    }
}