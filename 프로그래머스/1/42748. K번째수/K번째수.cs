using System;
using System.Collections.Generic;

public class Solution {
    public int[] solution(int[] array, int[,] commands) 
    {
        List<int> result = new List<int>();

        for(int i = 0; i < commands.GetLength(0); i++)
        {
            int start = commands[i, 0];
            int end = commands[i, 1];
            int index = commands[i, 2];
            
            List<int> subArray = new List<int>();
            for (int j = start - 1; j < end; j++)
            {
                subArray.Add(array[j]);
            }
            subArray.Sort();

            result.Add(subArray[index - 1]);
        }
        return result.ToArray();
    }
}
