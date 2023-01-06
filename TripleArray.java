/*Define a Triple array to be an array where every value occurs exactly three times. 
For example, {3, 1, 2, 1, 3, 1, 3, 2, 2} is a Triple array.
The following arrays are not Triple arrays
{2, 5, 2, 5, 5, 2, 5} (5 occurs four times instead of three times)
{3, 1, 1, 1} (3 occurs once instead of three times)
Write a function named isTriple that returns 1 if its array argument is a Triple array. Otherwise it 
returns 0 */



public class TripleArray {

    public static void main(String args[]) {

        System.out.print(isTriple(c));
        System.out.print(fill(c));

    }

    static int[] a = { 3, 1, 2, 1, 3, 1, 3, 2, 2 };
    static int[] b = { 2, 5, 2, 5, 5, 2, 5 };
    static int[] c = { 3, 1, 1, 1 };

    static int isTriple(int[] a) {

        int count = 0;
        int counttwo = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j])
                    counttwo++;
            }
            if (counttwo != 3)
                return 0;
            else
                count++;
            counttwo = 0;
        }
        if (count == a.length)
            return 1;
        return 0;
    }

    // second solutionS
    static int fill(int[] a) {
        for (int i = 0; i < a.length; i++) {

            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j])
                    count++;
            }
            if (count != 3)
                return 0;
        }

        return 1;
    }
}
