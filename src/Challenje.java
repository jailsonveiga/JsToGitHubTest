// Multiple of 100

public class Challenje {
    public static void main(String[] args) {
        System.out.println(divisible(1));
        System.out.println(divisible(1000));
        System.out.println(divisible(100));
    }
    public static boolean divisible(int num) {
        return num % 100 == 0;
    }
}
