/**
 * Created by tjsun on 8/9/16.
 */
public class ExerciseSeven {
    public static void fizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            String resultString = "";
            resultString += i % 3 == 0 ? "Fizz" : "";
            resultString += i % 5 == 0 ? "Buzz" : "";
            if (resultString.isEmpty()) {
                System.out.println(i);
            } else {
                System.out.println(resultString);
            }
        }
    }

    public static void main(String []args) {
        ExerciseSeven.fizzBuzz();
    }
}
