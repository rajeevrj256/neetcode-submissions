class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for (String token : tokens) {

            if (token.equals("+")) {
                int first = st.pop();
                int second = st.pop();
                st.push(second + first);

            } else if (token.equals("-")) {
                int first = st.pop();
                int second = st.pop();
                st.push(second - first);

            } else if (token.equals("*")) {
                int first = st.pop();
                int second = st.pop();
                st.push(second * first);

            } else if (token.equals("/")) {
                int first = st.pop();
                int second = st.pop();
                st.push(second / first);

            } else {
                st.push(Integer.parseInt(token));
            }
        }

        return st.peek();
    }
}