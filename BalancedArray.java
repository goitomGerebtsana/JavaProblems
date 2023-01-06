public class BalancedArray {

    public static void main(String args[]) {
        //System.out.print(a.length);
        System.out.print(isBalanced(a));

    }

    static int[] a = { 2, 3, 6, 7 };
    static int[] b = { 6, 7, 2, 3, 12 };
    static int[] c = { 7, 15, 2, 3 };
    static int[] d = { 16, 6, 2, 3 };

    static int isBalanced(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0 && a[i] % 2 != 0)
                return 0;
            if  (i % 2 != 0 && a[i]%2 == 0)
                return 0;
        }
        return 1;
    }
}
