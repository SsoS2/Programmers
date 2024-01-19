class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String num1 = "";
        String num2 = "";
        
        //num_list길이만큼 반복
        for(int i=0;i<num_list.length;i++){
            // 홀수 일때
            if(num_list[i]%2 != 0){
                // 문자열로
               num1 += Integer.toString(num_list[i]);
            }
            // 짝수 일때
            else{
                num2 += Integer.toString(num_list[i]);
            }
        }
        
        // 정수로 변환해서 더하기
        answer = Integer.parseInt(num1) + Integer.parseInt(num2);
        
        return answer;
    }
}