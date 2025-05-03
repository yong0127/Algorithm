import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.print(getSumTot(n));
    }

    public static int getSumTot(int n) {

        int totVal = 0;
        int rstVal = 0;

        for(int i=0; i<n; i++) {
            totVal += i + 1;
        }
        rstVal = totVal / 10;

        return rstVal;        
    } 
}