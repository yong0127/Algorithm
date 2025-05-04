import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.print(getRsltNum(a, b));
    }

    public static int getRsltNum(int a, int b) {
        
        if(a == 0 || b == 0) return 0;
        
        int rsltNum = a;
        for(int i=1; i<b; i++) {
            rsltNum *= a;
        }
        return rsltNum;
    }
}