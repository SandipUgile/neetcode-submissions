class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hp = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i< nums.length;i++){
            hp.put(nums[i] , hp.getOrDefault(nums[i],0)+1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>(
            (a,b) -> b.getValue() - a.getValue());
        
        for(Map.Entry<Integer,Integer> entry : hp.entrySet()) {
            pq.add(entry);
        }
        int res[] = new int[k];
        for(int i =0;i < k;i++){
            res[i] = pq.poll().getKey();
        }

        return res;
    }
}
