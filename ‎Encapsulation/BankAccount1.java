package bankaccount1;  
class BankAccount { 
  private String accountNumber; 
  private double balance; 
  public String getAccountNumber() {
    return accountNumber;
  } 
  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  } 
  public double getBalance() {
    return balance;
  } 
  public void setBalance(double balance) {
    this.balance = balance;
  }
} 
public class BankAccount1 {  
    public static void main(String[] args) { 
        BankAccount account = new BankAccount(); 
        account.setAccountNumber("0272130005101126");
        account.setBalance(20000.0); 
        String accountNumber = account.getAccountNumber();
        double balance = account.getBalance(); 
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}
 
