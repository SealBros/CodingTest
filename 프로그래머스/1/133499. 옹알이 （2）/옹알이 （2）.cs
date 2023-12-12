using System;
using System.Linq;

public class Solution {
    public int solution(string[] babbling)
    {
        int count = 0;
        string[] a = new string[] { "aya", "ye", "woo", "ma" };

        foreach (string s in babbling)
        {
            string check_babbling = s;

            for (int i = 0; i < a.Length; i++)
            {
                if (check_babbling.Contains(a[i]))
                {
                    string temp = a[i] + a[i];
                    check_babbling = check_babbling.Replace(temp, "-");
                    check_babbling = check_babbling.Replace(a[i], "*");
                }
            }
            check_babbling = check_babbling.Replace("*","");
            if (string.IsNullOrWhiteSpace(check_babbling))
            {
                count++;
            }
        }
        return count;
    }
}