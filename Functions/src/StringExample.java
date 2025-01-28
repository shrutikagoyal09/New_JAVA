import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        System.out.println(example());

    }
    public static String example(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How are you?");
        String ans = sc.nextLine();
        return ans;
    }
}
