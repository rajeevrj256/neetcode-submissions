class KthLargest {
public:
    int kth=0;
    priority_queue<int>q;
    KthLargest(int k, vector<int>& nums) {
        kth=k;
        for(int num:nums){
            q.push(num);
        }
    }
    
    int add(int val) {
        q.push(val);
        stack<int>st;
        for(int i=0;i<kth-1;i++){
           st.push(q.top());
           q.pop();
        }

        int ans=q.top();
        
        while(!st.empty()){
            q.push(st.top());
            st.pop();
        }

        return ans;
    }
};
