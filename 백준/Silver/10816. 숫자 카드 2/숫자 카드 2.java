import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 1; i <= N; i++){
            int num = Integer.parseInt(st.nextToken());

            if(hashMap.containsKey(num)){
                int value = hashMap.get(num);
                hashMap.put(num, value + 1);
            }else{
                hashMap.put(num,1);
            }
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        
        for(int i = 1; i <= M; i++){
            int num = Integer.parseInt(st.nextToken());

            if(hashMap.containsKey(num)){
                sb.append(hashMap.get(num)).append(" ");
            }else{
                sb.append(0).append(" ");
            }
        }
        System.out.println(sb);
    }
}
