import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n      = sc.nextInt();
        int[] arr  = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        findMod(arr.clone());
    }
    
    public static void findMod(int[] arr) {
        // 짝수 찾기
        // 해당 짝수 2로 나누기
        // 홀수는 값 그대로
        // 공백을 기준으로 출력

        for(int i=0; i<arr.length; i++) {
            if(arr[i] % 2 == 0) {
                arr[i] = arr[i] / 2;
            }
            else arr[i] = arr[i];
        }
        
        for(int j=0; j<arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}