/*An array is defined to be odd-heavy if it contains at least one odd element and every odd element 
is greater than every even element. So {11, 4, 9, 2, 8} is odd-heavy because the two odd elements (11 and 9) 
are greater than all the even elements. And {11, 4, 9, 2, 3, 10} is not odd-heavy because the even element 10 is 
greater than the odd element 9. Write a function called isOddHeavy that accepts an integer array and returns 
1 if the array is odd-heavy; otherwise it returns 0. Some other examples: {1} is odd-heavy, {2} is not oddheavy, {1, 1, 1, 1} is odd-heavy, {2, 4, 6, 8, 11} is odd-heavy, {-2, -4, -6, -8, -11} is not odd */



public class OddHeavy {

    public static void main(String args[]){

            System.out.print(isOddHeavy(e));
    }

    static int []a={11, 4, 9, 2, 8}; // 1
    static int []b={11, 4, 9, 2, 3, 10};//0
    static int []c={1, 1, 1, 1};//1
    static int []d={2, 4, 6, 8, 11};//1
    static int []e={-2, -4, -6, -8, -11};//0
    

    static int isOddHeavy(int []a){

        for(int i=0;i<a.length;i++){
            if(a[i]%2!=0){
                for(int j=0;j<a.length;j++){
                    if(a[j]%2==0 && a[j]>a[i])
                        return 0;
                }
            }
        }
        return 1;
    }
}
