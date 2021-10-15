public class fibo {
    public static void main(String[] args) {
        int n=5;
        fib(n);
    }
    public static void fib(int n){
        int first=0;
        int second=1;
        int fib=0;
        for(int i=0;i<n;i++){
            fib=first+second;
            first=second;
            second=fib;
        }
        System.out.println(fib);
    }
}
