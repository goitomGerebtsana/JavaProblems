public class sumArray {
    public static void main(String args[]){
        //System.out.print(sumA(a));

        int [][]a=new int [10][10];
        for (int i=0;i<10;i++){
            for (int j=0;j<10;j++){
                System.out.printf("* ");
            }
            System.out.println();
        }
    }

    static int [] a={1,8,5,46,5,5};

   public static int  sumA(int []a){
        int sum=0;
        for(int i=0;i<a.length; i++){
            sum=sum+a[i];
        }
    return sum;
    }


    
}
