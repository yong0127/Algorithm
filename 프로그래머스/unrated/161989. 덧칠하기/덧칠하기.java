class Solution {
    public int solution(int n, int m, int[] section) {
        
        int start = section[0]; 
        int end   = section[0] + ( m-1 ) ;
        int cnt   = 1;  // 칠한 횟수
        
        for ( int i : section ) {
            
            if ( start <= i && i <= end ) {
                continue;
            } else {
                start = i;
                end   = i + ( m-1 );
                cnt ++;
            }   
        }
        return cnt;   
    }
}

