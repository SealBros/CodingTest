using System;
using System.Collections.Generic;
using System.Linq;

public class Solution {
    public string solution(string[] cards1, string[] cards2, string[] goal) {
        
        string answer = "";
        int count = 0;
        List<string> cards1List = new List<string>(cards1);
        List<string> cards2List = new List<string>(cards2);
        
        foreach(string element in goal){
            
            if(cards1List.Count > 0 && element == cards1List[0]){
                cards1List.RemoveAt(0);
                count++;
            }
            else if(cards2List.Count > 0 && element == cards2List[0]){
                cards2List.RemoveAt(0);
                count++;
            }
            else{
                answer = "No";
                break;
            }
        }
        
        if(goal.Length == count){
            answer = "Yes";
        }
        
        return answer;
    }
}
