

public class Swapping {
    public static void main(String[] args) {
        int a =10;
        int b =20;
        swap(a,b);
        System.out.println(a + " " + b); // will print values of a and b that are 10 and 20
    }
    public static void swap(int c, int d){
        int temp =c;
        c = d;
        d = temp;
        System.out.println(c + " " + d); // will print swapped values of c and d that are 20 and 10
    }

}
