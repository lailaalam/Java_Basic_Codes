//Write a program to check balance and withdraw money from ATM booth using if else or switch case

package java_class_2;

import java.util.Scanner;

public class balance_checking_withdrawing {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Press any option:");
        int option=input.nextInt();
        switch(option)
        {
            case 1:
                System.out.println("Your balance is 4000 tk");
                break;
            case 2:
                System.out.println("Enter amount:");
                int amount=input.nextInt();
                if(amount<=3500)
                {
                    System.out.println("Please receive your cash");
                }
                else
                {
                    System.out.println("Insufficient balance");
                }
                break;
            case 3:
            default:
                System.out.println("Press the right button");
                break;
        }
    }
}
