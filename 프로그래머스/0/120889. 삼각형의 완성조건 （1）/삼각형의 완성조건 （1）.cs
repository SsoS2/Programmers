using System.Linq;
using System;

public class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        var list = sides.ToList();
        list.Sort();

        answer = list[2] < list[0] + list[1] ? 1 : 2;
        return answer;
    }
}