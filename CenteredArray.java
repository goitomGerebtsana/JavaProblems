/*An array with an odd number of elements is said to be centered if all elements (except the 
middle one) are strictly greater than the value of the middle element. Note that only arrays with an odd 
number of elements have a middle element. Write a function named isCentered that accepts an integer array 
and returns 1 if it is a centered array, otherwise it returns 0. Examples: {1, 2, 3, 4, 5} is not a centered array 
(the middle element 3 is not strictly less than all other elements), {3, 2, 1, 4, 5} is centered (the middle 
element 1 is strictly less than all other elements), {3, 2, 1, 4, 1} is not centered (the middle element 1 is not 
strictly less than all other elements), {3, 2, 1, 1, 4, 6} is not centered (no middle element since array has even 
number of elements), {} is not centered (no middle element), {1} is centered (satisfies the condition 
vacuously).  */


public class CenteredArray {
    
    public static void main(String args[]){
        System.out.print(isCentered(e));
    }
    
    static int []a={1,2,3,4,5};
    static int []b={3, 2, 1, 4, 5};
    static int []c= {3, 2, 1, 4, 1};
    static int []d= {3, 2, 1, 1, 4, 6};
    static int []e={};
    static int []f={1};


    static int isCentered(int []a){
        if(a.length%2==0 )
            return 0;
        

        for(int i=0;i<a.length;i++){
            if(a[a.length/2]>=a[i] && i!=a.length/2)
                return 0;
        }
        return 1;
        
    }
}
