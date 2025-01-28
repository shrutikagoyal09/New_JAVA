public class Overloading {
    public static void main(String[] args) {
        fun(1);
        fun("Shrutika");
        fun(1,"Shrutika");
        fun("Shrutika",1);
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String a){
        System.out.println(a);
    }
    static void fun(int a, String b){
        System.out.println(a + " " + b);
    }
    static void fun(String a, int b){
        System.out.println(a + " " + b);
    }
}
