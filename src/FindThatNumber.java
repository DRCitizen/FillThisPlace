import java.util.Scanner;
import java.text.DecimalFormat;

public class FindThatNumber {
    private static Scanner sc;
    public static void main(String [] args) {
        DecimalFormat df = new DecimalFormat("###.#####");
        double number, squareRoot;
        sc = new Scanner(System.in);
        System.out.println("Please Enter any Number:");
        number = sc.nextDouble();

        squareRoot=Math.sqrt(number);

        System.out.println("\n The Square of a Given Number " + df.format(squareRoot));


    }
}
