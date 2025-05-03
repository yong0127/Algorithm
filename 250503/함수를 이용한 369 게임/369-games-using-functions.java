import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        // Please write your code here.

        System.out.print(getRsltVal(A,B));
    }

    public static int getRsltVal(int A, int B) {
        int rsltVal = 0;
        for(int i=A; i<=B; i++) {   // 22 ~ 33
            if(isTgtVal(i) || isMultVal(i)) {
                rsltVal ++;
            }
        }
        return rsltVal;
    }

    public static boolean isTgtVal(int i) {
        int tensDigit = i / 10;
        int unitDigit = i % 10;
        int[] tgtValArr = {3,6,9};

        for(int j=0; j<tgtValArr.length; j++) {
            if(tensDigit == tgtValArr[j] || unitDigit == tgtValArr[j]) {
                return true;
            }
        }
        return false;
    }

    public static boolean isMultVal(int i) {
        if(i%3 == 0) return true;
        else return false;
    }
}