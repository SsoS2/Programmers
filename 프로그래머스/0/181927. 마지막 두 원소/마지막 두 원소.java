class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        
        int num = num_list.length;
        
        //num_list 길이만큼 반복
        for(int i=0;i<num;i++){
            // 마지막 원소가 그전 원소보다 클때    
            if(num_list[num-1] > num_list[num-2]){
                answer[num] = num_list[num-1] - num_list[num-2];
            }
            // 마지막 원소가 그전 원소보다 작을때
            else{
                answer[num] = num_list[num-1]*2;
            }
            answer[i] = num_list[i];
        }
        
        
        return answer;
    }
}