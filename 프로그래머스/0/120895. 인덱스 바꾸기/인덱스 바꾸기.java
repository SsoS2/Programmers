import java.util.*;

class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        
        char[] array = my_string.toCharArray();
        
        char tmp = array[num1];
        array[num1] = array[num2];
        array[num2] = tmp;
        
        answer = String.valueOf(array);
        return answer;
    }
}