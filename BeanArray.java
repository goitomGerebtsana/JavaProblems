/*An array is defined to be a Bean array if it meets the following conditions
    a. If it contains a 9 then it also contains a 13.
    b. If it contains a 7 then it does not contain a 16.
So {1, 2, 3, 9, 6, 13} and {3, 4, 6, 7, 13, 15}, {1, 2, 3, 4, 10, 11, 12} and {3, 6, 9, 5, 7, 13, 6, 17} are 
Bean arrays. The following arrays are not Bean arrays:
 a. { 9, 6, 18} (contains a 9 but no 13)
 b. {4, 7, 16} (contains both a 7 and a 16)

Write a function named isBean that returns 1 if its array argument is a Bean array, otherwise it returns 0 */

public class BeanArray {

    public static void main(String args[]) {
        System.out.print(isBean(e));

    }

    static int[] a = { 1, 2, 3, 9, 6, 13 };
    static int[] b = { 3, 4, 6, 7, 13, 15 };
    static int[] c = { 1, 2, 3, 4, 10, 11, 12 };
    static int[] d = { 3, 6, 9, 5, 7, 13, 6, 17 };
    static int[] e = { 9, 6, 18 };
    static int[] f = { 4, 7, 16 };

    static int isBean(int[] a) {

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 7) {
                for (int j = 0; j < a.length; j++) {
                    if (a[j] == 16)
                        return 0;
                }
            }
            if (a[i] == 9) {
                for (int j = 0; j < a.length; j++) {
                    if (a[j] != 13)
                        return 0;
                }
            }

        }
        return 1;
    }

    // Second solution

    static int isBeanArr(int [] a) {
        boolean nine = false;
        boolean thirteen = false;
        boolean seven = false;
        boolean sixteen = true;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 9)
                nine = true;
            if (a[i] == 13)
                thirteen = true;
            if (a[i] == 7)
                seven = true;
            if (a[i] == 16)
                sixteen = false;
        }
        if (nine) {
            if (!thirteen)
                return 0;
        if (seven) {
            if (sixteen)
                return 0;
            
            }
        }
        return 1;
    }
}
