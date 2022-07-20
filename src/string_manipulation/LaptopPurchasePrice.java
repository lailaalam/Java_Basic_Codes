/*
3. Core i 7 HP laptop price is 76000 tk
 and cash payment discount 10%.
 What will be the purchase price?
 */

package string_manipulation;

public class LaptopPurchasePrice {
    public static void main(String[] args) {
        String str = "Core i 7 HP laptop price is 76000 tk and cash payment discount 10%. What will be the purchase price?";
        str = str.replaceAll("[^\\d]", " ");
        str = str.trim();
        str=str.replaceAll(" +"," ");
        String[] arr=str.split(" ");
        double price=Double.parseDouble(arr[1]);
        double d=Double.parseDouble(arr[2]);
        d=d/100;
        double totalPrice=price-(price*d);
        System.out.println(totalPrice);



    }
}
