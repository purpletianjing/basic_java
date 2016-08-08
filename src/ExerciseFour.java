import java.util.Scanner;

/**
 * Created by tjsun on 8/8/16.
 */
public class ExerciseFour {
    public static void main(String []args) {
        System.out.println("please input the digital for printing *'num:");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        for (int j = 0; j < i; j++) {
            for (int k = 0; k <= j; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
