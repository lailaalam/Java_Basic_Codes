//Write a program to calculate GPA and find grade

package java_class_2;

import java.util.Scanner;

public class GPA_Grade {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Your No:");
        int num=input.nextInt();
        if(num>=80 && num<=100)
        {
            System.out.println("GPA: 5 \t Grade: A+");
        }
        else if(num>=70 && num<=79)
        {
            System.out.println("GPA: 4 \t Grade: A");
        }
        else if(num>=60 && num<=69)
        {
            System.out.println("GPA: 3.5 \t Grade: A-");
        }
        else if(num>=50 && num<=59)
        {
            System.out.println("GPA: 3 \t Grade: B");
        }
        else if(num>=40 && num<=49)
        {
            System.out.println("GPA: 2 \t Grade: C");
        }
        else if(num>=33 && num<=39)
        {
            System.out.println("GPA: 1 \t Grade: D");
        }
        else
        {
            System.out.println("GPA: 0 \t Grade: F");
        }

    }
}
