import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scr = new Scanner(System.in);

        int inputA = scr.nextInt();
        int inputB = scr.nextInt();
        String result = "";

        result  = (inputA < inputB)  ? "1 " : "0 ";
        result += (inputA == inputB) ? "1" : "0";

        System.out.print(result);

    }
}