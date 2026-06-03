class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b -a);

        for(int i = 0;i < stones.length ;i++){
            pq.add(stones[i]);
        }

        while (pq.size() > 1) {
            int second = pq.poll();
            int first = pq.poll();

            if(second != first){
                pq.add(second - first);
            }
        }

        return pq.isEmpty() ? 0 : pq.peek();
    }
}
