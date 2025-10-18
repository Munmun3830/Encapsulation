 package main1;  
class Person { 
  private String name; 
  private int age; 
  private String country;
  public String getName() {
    return name;
  } 
  public void setName(String name) {
    this.name = name;
  } 
  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age = age;
  } 
  public String getCountry() {
    return country;
  } 
  public void setCountry(String country) {
    this.country = country;
  }
}  
public class Main1 { 
    public static void main(String[] args) {
       
        Person person = new Person(); 
        person.setName("Tahamina Akter Munmun");
        person.setAge(23);
        person.setCountry("Bangladesh"); 
        String name = person.getName();
        int age = person.getAge();
        String country = person.getCountry(); 
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Country: " + country);
    }
}
