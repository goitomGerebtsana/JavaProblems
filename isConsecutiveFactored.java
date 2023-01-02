public class isConsecutiveFactored {
    
    public static void main(String args[]){

        System.out.print(isConsectiveFactored(105));
    }


static int isConsectiveFactored(int n) {
    int first = 1, second = 1;
    if (n > 0) {
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                second = first;
                first = i;
                if (first == second + 1 && second > 1) {
                    return 1;
                }
            }
        }
    }
    return 0;

}
}
