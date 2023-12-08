using System;
using System.Collections.Generic;

public class Solution {
    public int solution(int number, int limit, int power)
    {
        int sum = 0;

        for (int i = 1; i <= number; i++)
        {
            int count = 0;

            for (int j = 1; j <= Math.Sqrt(i); j++)
            {
                if (i % j == 0)
                {
                    count += 2;

                    if (j == i / j)
                    {
                        count--;
                    }
                }
            }

            if (count > limit)
            {
                sum += power;
            }
            else
            {
                sum += count;
            }
        }
        return sum;
    }
}