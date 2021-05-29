import java.util.Scanner;

public class BinaryAdd {
    public String add(int num1, int num2) {
        BaseBExpansion expand = new BaseBExpansion();
        num1 = expand.expanderInt(num1, 2);
        num2 = expand.expanderInt(num2, 2);
        System.out.println("The first number converted to binary is represented as: " + num1);
        //System.out.println("The second number converted to binary is represented as: " + num2);
        String numSize1 = Integer.toString(num1);
        String numSize = Integer.toString(num2);
        String numSize2 = "";
        int buffer = (numSize1.length())-(numSize.length());
        for(int i = 0; i < buffer; i++){
            numSize2 += "0";
        }
        numSize2 += numSize;
        System.out.println("The second number converted to binary is represented as: " + numSize2);

        int carry = 0;
        int add1, add2, finCarry = 0;
        String sum = "";
        for(int j = 0; j < (numSize1.length()); j++){
            add1 = Integer.parseInt(numSize1.substring(numSize1.length() - j - 1, numSize1.length() - j));
            add2 = Integer.parseInt(numSize2.substring(numSize1.length() - j - 1, numSize1.length() - j));
            int d = (int)Math.floor((add1+add2+carry)/2);
            sum += String.valueOf((add1+add2+carry-(2*d)));
            carry = d;
            finCarry = carry;
        }
        sum += String.valueOf(finCarry);
        return sum;
    }

    // Not part of the algorithm
    public String addCut(int n1, int n2){
        BaseBExpansion expand = new BaseBExpansion();
        int num1 = expand.expanderInt(n1, 2);
        int num2 = expand.expanderInt(n2, 2);
        System.out.println("The first number converted to binary is represented as: " + num1);
        //System.out.println("The second number converted to binary is represented as: " + num2);
        String numSize1 = Integer.toString(num1);
        String numSize = Integer.toString(num2);
        String numSize2 = "";
        int buffer = (numSize1.length())-(numSize.length());
        for(int i = 0; i < buffer; i++){
            numSize2 += "0";
        }
        numSize2 += numSize;
        System.out.println("The second number converted to binary is represented as: " + numSize2);

        return expand.expander(n1+n2, 2);
    }

    public static void main(String[] args) {
        BinaryAdd adder = new BinaryAdd();
        Scanner scan = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.print("Enter the first number(the larger one): ");
            int num1 = scan.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = scan.nextInt();
            String sum = adder.add(num1, num2);
            System.out.println("The binary result of adding the two numbers is: " + sum);
            System.out.println("Keep going? (Y/N): ");
            if(scan.next().equalsIgnoreCase("n")){
                System.out.println("The program will now terminate. Goodbye!");
                run = false;
            }
        }
    }
}
