class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String sum1 = String.valueOf(a) + String.valueOf(b);
        String sum2 = String.valueOf(b) + String.valueOf(a);
        
        int num1 = Integer.parseInt(sum1);
        int num2 = Integer.parseInt(sum2);
        
        if(num1 > num2) {
            answer = num1;
        } else if(num1 < num2) {
            answer = num2;
        } else {
            answer = num1;
        }
        
        return answer;
    }
}

