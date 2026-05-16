import java.util.*;
class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
       int sum =  primeSum(n);
        System.out.println(sum);
    }
    public static int primeSum(int n){
        int sum = 0;
        for(int i = 2; i <= n; i++){
            if(isPrime(i)){
                sum += i;
            }
        }
        return sum;
    }

    private static boolean isPrime(int x){
        if(x < 2) return false;
        if(x == 2) return true;
        if(x % 2 == 0) return false;
        for(int j = 3; j * j <= x; j += 2){
            if(x % j == 0) return false;
        }
        return true;
    }
}