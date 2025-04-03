import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scr = new Scanner(System.in);

        int inputA = scr.nextInt();
        int inputB = scr.nextInt();
        int inputC = scr.nextInt();
        int sumData = inputA + inputB + inputC;
        int avgData = sumData / 3;

        System.out.println(sumData);
        System.out.println(avgData);
        System.out.print(sumData - avgData);
    }
}