//Input 2 decimal numbers and check if they are both same or different up to two decimal places. E.g 120.546 & 120.241
package conditional_logic_loop;

import java.text.DecimalFormat;
import java.util.Objects;
import java.util.Scanner;

public class decimal_no_comparison {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter two decimal numbers:");
        System.out.println("Enter first number:");
        double num1= input.nextDouble();
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Enter second number:");
        double num2= input.nextDouble();
        if(Objects.equals(df.format(num1),df.format(num2)))
        {
            System.out.println("The numbers are same");
        }
        else {
            System.out.println("The numbers are different");
        }


    }
}
