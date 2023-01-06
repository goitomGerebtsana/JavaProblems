
public class Bunker {

    public static void main(String args[]){
        //System.out.print(isPrime(7));
        System.out.print(isBunker(d));
    }

    static int [] a={7,1,2};
    static int [] b={2,16,6,3};
    static int [] c={1,4,9,10};
    static int [] d={5,6,8,10,12,1,1};

    static int isBunker(int[] a) {
        boolean isOne = false;
        for (int i = 0; i < a.length; i++)
            if (a[i] == 1) {
                isOne = true;
                break;
            }
        for (int j = 0; j < a.length; j++)
            if (isOne && isPrime(a[j]) && a[j] != 1) 
                return 1;
        return 0;
    }
    
    static boolean isPrime(int n){
        boolean prime=true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                 prime= false;
            }
        }
        return prime;
    }

}

