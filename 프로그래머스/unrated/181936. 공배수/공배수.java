class Solution {
    public int solution(int number, int n, int m) {
        
        int answer = 0;
        
        boolean valCheck = ( 10 <= number && number <= 100 && 
							 2 <= n && n <= 10 && 2 <= m && m <= 10 );
		
		if ( valCheck ) {
			
			if ( number % n == 0 && number % m ==0 ) {
				answer = 1;
			} else {
				answer = 0;
			}
		}		
		return answer;
    }
}