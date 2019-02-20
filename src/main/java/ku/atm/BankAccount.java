package ku.atm;

/**
   A bank account has a balance that can be changed by 
   deposits and withdrawals.
*/
public class BankAccount {
   private double balance;
   private String type;
   private final static String normalType = "Normal";

   /**
      Constructs a bank account with a zero balance.
   */
   public BankAccount() {
      balance = 0;
      this.type = normalType;
   }

   /**
      Constructs a bank account with a given balance.
      @param initialBalance the initial balance
   */
   public BankAccount(double initialBalance) {
      balance = initialBalance;
      this.type = normalType;
   }

   /**
    *  Constructs a bank account with a given balance and account type.
    * @param initialBalance the initial balance
    * @param type the type of the account
    */
   public BankAccount(double initialBalance, String type) {
      balance = initialBalance;
      if(!type.equals("OD")) this.type = normalType;
      else this.type = type;
   }
 
   /** 
      Deposits money into the account.
      @param amount the amount of money to withdraw
   */
   public void deposit(double amount) {
      balance = balance + amount;
   }

   /** 
      Withdraws money from the account.
      @param amount the amount of money to deposit
   */
   public void withdraw(double amount) throws NotEnoughBalanceException {
       if (amount > balance)
          if (this.type.equals(normalType)) throw new NotEnoughBalanceException("cannot withdraw more than balance");
       balance = balance - amount;
   }

   /** 
      Gets the account balance.
      @return the account balance
   */
   public double getBalance() {
      return balance; 
   }

   /**
    * Gets the account type.
    * @return the account type
    */
   public String getType() {
      return type;
   }
}

