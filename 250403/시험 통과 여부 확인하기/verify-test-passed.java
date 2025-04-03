import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scr = new Scanner(System.in);

        int score        = scr.nextInt();
        int needMore      = 0;
        String resultMsg = "";

        if(score >= 80) {
            resultMsg = "pass";
        } else {
            needMore = 80 - score;
            resultMsg = needMore + " more score";
        }
        System.out.print(resultMsg);
    }
}