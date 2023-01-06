/*An array is said to be dual if it has an even number of elements and each pair of consecutive even and odd elements 
sum to the same value. Write a function named isDual that accepts an array of integers and returns 1 if the array is dual, otherwise it 
returns 0. Examples: {1, 2, 3, 0} is a dual array (because 1+2 = 3+0 = 3), {1, 2, 2, 1, 3, 0} is a dual array (because 1+2 = 2+1 = 3+0 = 3), 
{1, 1, 2, 2}</td> is not a dual array (because 1+1 is not equal to 2+2), {1, 2, 1}</td> <td> is not a dual array (because array does not 
have an even number of elements), {} is a dual array */

public class DualArray2 {

    public static void main(String args[]) {

        System.out.print(isDual(e));
    }

    static int[] a = { 1, 2, 3, 0 };
    static int[] b = { 1, 2, 2, 1, 3, 0 };
    static int[] c = { 1, 1, 2, 2 };
    static int[] d = { 1, 2, 1 };
    static int[] e = {};

    static int isDual(int[] a) {
        if (a.length % 2 != 0)
            return 0;
        if (a.length == 0)
            return 1;
        int sum = a[0] + a[1];

        for (int j = 2; j < a.length - 1; j++) {
            if (a[j] + a[j + 1] != sum) {
                return 0;
            }
            j = j + 1;
        }
        return 1;
    }
}
