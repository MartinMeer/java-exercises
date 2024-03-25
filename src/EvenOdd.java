import java.util.Objects;
import java.util.Random;
import java.util.Scanner;


public class EvenOdd {

    private static Random random = new Random();
    private static int randomNumber = random.nextInt(99);
    private static Scanner scanner = new Scanner(System.in);


    public static void playEvenOdd() {
        int counter = 1;
        while (counter < 4) {
            int number = randomNumber;
            String correctAnswer = checkNumber(randomNumber);
            System.out.println("Question: " +
                    number +
                    "\nYour answer: ");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase(correctAnswer)) {
                counter++;
            }
            System.out.println("\'" +answer+ "\' is wrong answer ;(. Correct answer was \'" +correctAnswer+ "\'.\n" +
                    "Let's try again, Bill!");
        }
    }
    private static String checkNumber(int number) {
        if ((number % 2) == 0) {
        return "yes";
        }else {return "no";
        }
    }


}
