using System;

public class Solution {
    public string solution(string my_string) {
        string answer = "";
        
        string [] b = new string [] {"a","e","i","o","u"};

        foreach(string c in b)
        {
            my_string = my_string.Replace(c,"");
        }
        
        return my_string;
    }
}