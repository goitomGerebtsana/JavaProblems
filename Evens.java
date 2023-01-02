/*An Evens number is an integer whose digits are all even. For example 2426 is an Evens number 
but 3224 is not.
Write a function named isEvens that returns 1 if its integer argument is an Evens number otherwise it 
returns 0.
*/


public class Evens {

    public static void main(String args[]) {
        System.out.print(isEvens(0));

    }

    //int isEvens (int n)

    static int isEvens(int n) {
        while (n != 0) {
            int x = n % 10;
            if (x % 2 != 0)
                return 0;
            n = n / 10;
        }
        return 1;
    }
}
