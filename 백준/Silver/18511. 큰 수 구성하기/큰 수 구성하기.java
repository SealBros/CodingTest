import java.util.Scanner;
import static java.lang.Math.*;

public class Main {
    static int N;
    static int K;
    static int[] arr;
    static int maxValue;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        arr = new int[K];

        sc.nextLine();
        for(int i = 0; i < K; i++){
            arr[i] = sc.nextInt();
        }
        dfs(0,0);
        System.out.println(maxValue);
    }
    public static void dfs(int value,int depth){

        if( depth == 8 ) return;
        value *= 10;

        for(int i=0;i<K;i++){
            int tmp = value + arr[i];
            if(tmp > N) continue;
            maxValue = max(maxValue,tmp);
            dfs(tmp,depth+1);
        }
    }
}
