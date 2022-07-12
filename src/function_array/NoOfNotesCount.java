/*Input an amount from the user and find out the number of notes from input amount in given array
[1000,500,100,50,20,10,5,2,1]
Input: 1256
Output:
1000 1
100 2
50 1
2 3
*/

package function_array;

public class NoOfNotesCount {
    public static void main(String[] args) {
        int[] notes = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int amount = 590;
        for (int i = 0; i < notes.length; i++) {
            int note = amount / notes[i];
            amount = amount % notes[i];
            if (note == 0) {
                continue;
            }
            System.out.println(notes[i] + " " + note);
        }


    }
}

