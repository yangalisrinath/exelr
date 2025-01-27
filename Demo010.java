package Core_Java;
import java.util.Scanner;

class Demo010 {
    String Cust_Name = "Prasunamba";
    long Account_no = 123456;
    Double Balance = 10000.00;

    void accept_details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        Cust_Name = sc.nextLine();
        System.out.println("Enter your account number:");
        Account_no = sc.nextLong();
        // Uncomment the next line if you wish to get the balance from the user.
        // System.out.println("Enter your balance:");
        // Balance = sc.nextDouble();
    }

    void Display_details() {
        System.out.println("Hello " + Cust_Name);
        System.out.println("Your balance is " + Balance);
    }
}

public class Demo010 {
    public static void main(String[] args) {
        Customer obj = new Customer();
        obj.accept_details();
        obj.Display_details();
    }
}
