import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        boolean valCheck = (1<=a.length() && a.length()<=10 &&
                            1<=b.length() && b.length()<=10);
        
        if (valCheck){
            System.out.print(a.replace(" ",""));
            System.out.print(b.replace(" ",""));
        }
    }
}