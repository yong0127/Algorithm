import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scr = new Scanner(System.in);
        
        int inputA = scr.nextInt();
        int inputB = scr.nextInt();
        int result = 0;

        result = (inputA > inputB) ? inputA * inputB : inputA % inputB;
        System.out.print(result);
    }
}