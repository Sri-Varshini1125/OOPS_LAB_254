public class IncDecRelational {
    public static void main(String[] args) {

        int a = 10;
        int b = 8;
        a++;
        b--;

        System.out.println("a after increment: " + a);
        System.out.println("b after decrement: " + b);

        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
    }
}
