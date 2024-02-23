import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        Stack<Character> stack = new Stack<>();
        int result = 0;
        
        for(int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(') {
                stack.push(S.charAt(i));
            }
            if(S.charAt(i) == ')'){
                stack.pop();
                if(S.charAt(i-1)=='('){
                    result += stack.size();
                }
                else{
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}