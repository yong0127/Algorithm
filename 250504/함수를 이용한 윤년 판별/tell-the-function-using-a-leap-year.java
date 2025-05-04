import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        
        if(isValid(y)) {
            System.out.print("true");
        } 
        else System.out.print("false");

    }

    public static boolean isValid(int y) {
        int year     = Math.abs(y);
        String cond1 = (year % 4 == 0) ? "Y" : "N"; 
        String cond2 = (year % 100 == 0 && year % 400 != 0) ? "N" : "Y";

        switch (cond1) {
            case "Y" : 
                if(cond2.equals("Y")) return true;
                else return false;
            
            case "N" : 
                return false;
            
            default : 
                break;
        }

        return false;
    }
}