/*An array is defined to be a Magic array if the sum of the primes in the array is equal to the first 
element of the array. If there are no primes in the array, the first element must be 0. So {21, 3, 7, 9, 
11 4, 6} is a Magic array because 3, 7, 11 are the primes in the array and they sum to 21 which is the 
first element of the array. {13, 4, 4, 4, 4} is also a Magic array because the sum of the primes is 13 
which is also the first element. Other Magic arrays are {10, 5, 5}, {0, 6, 8, 20} and {3}. {0} is not a 
Magic array because the sum of the primes is 5+5+3 = 13. Note that -5 is not a prime because prime 
numbers are positive. 
Write a function named isMagicArray that returns 1 if its integer array argument is a Magic array. 
Otherwise it returns 0.
*/



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
