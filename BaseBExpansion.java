import java.util.Scanner;
import java.util.ArrayList;

public class BaseBExpansion {
    public String expander(int n, int b){
        int quo = n;   //quotient
        int exp = 0;   //exponent
        ArrayList<Integer> rem = new ArrayList<Integer>();
        String ret = "";
        while(quo != 0){
            int remain = quo%b;   //remainder
            rem.add(remain);
            quo = quo / b;
            exp++;
        }
        String str = "";
        for(int i = (exp-1); i >= 0; i--) {
            str += (String.valueOf(rem.get(i)));
        }
        return str;
    }

    // not used in main
    // meant for BinaryAdd
    public int expanderInt(int n, int b){
        int quo = n;
        int exp = 0;
        ArrayList<Integer> rem = new ArrayList<Integer>();
        String ret = "";
        while(quo != 0){
            int remain = quo%b;
            rem.add(remain);
            quo = quo / b;
            exp++;
        }
        String str = "";
        for(int i = (exp-1); i >= 0; i--) {
            str += (String.valueOf(rem.get(i)));
        }
        long ans = Long.parseLong(str);
        int answer = (int)ans;
        return answer;
    }

    public static void main(String [] args){
        BaseBExpansion expanded = new BaseBExpansion();
        Scanner scan = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.print("Enter your decimal: ");
            int num = scan.nextInt();
            System.out.print("Enter the base of expansion: ");
            int base = scan.nextInt();
            String answer = expanded.expander(num, base);
            System.out.println(answer);
            System.out.print("Keep going? (Y/N) : ");
            String resp = scan.next();
            if(resp.equalsIgnoreCase("n")){
                run = false;
            }
        }
        System.out.println("This program will now terminate. Goodbye!");
    }
}
