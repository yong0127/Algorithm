import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  a = sc.nextInt();
        char o = sc.next().charAt(0);
        int  c = sc.nextInt();
        
        System.out.print(fnCalc(a,o,c));
        
    }

    public static String fnCalc(int a, char o, int b) {
        
        switch(fnSelect(o)) {
            case "add" :
                return a + " + " + b + " = " + (a+b);

            case "minus" :
                return a + " - " + b + " = " + (a-b);
            
            case "multip" :
                return a + " * " + b + " = " + (a*b);

            case "divide" :
                return a + " / " + b + " = " + (int)a/b;
            
            default :
                return "False";
        }
    }

    public static String fnSelect(char o) {
        if(o == '+') {
            return "add";
        }
        else if(o == '-') {
            return "minus";
        }
        else if(o == '*') {
            return "multip";
        }
        else if(o == '/') {
            return "divide";
        }
        else return "-1";  
    }
}