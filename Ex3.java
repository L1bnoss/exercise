import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a -> " + a + " b -> " +b);

        a = a ^b;
        b = b ^ a;
        a = a ^ b;

        System.out.println("a -> " + a + " b -> " + b);

    }
}