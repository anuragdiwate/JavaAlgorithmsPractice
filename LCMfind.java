import java.util.Scanner;

public class LCMfind {
    public static int lcmfind(int n1, int n2){
        GCDFind find = new GCDFind();
        int mult = n1 * n2;
        int answer = (int)(mult / find.gcffind(n1,n2));
        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean run = true;
        while(run){
            System.out.print("Enter the larger integer: ");
            int first = scan.nextInt();
            System.out.print("Enter the smaller integer: ");
            int second = scan.nextInt();
            System.out.println("The LCM of "+first+" and "+second+" is "+ lcmfind(first, second));
            System.out.println("Keep going? (Y/N): ");
            if(scan.next().equalsIgnoreCase("n")){
                run = false;
                System.out.println("The program will now terminate. Goodbye!");
            }
        }
    }
}
