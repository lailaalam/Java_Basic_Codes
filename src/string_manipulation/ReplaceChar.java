/*
6. Replace "R" from Rahim with "F" from the given String:
Input: Ratul and Rahim lives in Rangpur
Output: Ratul and Fahim lives in Rangpur
 */
package string_manipulation;

public class ReplaceChar {
    public static void main(String[] args) {
        String str = "Ratul and Rahim lives in Rangpur";
        int index = str.indexOf("Rahim");

        char[] arr = str.toCharArray();
        arr[index] = 'F';
        str = String.valueOf(arr);
        System.out.println(str);


    }
}
