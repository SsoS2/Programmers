import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        // 문자열을 문자로 바꾸기
        char[] chars = s.toCharArray();
        
        // 바꾼 문자를 정렬
        Arrays.sort(chars);
        
        for(int i = 0; i<chars.length;i++){
            int num = 0;
            for(int j=0; j<chars.length;j++){
                if(chars[i] == chars[j]){
                    num++;
                }
            }
            if(num == 1) answer += chars[i]; 
        }              
        System.out.print(chars);
        return answer;
    }
}