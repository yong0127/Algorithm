import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];
        for (int i = 0; i < n1; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < n2; i++)
            b[i] = sc.nextInt();
    
        String rsltMsg = "";
        if(isTrue(a, b)) {
            rsltMsg = "Yes";
        }
        else rsltMsg = "No";

        System.out.print(rsltMsg);
    }

    public static boolean isTrue(int[] a, int[] b) {

        int aLen = a.length;
        int bLen = b.length;

        for(int i=0; i<aLen; i++) {
            for(int j=0; j<bLen; j++) {
                if(a[i]==b[j]) {
                    i++;
                    j++;
                    if(i<aLen && j<bLen) {
                        if(isNextValTrue(a[i], b[j])) {
                            return true;
                        }
                        else break;
                    }
                    else return false;
                }
            }
        }
        return false;
    }

    public static boolean isNextValTrue(int nextValA, int nextValB) {
        return (nextValA == nextValB) ? true : false;
    }
}