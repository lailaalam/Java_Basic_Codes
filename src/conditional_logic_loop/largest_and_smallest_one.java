//Write a program to enter the numbers till the user wants and at the end, the program should display the largest and smallest numbers user entered.

package conditional_logic_loop;

import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class largest_and_smallest_one {
    public static void main(String[] args) {
        System.out.println("How many times you want to run the program?");
        Scanner input = new Scanner(System.in);
        int range = input.nextInt();
        int maxx = MIN_VALUE;
        int minn = MAX_VALUE;
        while (true) {
            range--;
            System.out.println("Enter a no:");
            int number = input.nextInt();
            if (number > maxx) {
                maxx = number;
            }
            if (number < minn) {
                minn = number;
            }
            if(range==0)
            {
                break;
            }
        }
        System.out.println("Max value is:"+maxx);
        System.out.println("Min value is:"+minn);

    }
}
