class Solution {
public:
    bool isValid(string s) {
        stack<char>st;

        for(char c:s){
            if(c=='{' || c=='[' || c=='('){
                st.push(c);
            }else if(!st.empty() && ( c=='}' || c==')' || c==']')){
                
                char top=st.top();
                if(c=='}' && top!='{') return false;
                if(c==')' && top!='(') return false;
                if(c==']' && top!='[') return false;
                else st.pop();
            }else{
                return false;
            }
        }

        return st.empty();

    }
};
