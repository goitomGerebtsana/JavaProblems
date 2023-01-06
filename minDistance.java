public class minDistance {
    
public static void main(String args[]){
    System.out.print(minDistancee(13013));
}


    static int minDistancee(int n){
        int min=n;
        for(int i=1;i<n;i++){
            if(n%i==0){
                for(int j=i+1;j<n;j++){
                    if(n%j==0){
                        if(min>j-i)
                            min=j-i;
                        break;
                    }
                }
            }
        }
        return min;
    }
}
