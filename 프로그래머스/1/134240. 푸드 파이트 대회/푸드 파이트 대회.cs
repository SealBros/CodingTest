using System;

public class Solution {
    public string solution(int[] food) {
        
        string answer = "";
        
        for(int i = 1; i < food.Length; i++){
            string temp = new String(i.ToString()[0], food[i]/2);
            answer += temp;
        }
        
        char[] array = answer.ToCharArray();
        Array.Reverse(array);
        answer = answer + "0" + new String(array);
        
        return answer;
    }
}