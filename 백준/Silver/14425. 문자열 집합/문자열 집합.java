import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int count = 0;
        HashMap<String, Integer> hashMap = new HashMap<>();

        for(int i = 0 ; i < N; i++){
            hashMap.put(br.readLine(),0);
        }
        for(int i = 0; i < M; i++){
            if(hashMap.containsKey(br.readLine())) count++;
        }
        System.out.println(count);
    }
}