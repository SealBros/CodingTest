using System.Collections.Generic;
using System.Linq;

public class Solution {
    public string[] solution(string[] strings, int n) {   
        
        var result = strings.OrderBy(x => x[n]).ThenBy(x => x).ToArray();

        return result;
    }
}