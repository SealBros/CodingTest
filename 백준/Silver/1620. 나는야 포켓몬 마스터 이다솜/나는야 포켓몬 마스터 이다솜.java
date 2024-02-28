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
        
        StringBuilder sb = new StringBuilder();
        
        HashMap<Integer, String> num_pokemon = new HashMap<Integer, String>();
        HashMap<String, Integer> name_pokemon = new HashMap<String, Integer>();

        for(int i = 1; i <= N; i++) {
            String S = br.readLine();
            num_pokemon.put(i, S);
            name_pokemon.put(S, i);
        }
        
        for(int i = 0; i < M; i++) {
            String S = br.readLine();
            if(49 <= S.charAt(0) && S.charAt(0) <= 57) {
                sb.append(num_pokemon.get(Integer.parseInt(S))).append("\n");
            }else {
                sb.append(name_pokemon.get(S)).append("\n");
            }
        }
        System.out.println(sb);
    }
}