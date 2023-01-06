/*A Bean array is defined to be an array where for every value n in the array, there is also an 
element n-1 or n+1 in the array. 
For example, {2, 10, 9, 3} is a Bean array because
2 = 3-1
10 = 9+1
3 = 2 + 1
9 = 10 -1
Other Bean arrays include {2, 2, 3, 3, 3}, {1, 1, 1, 2, 1, 1} and {0, -1, 1}.
The array {3, 4, 5, 7} is not a Bean array because of the value 7 which requires that the array 
contains either the value 6 (7-1) or 8 (7+1) but neither of these values are in the array.
19
Write a function named isBean that returns 1 if its array argument is a Bean array. Otherwise it 
returns a 0 */


public class BeanArray2 {
    
    public static void main(String args[]){
        System.out.print(isBean(e));
    }

    static int[] a= {2, 10, 9, 3};
    static int[] b={2, 2, 3, 3, 3};
    static int []c= {1, 1, 1, 2, 1, 1};
    static int []d={0, -1, 1};
    static int []e={3, 4, 5, 7};

    static int isBean(int []a){
        int count =0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i]+1==a[j] || a[i]-1==a[j]){
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
