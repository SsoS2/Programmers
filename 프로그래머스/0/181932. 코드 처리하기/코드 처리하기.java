import java.util.Arrays;

class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        
        // 문자열을 문자로 변환
        char[] chars = code.toCharArray();
        
        // 문자의 길이 반복
        for(int i=0;i<chars.length;i++){
            // mode가 0일때
            if(mode == 0){
                // chars[i]가 1 아니면
                if(chars[i] != '1'){
                    // 짝수 일 때
                    if(i%2==0){
                        answer += chars[i];
                    }    
                }else{
                    mode = 1;
                }
                
            }
            // mode가 0이 아닐때(1이면)
            else{
                // chars[i]가 1 아니면
                if(chars[i] != '1'){
                    // 홀수 일 때
                    if(i%2 == 1){
                        answer += chars[i]; 
                    }
                }else{
                    mode = 0;
                }
            }
        }
       return "".equals(answer) ? "EMPTY" : answer;
    }
}