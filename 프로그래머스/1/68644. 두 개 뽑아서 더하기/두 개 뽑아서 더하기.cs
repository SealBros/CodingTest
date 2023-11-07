using System;
using System.Collections.Generic;

public class Solution 
{
    public int[] solution(int[] numbers) 
    {
        List<int> result = new List<int>();

        for(int i=0; i<numbers.Length; i++)
        {
            for(int j=i+1; j<numbers.Length; j++)
            {
                int sum = numbers[i] + numbers[j];
                if(!result.Contains(sum)) 
                {
                    result.Add(sum);
                }
            }
        }
        result.Sort();
        return result.ToArray();
    }
}