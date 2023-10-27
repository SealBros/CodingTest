using System;
using System.Collections.Generic;

public class Solution {
    public List<int> solution(string s) 
    {    
        Dictionary<char, int> dictionary = new Dictionary<char, int>();
        List<int> result = new List<int>();
        
        for (int i = 0; i< s.Length; i++)
        {
            if (!dictionary.ContainsKey(s[i]))
            {
                result.Add(-1);
            }
            else
            {
                result.Add(i - dictionary[s[i]]);
            }
            dictionary[s[i]] = i;
        }
        return result;
    }
}