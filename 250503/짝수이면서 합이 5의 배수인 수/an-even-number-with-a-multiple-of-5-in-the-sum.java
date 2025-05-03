import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n      = sc.nextInt();
        String msg = "";

        if(isTrueVal(n)) msg = "Yes";
        else msg = "No";

        System.out.print(msg);
    }

    public static boolean isTrueVal(int n) {
        int tenDigits  = n / 10;
        int unitDigits = n % 10;
        int sumVal = tenDigits + unitDigits;

        if(n%2==0 && sumVal%5 ==0) return true;
        else return false;
    }
}