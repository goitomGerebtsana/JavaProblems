public class nice {

public static void main(String args[]){
    System.out.print(isNice(e));

}
static int [] a={2, 10, 9, 3};
static int [] b={2, 2, 3, 3, 3};
static int [] c= {1, 1, 1, 2, 1, 1}; 
static int [] d={0, -1, 1};
static int [] e={3, 4, 5, 7};


    static int isNice(int[] a) {
        int total = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] - 1 == a[j] || a[i] + 1 == a[j]) {
                    total++;
                    break;
                }
            }
        }
        if (total == a.length)
            return 1;
        return 0;
    }
}
