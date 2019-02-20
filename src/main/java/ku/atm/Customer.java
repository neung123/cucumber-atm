package ku.atm;

/**
   A bank customer with a checking and a savings account.
*/
public class Customer {
   private int customerNumber;
   private int pin;
   private BankAccount account;
   private final static String normalType = "Normal";

   /**
      Constructs a customer with a given number and PIN.
      @param aNumber the customer number
      @param aPin the personal identification number
   */
   public Customer(int aNumber, int aPin, double currentBalance, String accountType) {
      customerNumber = aNumber;
      pin = aPin;
      account = new BankAccount(currentBalance, accountType);
   }

   public Customer(int aNumber, int aPin) {
      this(aNumber, aPin, 0, normalType);
   }

   public Customer(int aNumber, int aPin, double currentBalance) {
      this(aNumber, aPin, currentBalance, normalType);
   }

   public int getCustomerNumber() {
	   return customerNumber;
   }
   
   /** 
      Tests if this customer matches a customer number 
      and PIN.
      @param aPin a personal identification number
      @return true if the customer number and PIN match
   */
   public boolean match(int aPin) {
      return pin == aPin;
   }
      
   /** 
      Gets the account of this customer.
      @return the account
   */
   public BankAccount getAccount() {
      return account;
   }
   
}
