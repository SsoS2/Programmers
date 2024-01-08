import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result = "";
       for(char str : a.toCharArray()){
           if(Character.isLowerCase(str)){
               result += Character.toUpperCase(str);
           }else{
               result += Character.toLowerCase(str);
           }
       }
        System.out.print(result);
        
        
    }
}