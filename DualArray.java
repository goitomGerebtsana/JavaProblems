/*Define a Dual array to be an array where every value occurs exactly twice. 
For example, {1, 2, 1, 3, 3, 2} is a dual array.
The following arrays are not Dual arrays
{2, 5, 2, 5, 5} (5 occurs three times instead of two times)
{3, 1, 1, 2, 2} (3 occurs once instead of two times)
Write a function named isDual that returns 1 if its array argument is a Dual array. Otherwise it returns 
0. */


public class DualArray {
    public static void main(String args[]) {
        System.out.print(isDual(c));
        
    }
    
    static int []a={1, 2, 1, 3, 3, 2};
    static int []b={2, 5, 2, 5, 5};
    static int []c={3, 1, 1, 2, 2};

    static int isDual(int []a){
        int count=0;

        for(int i=0;i<a.length;i++){
            int countEach=0;
            for(int j=0;j<a.length;j++){
                if(a[i]==a[j])
                    countEach++;
            }
        if(countEach!=2){
            return 0;
        }
        count++;
        }
        if(count==a.length)
            return 1;
        return 0;
    }
}


