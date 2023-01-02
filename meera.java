public class meera {
    
public static void main(String args[]){
    System.out.print(isMeera(7));
}

static int isMeera(int n){
    int count=0;
    for(int i=2;i<n;i++){
        if(n%i==0)
            count++;
    }
    if(count==0)
        return 0;
    if(n%count==0)
        return 1;
    return 0;
}
}