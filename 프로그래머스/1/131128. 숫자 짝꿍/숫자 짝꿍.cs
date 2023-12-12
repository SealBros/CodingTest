using System;
using System.Collections.Generic;
using System.Linq;

public class Solution {
    public string solution(string X, string Y)
    {
        var xy = X.Intersect(Y).ToList();

        if (!xy.Any())
        {
            return "-1";
        }

        else if (xy.Count == 1 && xy.Contains('0'))
        {
            return "0";
        }

        List<string> result = new List<string>();

        foreach (var n in xy)
        {
            int count = Math.Min(X.Count(x => x == n), Y.Count(y => y == n));
            result.Add(new String(n, count));
        }

        result.Sort();
        result.Reverse();
        return String.Join("", result);
    }
}