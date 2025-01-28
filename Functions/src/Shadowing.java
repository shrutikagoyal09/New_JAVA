public class Shadowing {
     static int x =90;
    public static void main(String[] args) {
//        System.out.println(x);
        int x;
        System.out.println(Shadowing.x);
        x =40;
        System.out.println(x);
        System.out.println(Shadowing.x);
        fun();
    }

    private static void fun() {
        System.out.println(x);
    }
}
