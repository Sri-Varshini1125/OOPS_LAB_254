public class LogicalOperatorsExample {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        a++;
        b--;

        System.out.println("AND (a > b && a > 0): " + (a > b && a > 0));
        System.out.println("OR  (a < b || b > 0): " + (a < b || b > 0));
        System.out.println("NOT !(a == b): " + !(a == b));
    }
}
