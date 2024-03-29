import java.util.Scanner;

public class Main {
    static int[][] arr;
    static boolean[] check;
    static int node, line;
    static int count = 0;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        node = sc.nextInt();
        line = sc.nextInt();

        arr = new int[node+1][node+1];
        check = new boolean[node+1];

        for(int i = 0; i < line; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a][b] = arr[b][a] = 1;
        }
        dfs(1);
        System.out.println(count - 1);
    }
    public static void dfs(int start) {
        check[start] = true;
        count++;
        for(int i = 0 ; i <= node ; i++) {
            if(arr[start][i] == 1 && !check[i])
                dfs(i);
        }
    }
}