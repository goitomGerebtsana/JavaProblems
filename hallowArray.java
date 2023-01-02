public class hallowArray {
    
    public static void main(String args[]){
        System.out.print(isHallow(h));
       // System.out.print(a.length);
    }

    static int [] a={1,6,3,0,0,0,6,9,4};
    static int [] b={1,2,0,0,0,3,4};
    static int [] c={1,1,1,1,0,0,0,0,0,2,1,2,18};
    static int [] d={1, 2, 0, 0, 3, 4};
    static int [] e={1,2,0,0,0,3,4,5};
    static int [] f= {1,2,0,0,0,3,4,0};
    static int [] h={0,0,0,0}; 

    static int isHallow(int []a){
        if (a.length<3)
            return 0;
        // if (a.length>=3 && a[a.length-1]==0)
        //     return 0;
        int middle=a.length/2;

        if((a[middle]!=0) || (a[middle-1]!=0) || (a[middle+1]!=0))
            return 0;
            //int middleZeroCount=0;
            int preNonZeroCount=0;
            int PostNonZeroCount=0;
        
        for(int i=0;i<a.length;i++){

            if(i<middle && a[i]!=0)
                preNonZeroCount++;
            if(i>middle && a[i]!=0)
                PostNonZeroCount++;

        }

        if(preNonZeroCount!=PostNonZeroCount)
           return 0;
        return 1;
    }
}
