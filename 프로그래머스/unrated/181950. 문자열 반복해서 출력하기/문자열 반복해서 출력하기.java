import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        //String result = "";
        StringBuffer strBuffer = new StringBuffer(str);
        
        boolean valCheck = (1<=str.length() && str.length()<=10 && 1<=n && n<=10);
        
        /* Solution1
        if(valCheck){
            for (int i=0; i<n; i++){
                if(i==0){
                    result = str;
                }else {
                    result = result.concat(str);
                }
            }      
        }
        System.out.print(result);
    }
    */
        
        // Solution2
        if (valCheck){
            for(int i=0; i<n-1; i++){
                strBuffer.append(str);
            }
        }   
        System.out.print(strBuffer);
    }
}