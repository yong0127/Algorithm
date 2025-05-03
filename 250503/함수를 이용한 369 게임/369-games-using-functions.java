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
        String strNum = String.valueOf(i);
        for(int j=0; j<strNum.length(); j++) {
            char digitChar = strNum.charAt(j);
            if(digitChar == '3' || digitChar == '6'|| digitChar == '9') {
                return true;
            }
        }
        return false;
    }

    public static boolean isMultVal(int i) {
        return i % 3 == 0;
    }
}