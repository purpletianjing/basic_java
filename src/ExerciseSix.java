import java.util.Scanner;

/**
 * Created by tjsun on 8/8/16.
 */
public class ExerciseSix {
    public static void main(String[] args) {
        System.out.println("please input the digital for printing *'num:");
        Scanner scanner = new Scanner(System.in);
        int i = 2 * scanner.nextInt() - 1;
        int spaceNum = 0;
        int asteriskNum = 0;
        for (int j = 0; j < i; j++) {
            if (j == i / 2) {
                System.out.println("Tianjing Sun");
                continue;
            }
            if (j > i / 2) {
                spaceNum = j - i / 2;
                asteriskNum = 2 * (i - j) - 1;
            } else {
                spaceNum = i / 2 - j;
                asteriskNum = 2 * (j + 1) - 1;
            }
            for (int k = 0; k <= spaceNum; k++) {
                System.out.print(" ");
            }
            for (int m = 0; m < asteriskNum; m++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
