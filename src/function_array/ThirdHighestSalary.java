/*Suppose, in a company , here are some employee salaries in an array
[35000, 25000, 28000, 32500, 44000, 32800]
Find out the 3rd highest salary
*/

package function_array;

import java.util.Arrays;

public class ThirdHighestSalary {
    public static void main(String[] args) {
        int[] arr ={35000, 25000, 28000, 32500, 44000, 32800};
        int num=thirdHighestCount(arr);
        System.out.println("The Third Highest Salary is "+ num);
    }
    public static int thirdHighestCount(int[] arr)
    {
        Arrays.sort(arr);
        return arr[arr.length-3];
    }
}
