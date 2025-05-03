import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.print(findLcb(n,m));
    }

    public static int findLcb(int n, int m) {
            
        int a = Math.abs(n);
        int b = Math.abs(m);

        int maxVal = Math.max(a,b);
        int minVal = Math.min(a,b);
        int lcb = minVal;

        while(true) {
            
            if(lcb%maxVal == 0) {
                return lcb;
            }
            else lcb += minVal;
        }
    }
}