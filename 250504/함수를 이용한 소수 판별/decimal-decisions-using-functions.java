import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.print(isTrueValSumm(a,b));
    }

    public static int isTrueValSumm(int a, int b) {
        int numA   = Math.abs(a);
        int numB   = Math.abs(b);
        int totNum = 0;

        for(int i=numA; i<=numB; i++) {
            if(isValid(i)) totNum += i;
        }
        return totNum;
    }

    public static boolean isValid(int validTgtNum) {
        for(int j=2; j<validTgtNum; j++) {
            if(validTgtNum % j == 0) return false;
        }
        return true;
    }
}