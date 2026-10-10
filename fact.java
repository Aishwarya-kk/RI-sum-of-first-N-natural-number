public class fact{
    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        int fn1=factorial(n-1);
        int fn2 =n+fn1;
        return fn2;


    }
    public static void main(String args[]){
        int n=5;
        System.out.println(factorial(n));
    }
}