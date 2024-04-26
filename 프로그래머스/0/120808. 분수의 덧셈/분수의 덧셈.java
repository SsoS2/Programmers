class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        int num1 = numer1 * denom2; //분자1
        int num2 = numer2 * denom1; //분자2
        int num = num1+num2; //분자의 덧셈
        int denom = denom1 * denom2; //통분
        
        int result = 0;
        
        for(int i=1; i <= num && i <= denom  ;i++){
            if( num%i == 0 && denom%i ==0 ){
                result = i;
            }
        }
        
        answer[0] = num/result;
        answer[1] = denom/result;
        
        return answer;
    }
}