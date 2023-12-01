using System;
using System.Collections.Generic;

public class Solution {
    public int[] solution(int k, int[] score) {
        
        List<int> result = new List<int>();
        List<int> scoreList = new List<int>();
        
        for(int i = 0; i < score.Length; i++){
            
            if( scoreList.Count >= k){
                scoreList.Add(score[i]);
                scoreList.Sort();
                scoreList.RemoveAt(0);

                result.Add(scoreList[0]);
            }
            
            else{
                scoreList.Add(score[i]);
                scoreList.Sort();

                result.Add(scoreList[0]);
            }
        }
        int [] answer = result.ToArray();
        return answer;
    }
}