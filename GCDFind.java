import java.util.Scanner;


public class GCDFind {

    // follows Euclidean Algorithm
    public int gcffind(int n1, int n2) {
        if(n2 == 0){
            return 0;
        }
        int big = n2;
        int rem = n1 % big;
        while(rem != 0){
            int init = rem;
            rem = big % rem;
            big = init;
        }
        return big;
    }

    public static void main(String[] args) {
        GCDFind gcd = new GCDFind();
        Scanner scan = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.print("What's the larger integer?: ");
            int first = scan.nextInt();
            System.out.print("What's the smaller integer?: ");
            int second = scan.nextInt();
            System.out.println("The Greatest Common Divisor between " + first + " and " + second + " is " + gcd.gcffind(first, second));
            System.out.print("Keep Going? (Y/N): ");
            if (scan.next().equalsIgnoreCase("n")) {
                run = false;
                System.out.println("The program will now terminate. Goodbye!");
            }
        }
    }
}
