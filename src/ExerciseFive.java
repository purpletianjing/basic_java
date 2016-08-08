import java.util.Scanner;

/**
 * Created by tjsun on 8/8/16.
 */
public class ExerciseFive {
    public static void main(String []args) {
        int everyNum = 1;
        System.out.println("please input the digital for printing *'num:");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        i = 2 * i - 1;
        for (int j = 0; j < i; j++) {
            for (int k = 0; k < everyNum; k++) {
                System.out.print("*");
            }
            System.out.println();
            everyNum += 2;
            if (j >= i / 2) {
                everyNum -= 4;
            }
        }
    }
}
