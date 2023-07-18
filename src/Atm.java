import java.util.Scanner;
public class Atm {

    static void Atm(int balance, int pin) {
        int count = 1;
        Scanner s = new Scanner(System.in);
        System.out.println("if you want to withdraw the amount press:1");
        System.out.println("if you want to credit the amount press:2");
        System.out.println("if you want to change the pincode press:3");
        int x = s.nextInt();
        switch (x) {
            case 1:
                System.out.println("enter the amount you want to withdraw");
                int withdrawal = s.nextInt();
                System.out.println("enter the pincode");
                int checkpincode = s.nextInt();
                if (checkpincode == pin) {
                    if (withdrawal <= balance){
                        balance = balance - withdrawal;
                        System.out.println(withdrawal + " is debited from your account"+" your total balance is"+ balance);
                    } else
                        System.out.println("you do not have a sufficient balance");
                } else
                    System.out.println("please enter the correct pincode");
                break;
            case 2:
                System.out.println("enter the amount you want to credit");
                int creditedamount = s.nextInt();
                balance = balance + creditedamount;
                System.out.println("your amount has been credited by " + creditedamount + " your total balance" + balance);
                break;
            case 3:
                System.out.println("enter the current pincode");
                checkpincode = s.nextInt();
                if (checkpincode == pin) {
                    System.out.println("enter your new pincode");
                    pin = s.nextInt();
                    System.out.println("your pincode is updated successfully");
                } else
                    System.out.println("enter the correct pincode");
                break;
            default:
                System.out.println(" please enter your correct number");
        }
        System.out.println("if you wnat to exit press:1");
        System.out.println("if want to make any other changes press:2");
        int a = s.nextInt();
        switch (a) {
            case 1:
                System.out.println("Thanks for visiting us");
                break;
            case 2:
                Atm(balance, pin);
        }
    }
    public static void main (String[]agrs){
        int balance=1000;
        int pin=1228;
        Atm(balance,pin);

            }
        }