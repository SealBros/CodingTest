using System;
using System.Collections.Generic;

public class Solution {
    public string solution(string s, string skip, int index)
    {
        string answer = "";
        List<int> skipASCList = new List<int>();

        foreach (char c in skip)
        {
            skipASCList.Add((int)c);
        }

        for (int i = 0; i < s.Length; i++)
        {
            int ASC_s = s[i];

            for (int j = 0; j < index; j++)
            {
                ASC_s++;
                
                if(ASC_s > 122)
                {
                    ASC_s = 97;  
                }
                
                if (skipASCList.Contains(ASC_s))
                {
                    j--;
                }
            }
            answer += (char)ASC_s;
        }
        return answer;
    }
}