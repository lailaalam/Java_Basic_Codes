/*Take 5 numbers from users in an array. Then find out the average number,
how many even and how many odd numbers using these functions: average(), countEvenNumbers(), countOddNumbers()*/

package function_array;

import java.util.Scanner;

public class AvgEvenOddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input 5 elements:");
        int[] arr = new int[5];
        for(int i=0;i< arr.length;i++)
        {
          arr[i]=input.nextInt();
        }
        average(arr);
        countEvenNumbers(arr);
        countOddNumbers(arr);
    }

    public static void average(int[] arr)
    {
          int sum=0;
          for(int i=0;i<arr.length;i++)
          {
             sum=sum+arr[i];
          }
          int avg=sum/ arr.length;
        System.out.println("Average value  is: " +avg);
    }
    public static void countEvenNumbers(int[] arr)
    {
        int evenCount=0;
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]%2==0)
           {
               evenCount++;
           }
        }

        System.out.println("Total Even number is: " +evenCount);
    }
    public static void countOddNumbers(int[] arr)
    {
        int oddCount=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                oddCount++;
            }
        }

        System.out.println("Total Odd number is: " +oddCount);
    }
}
