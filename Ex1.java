import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.print("Your 1'st number ->");
        int num1 = in.nextInt();

        System.out.print("Your 2'nd number ->");
        int num2 = in.nextInt();

        System.out.println(num1 + "+" + num2 + "=" +(num1 + num2));
        System.out.println(num1 + "-" + num2 + "=" +(num1 - num2));
        System.out.println(num1 + "x" + num2 + "=" +(num1 * num2));
        System.out.println(num1 + ":" + num2 + "=" +(num1 / num2));
        System.out.println(num1 + "mod" + num2 + "=" +(num1 % num2));

    }
}