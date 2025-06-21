package Inventory_Management;

public class Product {
    int productId;
    String productName;
    double price;
    int quantity;

  public  Product(int productId,String productName, double price, int quantity){
      this.price=price;
      this.productId=productId;
      this.productName=productName;
      this.quantity=quantity;
  }
    public String toString() {
        return "ID: " + productId + ", Name: " + productName + ", Qty: " + quantity + ", Price: ₹" + price;
    }

}
