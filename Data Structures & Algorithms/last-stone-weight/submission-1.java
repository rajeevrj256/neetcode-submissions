class Solution {
    PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
    public int lastStoneWeight(int[] stones) {
       
       for(int i=0;i<stones.length;i++){
        pq.offer(stones[i]);
       }


       while(pq.size()>1){
         int top=pq.peek();
         pq.poll();

         if(top>pq.peek()){
            int x=pq.peek();
            pq.poll();

            pq.offer(top-x);
         }else if(top==pq.peek()){
            pq.poll();
         }
       }

        return pq.isEmpty()?0:pq.peek();
    }
}
