import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args){
        Sum();
        System.out.println(sum2());
    }

    //when there is no return type
    public static void Sum(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number:");
        int num2= scanner.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is " + sum);
    }

   //when there is a return type
    public static int sum2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter second number:");
        int num2 = sc.nextInt();
        int sum= num1 + num2;
        System.out.println("The sum is:");
        return sum;
    }
}
