import java.util.Scanner;
public class Main {

    static int seqNum = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        printRect(n);
    }

    public static void printRect(int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(getSeq() + " ");
                setSeq();
            }
            System.out.println();
        }
    }

    public static int getSeq() {
        int[] seqArr = {1,2,3,4,5,6,7,8,9};
        return seqArr[seqNum];
    }

    public static void setSeq() {    
        seqNum = (seqNum == 8) ? 0 : seqNum + 1;
        
    }
}