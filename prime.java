import java.util.Scanner;

public class prime {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = s1.nextInt();

        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }

        s1.close();
    }
}