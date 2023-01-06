/*An array is defined to be complete if the conditions (a), (d) and (e) below hold.
 a. The array contains even numbers
 b. Let min be the smallest even number in the array.
 c. Let max be the largest even number in the array.
 d. min does not equal max
 e. All numbers between min and max are in the array
For example {-5, 6, 2, 3, 2, 4, 5, 11, 8, 7} is complete because 
 a. The array contains even numbers
 b. 2 is the smallest even number
 c. 8 is the largest even number
 d. 2 does not equal 8
 e. the numbers 3, 4, 5, 6, 7 are in the array.
Examples of arrays that are not complete are:
{5, 7, 9, 13} condition (a) does not hold, there are no even numbers.
{2, 2} condition (d) does not hold
{2, 6, 3, 4} condition (e) does not hold (5 is missing)
Write a function named isComplete that returns 1 if its array argument is a complete array. Otherwise 
it returns 0.
*/s


public class CompleteArray {

    public static void main(String args[]) {

        System.out.print(isComplete(c));
    }

    static int[] a = { -5, 6, 2, 3, 2, 4, 5, 11, 8, 7 };
    static int[] b = { 5, 7, 9, 13 };
    static int[] c = { 2, 2 };
    static int[] d = { 2, 6, 3, 4, 5 };

    static int isComplete(int[] a) {
        if (a.length <= 2) // The array must have atleast two evens and the numbers in between
            return 0;
        int min = 0;
        int max = 0;
        // Below for lop is to initialize the min and max even
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                min = a[i];
                max = a[i];
                break;
            }
        }
        // to selec min and max evens from the whole array
        for (int j = 0; j < a.length; j++) {
            if (a[j] % 2 == 0) {
                if (a[j] < min)
                    min = a[j];
                if (a[j] > max)
                    max = a[j];
            }
        }
        if (min == max)
            return 0;
        int x = (max - min) - 1; // total number b/n min and max
        int y = min + 1; // the first number b/n min and max
        int count = 0; // count the numbers b/n min and max that exists in the array
        for (int k = 0; k < a.length; k++) {

            if (y < max && y == a[k]) {
                count++;
                y++; // the numbers increases up to max
                k = -1; // array must start from the first index after the the number is found or not     // exist
            }
        }
        if (count == x) // the numbers actually existed and the total numbers b/n min and max must be                      // equal
            return 1;
        return 0;
    }

  }
