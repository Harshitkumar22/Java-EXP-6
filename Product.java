package ecommerce;


public class Product{

    // Attributes
    String productID;
    String productName;
    float price;
    int qty;

    public Product(String productName, float price, int qty){
        productID=productName.substring(0,3).toUpperCase()+Float.toString(price);
        this.productName=productName;
        this.qty=qty;
        this.price=price;
    }

    // Methods
    public void getProductDetails(){
        System.out.println("Product Details:- ");
        System.out.println("ID: "+productID);
        System.out.println("Name: "+productName);
        System.out.println("Price: "+price);
        System.out.println("Quantity: "+qty);
    }

    protected void applyDiscount(float discount_rate){
        price-=price*(discount_rate/100);
    }

    void updateStock(int upgrade){
        qty+=upgrade;
    }

    private float calculateProfit(){
        return qty*price; 
    };

};