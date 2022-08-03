import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
    int num;
    Scanner sc = new Scanner(System.in);
    System.out.print("Your number -> ");
    num = sc.nextInt();

    if ( num > 0 ){
        System.out.println("It's positve");
    }

    else if( num < 0 ){
        System.out.println("It's negative");
    }

    else {
        System.out.println("THIS IS ZERO");
    }


    }
}
