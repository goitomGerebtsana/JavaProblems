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
