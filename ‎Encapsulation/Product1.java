 package product1; 
 class Product { 
    private String productName;
    private String productCode;
    private double price;
    public String getProductName() {
        return productName;
    } 
    public void setProductName(String productName) {
        this.productName = productName;
    } 
    public String getProductCode() {
        return productCode;
    } 
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    } 
    public double getPrice() {
        return price;
    } 
    public void setPrice(double price) {
        this.price = price;
    } 
    public void applyDiscount(double percentage) {
        if (percentage > 0 && percentage <= 100) {
            this.price -= this.price * (percentage / 100);
        }
    } 
}
public class Product1 { 
    public static void main(String[] args) { 
        Product product = new Product(); 
        product.setProductName("Smartphone");
        product.setProductCode(" SP98765");
        product.setPrice(1100.00); 
        product.applyDiscount(8); 
        System.out.println("Product Name: " + product.getProductName());
        System.out.println("Product Code: " + product.getProductCode());
        System.out.println("Price after discount: $" + product.getPrice());
    }
 }
 
  