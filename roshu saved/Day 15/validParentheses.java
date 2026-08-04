import java.util.Stack;

public class validParentheses{

    static boolean isBalanced(String s){
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                st.push(s.charAt(i));
            } else {
                if (st.empty()){ 
                    return false;
                }
                if ((st.peek() == '(' && s.charAt(i) == ')') ||
                    (st.peek() == '{' && s.charAt(i) == '}') ||
                    (st.peek() == '[' && s.charAt(i) == ']')){
                    st.pop();
                } else{
                    return false;
                }
            }
        }
        return st.empty();
    }

    public static void main(String[] args) {
        String s = "{([])}";
        String s2 = "{([])";
        String s3 = ")"; 
        System.out.println(isBalanced(s));
        System.out.println(isBalanced(s2));
        System.out.println(isBalanced(s3));
    }
}