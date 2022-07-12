//Write a program to sum of user input until users input ‘q’ from keyboard

package conditional_logic_loop;

import java.util.Objects;
import java.util.Scanner;

public class return_sum_typing_q {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter input:");
        while (true) {

            String user_input = input.nextLine();
            if (Objects.equals(user_input, "q"))
            {
                break;
            }
            else
            {
               sum=sum+Integer.parseInt(user_input);
            }

        }
        System.out.println("Sum:" + sum);

    }
}
