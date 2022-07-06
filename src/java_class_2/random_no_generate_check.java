//Write a program to generate 2 random numbers which will not be shown to the user. Take a user input and match it with any of the random numbers. If correct give it 1 point and if incorrect, do not give it any point. Finally, repeat this for 10 times and count the point user achieved.

package java_class_2;


import java.util.Scanner;

public class random_no_generate_check {
    public static void main(String[] args) {
        int num1,num2,user_value,sum=0;
        Scanner input=new Scanner(System.in);

        for(int i=1;i<=10;i++)
        {
            num1=(int)(Math.random()*(100-1)+1);

            num2=(int)(Math.random()*(100-1)+1);

            System.out.println(i+"No User input:");
            user_value=input.nextInt();
            if(user_value==num1 || user_value==num2)
            {
                sum++;
            }

        }
        System.out.println("User point:"+ sum);
    }
}
