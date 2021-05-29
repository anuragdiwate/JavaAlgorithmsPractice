import java.util.Scanner;

public class ModularExponentiation {
    public int modExp(int b, int n, int m) {
        BaseBExpansion bin = new BaseBExpansion();
        String binary = bin.expander(n, 2);
        int x = 1;
        int power = b % m;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.substring(binary.length() - i - 1, binary.length() - i).equals("1")) {
                x = (x * power) % m;
            }
            power = (power * power) % m;
        }
        return x;
    }

    public static void main(String[] args) {
        ModularExponentiation modder = new ModularExponentiation();
        Scanner scan = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.print("Enter the integer: ");
            int b = scan.nextInt();
            System.out.print("Enter the exponent: ");
            int n = scan.nextInt();
            System.out.print("Enter the mod value: ");
            int m = scan.nextInt();
            System.out.println("The modular exponentiation is " +
                    modder.modExp(b, n, m));
            System.out.print("Keep Going? (Y/N): ");
            if (scan.next().equalsIgnoreCase("n")) {
                System.out.println("The program will now terminate. Goodbye!");
                run = false;
            }
        }
    }
}
