import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int x = sc.nextInt();
        boolean ans = isArmstrong(x);
        System.out.println(ans);

    }
    public static boolean isArmstrong(int n){
        int y = n;
        int x=n;
        int count =0;
        while(x>0){
            x=x/10;
            count++;
        }
        int sum =0;
        while(n>0){
            int rem = n%10;
            sum = sum + (int)Math.pow(rem,count);
            n = n/10;
        }
        if(y == sum){
            return true;
        }
        return false;
    }
}
