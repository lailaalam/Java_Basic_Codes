/*Take input from a user and check if the number exists in the array
let the array is [1,3,5,7,2,4,6,8]
Input: 7
Output: Found in the position 3
Input: 9
Output: Found no element*/

package function_array;

import java.util.Scanner;

public class InputExistInArray {
    public static void main(String[] args) {
        int[] arr ={1,3,5,7,2,4,6,8};
        searchNum(arr);
    }
    public static void searchNum(int[] arr)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=input.nextInt();
        int counter=0;
        int position=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==num)
            {
                counter=1;
                position=i;
                break;
            }
        }
        if(counter==1)
        {
            System.out.println("Found in the position "+position);
        }
        else
        {
            System.out.println("Found no element");
        }
    }
}

