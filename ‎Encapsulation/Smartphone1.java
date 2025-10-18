 
package smartphone1; 
class SmartPhone { 
    private String brand;
    private String model;
    private int storageCapacity;
 
    public String getBrand() {
        return brand;
    } 
    public void setBrand(String brand) {
        this.brand = brand;
    } 
    public String getModel() {
        return model;
    } 
    public void setModel(String model) {
        this.model = model;
    } 
    public int getStorageCapacity() {
        return storageCapacity;
    } 
    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }
    public void increaseStorage(int additionalStorage) {
        if (additionalStorage > 0) {
            this.storageCapacity += additionalStorage;
        }
    }
} 
public class Smartphone1 { 
    public static void main(String[] args) {
 
        SmartPhone phone = new SmartPhone();
         phone.setBrand("Samsung");
        phone.setModel("Galaxy S24 Ultra");
        phone.setStorageCapacity(512);
        phone.increaseStorage(512); 
        System.out.println("Brand: " + phone.getBrand());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Storage Capacity: " + phone.getStorageCapacity() + "GB");
    }
 }
