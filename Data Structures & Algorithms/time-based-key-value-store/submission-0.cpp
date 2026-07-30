class TimeMap {
public:
    unordered_map<string,vector<int>>hash;
     unordered_map<string,string>hashValue;
    TimeMap() {
        
    }
    
    void set(string key, string value, int timestamp) {
      
        string timeStampKey = key + to_string(timestamp);
        hashValue[timeStampKey]=value;
        hash[key].push_back(timestamp);


    }

    int findTimeStampTarget(vector<int>&arr,int target){
        int ans=-1;

        int i=0;
        int j=arr.size()-1;
        
        while(i<=j){
            int mid=(i+j)/2;
            
            if(arr[mid]==target) return target;
          
            else if(arr[mid]>target){
                j=mid-1;
            }else{
                i=mid+1;
                ans = arr[mid];
            }
        }

        return ans;

    }
    
    string get(string key, int timestamp) {
        vector<int>arr=hash[key];
        int timestampPrev=findTimeStampTarget(arr,timestamp);
        if(timestampPrev==-1) return "";
       string timeStampKey = key + to_string(timestampPrev);

        return hashValue[timeStampKey];
    }
};
