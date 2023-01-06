/* A Fibonacci number is a number in the sequence 1, 1, 2, 3, 5, 8, 13, 21,…. Note that first two 
Fibonacci numbers are 1 and any Fibonacci number other than the first two is the sum of the previous 
two Fibonacci numbers. For example, 2 = 1 + 1, 3 = 2 + 1, 5 = 3 + 2 and so on.
Write a function named isFibonacci that returns 1 if its integer argument is a Fibonacci number, 
otherwise it returns 0.
 */



public class FebenacciNum {

    public static void main(String args[]) {
        System.out.print(isFeb(4));
    }

    static int isFeb(int n) {
        int result = 0, febb = 0, feba = 1;
        for (int i = 1; i <= n; i++) {
            result = febb + feba;
            if (result == n)
                return 1;
            febb = feba;
            feba = result;
        }
        return 0;
    }

}
