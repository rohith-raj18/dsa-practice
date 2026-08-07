public class ValidParenthese {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            // push only opening parenthesis 
            if(ch == '(' || ch == '[' || ch == '{'){
                st.push(ch);
            }else {
            // if it doesn't matching any of the one return false;
            if (st.isEmpty()) {
                return false;
            }
            // take top element
            char top = st.pop();
            // If the current closing parenthesis doesn't match the top,
                // the parentheses are not balanced.
            if ((ch == ')' && top != '(') || 
                (ch == ']' && top != '[') || 
                (ch == '}' && top != '{')) {
                return false;
            }
        }
            
        }
        // if stack is empty that means it was valid parenthis
        return st.isEmpty();
    }
}
