public class PrimeProduct {
    
    public static void main(String args[]){
        System.out.print(isPrimeProduct(150));
    }

    static int isPrimeProduct(int n){
        if(n<2)
            return 0;
        for(int i=2;i<=n/2;i++){
            for(int j=2;j<=n/2;j++){
                if(i*j==n && (isPrime(i)&&isPrime(j)))
                    return 1;
            }
        }
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
