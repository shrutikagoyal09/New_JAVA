import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = sc.nextInt();
        boolean ans = isPrime(x);
        System.out.println(ans);
    }
    public static boolean isPrime(int a){
        for(int i=2; i<a/2; i++){
            if(a%i == 0){
                return false;
            }
        }
        return true;
    }
}
