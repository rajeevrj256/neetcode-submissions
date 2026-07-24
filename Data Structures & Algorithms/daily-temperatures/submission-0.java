class Solution {
    public int[] dailyTemperatures(int[] temperatures) {


        int n=temperatures.length;
        int[] ans= new int[n];

        Stack<Integer>st=new Stack<>();
        int j=n-1;

        while(j>=0){
            while(!st.empty() && temperatures[j]>=temperatures[st.peek()]){
                int top=st.pop();
                 if(st.empty()) ans[top]=0;
                 else ans[top]=st.peek()-top;
                
            }

            st.add(j);
            j--;
        }

        while(!st.empty()){
            int top=st.pop();
                 if(st.empty()) ans[top]=0;
                 else ans[top]=st.peek()-top;
        }

        return ans;
    }
}
