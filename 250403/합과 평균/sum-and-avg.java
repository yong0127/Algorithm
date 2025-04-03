import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scr = new Scanner(System.in);
        
        int inData1 = scr.nextInt();
        int inData2 = scr.nextInt();
        int sumData = inData1 + inData2;
        Double dobData = sumData / 2.0;

        System.out.printf("%d %.1f", sumData, dobData);
    }
}