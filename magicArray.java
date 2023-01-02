public class magicArray {
    
    public static void main(String args[]){

       // System.out.print(isPrime(5));

        System.out.print(isMagic(d));

    }

    static int []a ={21,3,7,9,11,4,6,};
    static int []b ={13,4,4,4,4};
    static int []c={10,5,5};
    static int []d={0,6,8,20};
    static int []e={0};


    static int isMagic(int []a){
        if(a.length==0)
            return 0;
        int sum=0; //Sum of all primes exist in the array
        for(int i=0;i<a.length;i++){
            if(isPrime(a[i]))
                sum=sum+a[i];  
        }

        if(sum==a[0])
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
