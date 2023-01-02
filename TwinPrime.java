public class TwinPrime {

    public static void main(String args[]) {

        System.out.print(isTwinPrime(53));
    }

    static int isTwinPrime(int n) {

        int lower, upper;
        lower = n - 2;
        upper = n + 2;
        int upreturn = 1, lowreturn = 1;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        for (int j = 2; j < lower; j++) {
            if (lower % j == 0) {
                lowreturn = 0;
            }
        }
        for (int k = 2; k < upper; k++) {
            if (upper % k == 0) {
                upreturn = 0;
            }
        }
        if (lowreturn == 1 || upreturn == 1) {
            return 1;
        } else {
            return 0;
        }
    }

}