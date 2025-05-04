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

        boolean cond1 = true;
        boolean cond2;

        for(int j=2; j<i; j++) {
            if(i % j == 0) {
                cond1 = false;
                break;
            }
        }

        if(cond1) {
            int tenDigits  = i/10;
            int unitDigits = i%10;
            int totNum = tenDigits + unitDigits;
            cond2 = (totNum % 2 == 0) ? true : false;

            if(cond2) return true;
            else return false;
        } else {
            return false;
        }        
    }
}