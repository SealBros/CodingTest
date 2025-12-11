using System;

public class Solution {
    public int[] solution(string[] wallpaper) {
        int lux = int.MaxValue;
        int luy = int.MaxValue;
        int rdx = int.MinValue;
        int rdy = int.MinValue;
        for(int i = 0; i < wallpaper.Length; i++){
            for(int j = 0; j < wallpaper[i].Length; j++){
                if(wallpaper[i][j] == '#'){
                    lux = Math.Min(lux, i);
                    luy = Math.Min(luy, j);
                    rdx = Math.Max(rdx, i + 1);
                    rdy = Math.Max(rdy, j + 1);
                }                
            }
        }
        return new int[]{lux, luy, rdx, rdy};
    }
}