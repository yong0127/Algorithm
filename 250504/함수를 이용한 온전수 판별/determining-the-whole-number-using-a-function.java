import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(isTrueValCnt(a, b));
    }

    public static int isTrueValCnt(int a, int b) {

        int numA   = Math.abs(a);
        int numB   = Math.abs(b);
        int tgtCnt = 0;
        // isValid
        for(int i=numA; i<=numB; i++) {
            if(isValid(i)) tgtCnt ++;
        }
        return tgtCnt;
    }

    public static boolean isValid(int i) {
        boolean cond1 = (i % 2 == 0) ? false : true;
        boolean cond3 = (i % 3 == 0 && i % 9 != 00) ? false : true;

        String strI = String.valueOf(i);
        char charI  = strI.charAt(strI.length()-1);

        boolean cond2 = (charI == '5') ? false : true;

        if(cond1 && cond2 && cond3) return true;
        else return false;
    }
}