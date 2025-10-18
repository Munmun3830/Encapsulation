 
package house1; 
 class House { 
    private String address;
    private int numberOfRooms;
    private double area; 
    public String getAddress() {
        return address;
    } 
    public void setAddress(String address) {
        this.address = address;
    } 
    public int getNumberOfRooms() {
        return numberOfRooms;
    } 
    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }
 
    public double getArea() {
        return area;
    } 
    public void setArea(double area) {
        this.area = area;
    } 
    public double calculatePrice(double pricePerSquareMeter) {
        return this.area * pricePerSquareMeter;
    }
}

public class House1 { 
   public static void main(String[] args) { 
        House house = new House(); 
        house.setAddress(" Green Valley Ave.");
        house.setNumberOfRooms(4);
        house.setArea(145.0); 
        double price = house.calculatePrice(290000.0); 
        System.out.println("Address: " + house.getAddress());
        System.out.println("Number of Rooms: " + house.getNumberOfRooms());
        System.out.println("Area: " + house.getArea() + " sq meters");
        System.out.printf("Price: $%.1f\n", price);

         
    }
 }
