/*2. Price of a formal shirt is 1200 tk and Sharee is 3500 tk.
If you buy 2 shirt and 1 sharee, then 400 tk will be discounted.
 After your purchase what will be your total cost?
 */

package string_manipulation;

public class FindTotalCost {
    public static void main(String[] args) {
        String str="Price of a formal shirt is 1200 tk and Sharee is 3500 tk. If you buy 2 shirt and 1 sharee, then 400 tk will be discounted. After your purchase what will be your total cost?";
        str=str.replaceAll("[^\\d]"," ");
        str=str.trim();
        str=str.replaceAll(" +"," ");
        String[] value=str.split(" ");
        int shirt=Integer.parseInt(value[0]);
        int sharee=Integer.parseInt(value[1]);
        int shirtCount=Integer.parseInt(value[2]);
        int shareeCount=Integer.parseInt(value[3]);
        int discount=Integer.parseInt(value[4]);
        int totalCost=(shirt*shirtCount)+(sharee*shareeCount)-discount;
        System.out.println(totalCost);



    }
}
