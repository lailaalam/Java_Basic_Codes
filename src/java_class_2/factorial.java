//Write  a program to find the factorial of a given number

package java_class_2;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Find the factorial of:");
        int num=input.nextInt();
        int sum=1;
        for(int i=num;i>=1;i--)
        {
            sum=sum*i;
        }
        System.out.println("Factorial value:"+sum);
    }
}
