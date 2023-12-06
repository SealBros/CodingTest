using System;
using System.Collections.Generic;
using System.Linq;

public class Solution {
    public int solution(int k, int m, int[] score){
        
        int result = 0;
        Array.Sort(score);
        Array.Reverse(score);

        for (int i = 0; i < score.Length / m; i++)
        {
            int[] box = score.Skip(m * i).Take(m).ToArray();
            result += box[m - 1] * m;
        }
        return result;
    }
}