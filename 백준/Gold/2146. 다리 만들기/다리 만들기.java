import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, min = Integer.MAX_VALUE;;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++)
                map[i][j] = Integer.parseInt(st.nextToken());
        }
        int type = 1;
        // 섬 별로 나누는 작업
        visited = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 0) // 바다 일 때 경우
                    continue;
                if (visited[i][j]) // 방문을 했을 경우
                    continue;
                typeCheck(i,j,type);
                type++;
            }
        }
        
        // 가장 가까운 거리의 섬 탐색
        visited = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 0) // 바다 일 때 경우
                    continue;
                if (visited[i][j]) // 방문을 했을 경우
                    continue;
                bfs(i,j,map[i][j]);
            }
        }
        System.out.println(min);
    }
    static void typeCheck(int row, int col, int type){
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(row, col));
        visited[row][col] = true;
        map[row][col] = type;

        while (!queue.isEmpty()){
            Node vertex = queue.poll();

            for(int i = 0; i < 4; i++){
                int dr = vertex.row + dx[i];
                int dc = vertex.col + dy[i];

                if(dr<0||dc<0||dr>=N||dc>=N)
                    continue;
                if(map[dr][dc] == 0)
                    continue;
                if(visited[dr][dc])
                    continue;

                visited[dr][dc] = true;
                map[dr][dc] = type;
                queue.offer(new Node(dr, dc));
            }
        }
    }
    static void bfs(int row, int col, int type){
        visited[row][col] = true;

        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(row, col, 0));

        boolean[][] isVisited = new boolean[N][N];
        isVisited[row][col] = true;

        while(!q.isEmpty()){
            Node vertex = q.poll();

            for(int i = 0; i<4; i++){
                int dr = vertex.row + dx[i];
                int dc = vertex.col + dy[i];

                if(dr<0||dc<0||dr>=N||dc>=N)
                    continue;
                if(map[dr][dc] == type) {
                    visited[dr][dc] = true;
                    continue;
                }
                if(isVisited[dr][dc])
                    continue;

                if(map[dr][dc] == 0) {
                    q.offer(new Node(dr, dc, vertex.len+1));
                    isVisited[dr][dc] = true;
                }
                // 현재 탐색 중인 셀의 인접한 셀 중에서 타입이 다른 셀을 발견하면,
                // 현재까지의 거리 : vertex.len 과 기존의 최단거리 min을 비교하여 최솟값 저장
                else if(map[dr][dc] != type){
                    min = Math.min(min, vertex.len);
                    return;
                }
            }
        }
    }
}

class Node{
    int row, col, len;

    Node(int row, int col){
        this.row = row;
        this.col = col;
    }
    Node(int row, int col, int len){
        this.row = row;
        this.col = col;
        this.len = len;
    }
}