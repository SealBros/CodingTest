import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();

        for(int i = 0; i < n; i++) {
            String S = in.nextLine();
            Stack<Character> stack = new Stack<>();

            for(int j = 0; j < S.length(); j++) {
                if(S.charAt(j) == '(') {
                    stack.push(S.charAt(j));
                }else {
                    if(stack.empty()) {
                        stack.push(S.charAt(j));
                        break;
                    }else {
                        stack.pop();
                    }
                }
            }

            if(stack.empty()) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
