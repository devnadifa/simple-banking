import java.util.Scanner;
public class Main {
  static Scanner scanner = new Scanner(System.in);
  public static void main (String[] args) {
    //STEPS FOR SIMPLE BACKING PROGRAM

    //DECLARE VARIABLES
    double balance = 0;
    boolean isRunnig = true;
    int choice;
    
    while(isRunnig) {
    //DISPLAY MENU
      System.out.println("************");
      System.out.println("BANKING PROGRAM");
      System.out.println("************");
      System.out.println("1. Show Balance");
      System.out.println("2. Deposit");
      System.out.println("3. Withdraw");
      System.out.println("4. Exit");
      System.out.println("************");

      //GET AND PROCESS USERS CHOICE
      System.out.print("Enter your choice (1 - 4): ");
      choice = scanner.nextInt();

      switch (choice) {
        case 1 -> showBalance(balance);
        case 2 -> balance += deposit();
        case 3 -> System.out.println("WITHDRAW");
        case 4 -> isRunnig = false ;  
        default -> System.out.println("INVALID CHOICE");

      }
    }
    //deposit()

    //withdraw()

    //EXIT MESSAGE

    scanner.close();

  }
  //showBalance()
  static void showBalance(double balance) {
    System.out.printf("Ksh%.2f\n", balance);
  }
  //deposit()
  static double deposit() {
    double amount;
    System.out.println("Enter amount to be deposited: ");
    amount = scanner.nextDouble();
    if (amount < 0) {
      System.out.println("Amount cant be negative");
      return 0;
    } else {
      return amount;
    }
  }

}
