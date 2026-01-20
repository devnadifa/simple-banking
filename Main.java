import java.util.Scanner;

public class Main {
  static Scanner input = new Scanner(System.in);
  public static void main(String[] args) {
    double balance = 0;
    boolean isRunnig = true;
    int choice;

    while(isRunnig) {
      System.out.println("*******************");
      System.out.println("1. Show Balance");
      System.out.println("2. Deposit");
      System.out.println("3. Withdraw");
      System.out.println("4. Exit");
      System.out.println("*******************");

      System.out.print("Enter your choice(1 - 4): ");
      choice = input.nextInt();
     
      switch (choice) {
        case 1 -> showBalance(balance);
        case 2 -> balance += deposit();
        case 3 -> balance -= withdraw(balance);
        case 4 -> isRunnig = false;
        default -> System.out.println("invalid choice");
    
      }      
    }
    System.out.println("*******************");
    System.out.println("Thank you for using our banking system");
    System.out.println("*******************");

    input.close();
  }
  //show balance
  static void showBalance(double balance) {
    System.out.printf("Your balance is Kshs%.2f \n", balance);
  }
  // deposit
  static double deposit() {
    System.out.println("Enter amount to deposit: ");
    double amount = input.nextDouble();
    if (amount < 0) {
      System.out.println("Amount can't be negative!");
      return 0;
    } else {
      return amount;
    }

  }
  //withdraw
  static double withdraw(double balance) {
    System.out.println("Enter amount to withdraw: ");
    double amount = input.nextDouble();

    if(amount < 0) {
      System.out.println("can't withdraw negative amount");
      return 0;
    } else if (amount > balance) {
      System.out.println("Insufficient money");
      return 0;
    } else {
      return amount;
    }

  }
}
