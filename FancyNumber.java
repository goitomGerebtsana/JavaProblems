/* A fancy number is a number in the sequence 1, 1, 5, 17, 61, … .Note that first two fancy numbers 
are 1 and any fancy number other than the first two is sum of the three times previous one and two 
times the one before that. See below: 
1,
1,
3*1 +2*1 = 5
3*5 +2*1 = 17
3*17 + 2*5 = 61
Write a function named isFancy that returns 1 if its integer argument is a Fancy number, otherwise it 
returns 0 */

public class FancyNumber {
    public static void main(String args[]) {
        
        System.out.print(isFancy(6));
    }

    static int isFancy(int n){
        int fancyNext=0;
        int fancy1=1;
        int fancy2=1;

        if(n==1)
            return 1;

        for(int i=1;i<=n;i++){
            
            fancyNext=3*fancy2 + 2*fancy1;

            if(fancyNext==n)
                return 1;
            fancy1=fancy2;
            fancy2=fancyNext;
        }
        return 0;
    }
}
