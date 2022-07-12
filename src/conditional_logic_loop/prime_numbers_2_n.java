//Write a program to print prime numbers from 2 to n

package conditional_logic_loop;

import java.util.Scanner;


public class prime_numbers_2_n {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = input.nextInt();

        System.out.println("Prime Numbers:");
        for (int i = 2; i <= n; i++) {
            int c = 1;
            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0) {

                    c = 0;
                    break;
                }
            }
            if (c == 1) {
                System.out.println(i);
            }

        }
    }
}
