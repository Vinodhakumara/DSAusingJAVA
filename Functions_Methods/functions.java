
import java.util.Scanner;
public class functions {
    public static void main(String[] args) {
        // Scanner scan= new Scanner(System.in);
        int a= 4;
        int b= 6;
        sum(a, b);
        int n= 0;
        System.out.println(isPrime(n));
        for (int i = 100; i < 1000; i++) {
            if(armstrongNumber(i)){
                System.out.println(i);
            }
        }

    }

    static boolean armstrongNumber(int n){
        int rem,res,sum=0;
        int original=n;
        while(n>0){
            rem= n%10;
            res=rem*rem*rem;
            sum+=res;
            n=n/10;
        }
        if(original == sum){
            return true;
        }else{
        return false;
    }
    }
    static int sum(int a,int b){
        return a+b;
    }

    static String isPrime(int n){
        if(n<=1){
            return "Neither Prime or Not Prime";
        }
        int c=2;
        while(c*c <= n){
            if(n % c == 0)
            {
                return "Not Prime number";
            }
            c++;
        }
        return "Prime";
    }
}
