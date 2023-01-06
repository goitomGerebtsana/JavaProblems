/*A Meera array is an array that contains the value 1 if and only if it contains 9. The array {7, 9, 0, 
10, 1} is a Meera array because it contains 1 and 9. The array {6, 10, 8} is a Meera array because it 
contains no 1 and also contains no 9. 
The array {7, 6, 1} is not a Meera array because it contains 1 but does not contain a 9. The array {9, 
10, 0} is not a Meera array because it contains a 9 but does not contain 1.
It is okay if a Meera array contains more than one value 1 and more than one 9, so the array {1, 1, 0, 
8, 0, 9, 9, 1} is a Meera array.
Write a function named isMeera that returns 1 if its array argument is a Meera array and returns 0 
otherwise. */

public class meeraArray2 {

    static int Meera(int[] a) {
        boolean one = false, nine = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1)
                one = true;
            if (a[i] == 9)
                nine = true;
        }
        if ((nine && one) || (!nine && !one))
            return 1;
        return 0;
    }
}