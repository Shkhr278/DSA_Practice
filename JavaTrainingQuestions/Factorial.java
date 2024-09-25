package JavaTrainingQuestions;
import java.util.Scanner;

public class Factorial {
    public static int findFactorial(int number) {
        int result = 1;

        for (int i = 2; i <= number; i++) {
            result *= i; 
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number to find its factorial: ");
        int num = input.nextInt(); 

        int factorial = findFactorial(num);

        System.out.println("The factorial of " + num + " is: " + factorial);

        input.close();
    }
}
