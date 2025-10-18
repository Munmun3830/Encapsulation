 
package desktop1; 
 class Desktop { 
    private String brand;
    private String processor;
    private int ramSize; 
    public String getBrand() {
        return brand;
    } 
    public void setBrand(String brand) {
        this.brand = brand;
    } 
    public String getProcessor() {
        return processor;
    } 
    public void setProcessor(String processor) {
        this.processor = processor;
    } 
    public int getRamSize() {
        return ramSize;
    } 
    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    } 
    public void upgradeRam(int additionalRam) {
        if (additionalRam > 0) {
            this.ramSize += additionalRam;
        }
    }
}

public class Desktop1 { 
    public static void main(String[] args) { 
        Desktop desktop = new Desktop(); 
        desktop.setBrand("TechPro");
        desktop.setProcessor("AMD Ryzen 9");
        desktop.setRamSize(32);
        desktop.upgradeRam(0); 
        System.out.println("Brand: " + desktop.getBrand());
        System.out.println("Processor: " + desktop.getProcessor());
        System.out.println("RAM Size: " + desktop.getRamSize() + "GB");
    }
 }
 
