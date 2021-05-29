import java.util.Scanner;
import java.util.ArrayList;

public class SieveofErastosthenes {
    public void sieve(int max) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for (int i = 1; i <= max; i++) {
            boolean divi2 = i == 2 || (i % 2 != 0);
            boolean divi3 = i == 3 || (i % 3 != 0);
            boolean divi5 = i == 5 || (i % 5 != 0);
            boolean divi7 = i == 7 || (i % 7 != 0);

            if (divi2 && divi3 && divi5 && divi7) {
                primes.add(i);
            }
        }
        for (int j = 0; j < primes.size(); j++) {
            System.out.print(primes.get(j) + " ");
        }
    }

    public static void main(String[] args) {
        SieveofErastosthenes sev = new SieveofErastosthenes();
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.print("Enter the max number of the list: ");
            int max = scanner.nextInt();
            System.out.println("The primes in this range are: ");
            sev.sieve(max);
            System.out.println("\nKeep Going? (Y/N): ");
            if (scanner.next().equalsIgnoreCase("n")) {
                run = false;
                System.out.println("The program will now terminate. Goodbye!");
            }
        }
    }
}
