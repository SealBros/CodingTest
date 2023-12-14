using System;
using System.Collections.Generic;
using System.Linq;

public class Solution {
    public int[] solution(string[] keymap, string[] targets)
    {
        List<int> answers = new List<int>();

        Dictionary<char, int> KeyValue =  new Dictionary<char, int>();

        foreach (string key in keymap)
        {
            for(int i = 0; i < key.Length; i++)
            { 
                if (KeyValue.ContainsKey(key[i]))
                {
                    if (KeyValue[key[i]] > i + 1)
                    {
                        KeyValue[key[i]] = i + 1;
                    }
                }
                else
                {
                    KeyValue.Add(key[i], i + 1);
                }
            }
        }
        foreach (string key in targets)
        {
            int sum = 0;
            int temp = 0;
            
            for (int i = 0; i < key.Length; i++)
            {
                if (KeyValue.ContainsKey(key[i]))
                {
                    sum += KeyValue[key[i]];
                }
                else
                {
                    temp++;
                }
            }
            if(sum == 0 || temp > 0)
            {
                sum = -1;    
            }
            answers.Add(sum);
        }

        return answers.ToArray();
    }
}