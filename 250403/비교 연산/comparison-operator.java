import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scr = new Scanner(System.in);
        
        int inputA = scr.nextInt();
        int inputB = scr.nextInt();

        int[] arrResult = new int[6];

        arrResult[0] = (inputA >= inputB) ? 1 : 0;
        arrResult[1] = (inputA >  inputB) ? 1 : 0;
        arrResult[2] = (inputA <= inputB) ? 1 : 0;
        arrResult[3] = (inputA <  inputB) ? 1 : 0;
        arrResult[4] = (inputA == inputB) ? 1 : 0;
        arrResult[5] = (inputA != inputB) ? 1 : 0;

        for(int i=0; i<arrResult.length; i++) {
            System.out.println(arrResult[i]);
        }
    }
}