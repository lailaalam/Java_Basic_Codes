//Write a program to check if inputted letter is small or capital

package conditional_logic_loop;

import java.util.Scanner;

import static java.lang.Math.abs;

public class capital_small {
    public static void main(String[] args) {
        System.out.println("Enter a letter:");
        Scanner input=new Scanner(System.in);
        char l=input.next().charAt(0);
        int ascii_value=abs('A'-l)+65;
        if(ascii_value>=65 && ascii_value<=90)
        {
            System.out.println("Capital letter");
        }
        else
        {
            System.out.println("Small letter");
        }
    }
}
