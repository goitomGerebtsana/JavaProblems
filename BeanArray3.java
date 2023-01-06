/*A Bean array is defined to be an integer array where for every value n in the array, there is also an 
element 2n, 2n+1 or n/2 in the array. 
For example, {4, 9, 8} is a Bean array because
For 4, 8 is present; for 9, 4 is present; for 8, 4 is present.
Other Bean arrays include {2, 2, 5, 11, 23}, {7, 7, 3, 6} and {0}.
The array {3, 8, 4} is not a Bean array because of the value 3 which requires that the array contains 
either the value 6, 7 or 1 and none of these values are in the array.
Write a function named isBean that returns 1 if its array argument is a Bean array. Otherwise it 
returns a 0. */


public class BeanArray3 {
    
    public static void main(String args[]) {
        System.out.print(isBean(d));
    }

    static int []a={4,9,8};
    static int []b={2,2,5,11,23};
    static int []c={7,7,3,6};
    static int []d={3,8,4};


    static int isBean(int []a){
        int count=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i]/2==a[j] || a[i]*2==a[j] || ((a[i]*2)+1)==a[j]){
                    count++;
                    break;
                }
                    
            }
        }
        if(count==a.length)
            return 1;
        return 0;
    }
   
}
