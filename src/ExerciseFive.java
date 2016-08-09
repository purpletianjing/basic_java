import java.util.Scanner;

/**
 * Created by tjsun on 8/8/16.
 */
public class ExerciseFive {
    public static void main(String []args) {

        System.out.println("please input the digital for printing *'num:");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        i = 2 * i - 1;
        for (int j = 0; j < i; j++) {
            if (j > i / 2) {
                for (int k = 0; k <= j - i / 2; k++) {
                    System.out.print(" ");
                }
                for (int m = 0; m < 2 * (i - j) - 1; m++) {
                    System.out.print("*");
                }
            } else {
                for (int n = 0; n <= i / 2 - j; n++) {
                    System.out.print(" ");
                }
                for (int h = 0; h < 2 * (j + 1) - 1; h++) {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}
