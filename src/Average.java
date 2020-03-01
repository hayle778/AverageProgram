import java.util.Scanner;

public class Average {
public static void main(String[]args) {

Scanner init = new Scanner( System.in );
    System.out.println( "Enter the number 1:" );
    int a = init.nextInt();

    System.out.println( "Enter the number 2:" );
    int b = init.nextInt();

    System.out.println( "Enter the number 3:" );
    int c = init.nextInt();


    int avg = a * b * c/3;

    System.out.println( "Calculate the average: " + avg );





}
}
