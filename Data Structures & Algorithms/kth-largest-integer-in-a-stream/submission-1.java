class KthLargest {
    PriorityQueue<Integer> pq;
    int kthValue;
    public KthLargest(int k, int[] nums) {
        pq=  new PriorityQueue<>();
        kthValue=k;

        for(int num:nums){
            pq.offer(num);
            if(pq.size()>kthValue) pq.poll();
        }


    }
    
    public int add(int val) {
        pq.offer(val);
         if(pq.size()>kthValue) pq.poll();

         return pq.peek();
    }
}
