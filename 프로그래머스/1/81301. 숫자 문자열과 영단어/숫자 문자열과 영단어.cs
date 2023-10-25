using System;
using System.Collections.Generic;

public class Solution {
    public int solution(string s) {
        
      string[,] conversion = new string[,] { 
            {"0", "zero"}, 
            { "1", "one" }, 
            { "2", "two" }, 
            { "3", "three" }, 
            { "4", "four" }, 
            { "5", "five" }, 
            { "6", "six" },
            { "7", "seven" }, 
            { "8", "eight" },
            { "9", "nine" }
        };
        for (int i = 0; i < conversion.GetLength(0); i++){
            s = s.Replace(conversion[i, 1], conversion[i, 0]);
        }
        return int.Parse(s);
    }
}