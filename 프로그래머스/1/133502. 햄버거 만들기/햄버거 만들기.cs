using System;
using System.Collections.Generic;

public class Solution {
    public int solution(int[] ingredient)
    {
        int result = 0;
        List<int> list = new List<int>();

        foreach (int num in ingredient)
        {
            list.Add(num);

            if (list.Count >= 4)
            {
                if (list[list.Count - 4] == 1 && list[list.Count - 3] == 2 &&
                   list[list.Count - 2] == 3 && list[list.Count - 1] == 1)
                {
                    result++;
                    list.RemoveRange(list.Count - 4, 4);
                }
            }
        }
        return result;
    }
}