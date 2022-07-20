/*
5. Write a program that will count how many vowels in the given string:
"roadtosdet"
Output: 4
*/

package string_manipulation;

public class CountVowel {
    public static void main(String[] args) {
        String str="roadtosdet";
        char[] s=str.toCharArray();
        int count=0;
        for(int i=0;i<s.length;i++)
        {
            if(s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u'||s[i]=='A'||s[i]=='E'||s[i]=='I'||s[i]=='O'||s[i]=='U')
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
