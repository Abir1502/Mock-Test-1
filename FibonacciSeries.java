import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a limit upto which Fibonacci series you want to print");
        int limit= sc.nextInt();
        int firstNum = 0;
        int secondNum = 1;
        System.out.print(firstNum + " ");

        for (int i = 1; i <= limit; i++) {
            System.out.print(secondNum + " ");

            int nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;

            if (nextNum > limit) {
                break;
            }
        }

        // Close the scanner
        sc.close();
    }

	}


