using System;
using System.Collections.Generic;
using System.Linq;

public class Solution {
    public int[] solution(int[] answers){
        
        int[] a = new int[] { 1, 2, 3, 4, 5 };
        int[] b = new int[] { 2, 1, 2, 3, 2, 4, 2, 5 };
        int[] c = new int[] { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

        int[] count = new int[] { 0, 0, 0 };
        

        for (int i = 0; i < answers.Length; i++){
            
            if (a[(i % a.Length)] == answers[i])
                count[0]++;        
            if (b[(i % b.Length)] == answers[i])
                count[1]++;
            if (c[(i % c.Length)] == answers[i])
                count[2]++;
        }

        int maxCount = count.Max();
        List<int> result = new List<int>();
        
        for (int i = 0; i < count.Length; i++){
            
            if (count[i]==maxCount)
                result.Add(i+1);
        }

        return result.ToArray();
    }
}