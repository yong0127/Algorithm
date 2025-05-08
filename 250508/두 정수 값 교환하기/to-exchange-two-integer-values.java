import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        System.out.print(swap(n, m));
    }

    public static String swap(int n_2, int m_2) {
        int temp = n_2;
        n_2 = m_2;
        m_2 = temp;

        String swapVal = n_2 + " " + m_2;
        
        return swapVal;
    }
}