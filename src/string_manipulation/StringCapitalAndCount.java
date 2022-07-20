/*4. Writea program that will give following output:
Input: chattogram
Output: C8M
*/

package string_manipulation;

public class StringCapitalAndCount {
    public static void main(String[] args) {
        String str = "chattogram";
        String solution = capitalCharInnerNumberCount(str);
        System.out.println(solution);


    }

    public static String capitalCharInnerNumberCount(String str) {
        String firstChar = String.valueOf(str.charAt(0)).toUpperCase();
        String lastChar = String.valueOf(str.charAt(str.length() - 1)).toUpperCase();
        int charCount = str.length() - 2;
        String num = String.valueOf(charCount);
        return firstChar + num + lastChar;
    }
}
