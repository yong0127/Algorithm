import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        System.out.print(findGcd(n,m));
    }

    public static int findGcd(int n, int m) {
        
        int a = Math.abs(n);
        int b = Math.abs(m);

        if(a == 0 && b== 0) return 0;
        if(a == 0) return b;
        if(b == 0) return a;

        int minNum = Math.min(a,b);
        int gcd = 1;

        for(int i=minNum; i>1; i--) {
            if(a%i==0 && b%i==0) {
                gcd = i;    
                break;
            }
        }
        
        return gcd;
    }
}