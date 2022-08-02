import java.util.Scanner;
public class Ex4 {

    public static void main(String[] args) {
        int a, b, c, max, num;

        Scanner sc = new Scanner(System.in);

        System.out.println( "1'st number -> " );
        a = sc.nextInt();

        System.out.println( "2'nd number -> " );
        b = sc.nextInt();

        System.out.println( "3'st number -> " );
        c = sc.nextInt();

        num=a>b?a:b;
        max=c>num?c:num;

        System.out.println( "large numb -> " + max );
    }
}
