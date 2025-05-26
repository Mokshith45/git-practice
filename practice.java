import java.util.List;
import java.util.Scanner;

public class Main {

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrimeNumbers(List<Integer> numbers) {
        for (int number : numbers) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 15, 22, 33, 40, 7, 11, 29, 23);

        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number + " is Even");
            } else {
                System.out.println(number + " is Odd");
            }
        }
        System.out.print("Prime numbers: ");
        printPrimeNumbers(numbers);
    }
}
