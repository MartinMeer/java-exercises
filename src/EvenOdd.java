import java.util.Objects;
import java.util.Random;
import java.util.Scanner;


public class EvenOdd {

    private static Random random = new Random();
    //private static int randomNumber = random.nextInt(99);
    private static Scanner scanner = new Scanner(System.in);


    public static void playEvenOdd() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int counter = 0;
        while (counter < 3) {
            int randomNumber = random.nextInt(99);
            String correctAnswer = checkNumber(randomNumber);
            System.out.print("Question: " +
                    randomNumber +
                    "\nYour answer: ");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase(correctAnswer)) {
                System.out.println("Correct!");
                counter += 1;
            } else {
                System.out.println("\'" + answer + "\' is wrong answer ;(. Correct answer was \'" + correctAnswer + "\'.\n" +
                        "Let's try again, NULL!");
                counter = 4;
            }
            //System.exit(0);
        }
    }
        private static String checkNumber(int number){
            if ((number % 2) == 0) {
                return "yes";
            } else {
                return "no";
        }
    }
}



