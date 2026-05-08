class Solution {
    public int solution(int n, String control) {
        
        char c = 'a';
        int sum = n;
        
        for(int i = 0; i < control.length(); i++) {
            c = control.charAt(i);
            
            if(c == 'w') {
                sum += 1;
            } else if (c == 's') {
                sum += -1;
            } else if (c == 'd') {
                sum += 10;
            } else {
                sum += -10;
            }
        }
        
        return sum;
    }
}