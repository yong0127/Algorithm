import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        
        System.out.print(isPalindrome(input));
    }

    public static String isPalindrome(String input) {
        int searchIdx    = input.length();  // 3
        StringBuffer str = new StringBuffer();

        for(int i=searchIdx-1; i>=0; i--) { // 2 1 0
            str.append(input.charAt(i));
        }
        
        if(str.toString().equals(input)) {
            return "Yes";
        }
        else return "No";
    }
}