/*8. Write a program to convert each 1st char to uppercase from a string
Input: rahim lives in sylhet
Output: Rahim Lives in Sylhet
*/

package string_manipulation;

public class StringFirstCharUppercase {
    public static void main(String[] args) {
        String str = "rahim lives in sylhet";
        String[] words = str.split(" ");
        String newLine = "";
        for (int i = 0; i < words.length; i++) {
            String left = words[i];
            String s = String.valueOf(words[i].charAt(0)).toUpperCase();
            String sub = left.substring(1);
            newLine = newLine + s + sub + " ";
        }
        newLine.trim();
        System.out.println(newLine);
    }
}
