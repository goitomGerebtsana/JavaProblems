
public class meeraArray {
    
    public static void main(String args[]){
        System.out.print(isMeera(e));
        System.out.print(isMeera2(e));
    }

    static int []a= {7, 6, 0, 10, 1};
    static int []b={6, 10, 1} ;
    static int []c={7, 6, 10};
    static int []d={6, 10, 0};
    static int []e={3, 7, 0, 8, 0, 5};

    static int isMeera(int []a){
        int zero=0;
        int prime=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                zero++;
                break;
            }
        }
        for(int j=0;j<a.length;j++){
            if(isPrime(a[j])){
                prime++;
                break;
            }
        }
        
        if(zero==0 && prime==0) // 
            return 1;
        if(zero>0 && prime>0)
            return 1;
        return 0;
    }

    static int isMeera2(int []a){
        boolean zero=false;
        boolean prime=false;

        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                zero=true;
                break;
            }
        }
        for(int j=0;j<a.length;j++){
            if(isPrime(a[j])){
                prime=true;
                break;
            }
        }
        if(zero==false && prime==false)  // if(!zero && !prime)
            return 1;
        if(zero==true && prime==true)   // if(zero && prime)
            return 1;
        return 0;
    }

    static boolean isPrime(int n){
        if(n<2)
            return false;
        boolean prime=true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                 prime= false;
            }
        }
        return prime;
    }
}
