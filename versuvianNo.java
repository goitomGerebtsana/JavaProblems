
class versuvian{

    public static void main(String args[]){

       System.out.println(isSquare(1));
        System.out.println(isVersuvian(50));

    }

    public static int isVersuvian(int n){

        int pairCount=0;
        for(int i=1;i<n;i++){
            int first=i;
            int second=n-i;
            
            if (isSquare(first) & isSquare(second)){
                pairCount++;
            }
           
        }

    if(pairCount>=2){
        return 1;
    }
    else{
        return 0;
    }
    }

    public static boolean isSquare(int n){
        boolean square=false;

        if(n==1 || n==4){
            square=true;
        }
        for(int i=1;i<=n/2;i++){
            if((n%i==0 && n/i==i)){
               square=true;
               break;
            }
            else{
                square=false;
            }
        }
        return square;
    }

}
