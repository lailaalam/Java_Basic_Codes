/*1. Extract the transaction ID from the HTML body
<html>
<title>Test</title>
<body>
Your trnx is successful. Trnx Id is: TXN123456
</body>
</html>
Output: TXN123456
*/

package string_manipulation;

public class IdExtraction {
    public static void main(String[] args) {
        String str="<html> <title>Test</title>  <body>  Your trnx is successful. Trnx Id is: TXN123456 </body></html>";
        String stringExtract=str.substring(str.indexOf("TXN"),str.indexOf("TXN")+9);
        System.out.println(stringExtract);

    }
}
