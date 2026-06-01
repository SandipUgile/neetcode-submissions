class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int i = 0 , j = nums.length -1;
        // while(i != j){
        //     if(Math.abs(nums[i]) + Math.abs(nums[j]) == target){
        //         break;
        //     }else if( Math.abs(nums[i]) + Math.abs(nums[j]) > target){
        //         j--;
        //     }else{
        //         i++;
        //     }
        // }
        // return new int[] {i,j};

        HashMap<Integer,Integer> m = new HashMap<>();

        for(int i =0;i < nums.length;i++){
            int comp = target - nums[i];
            if(m.containsKey(comp)){
                return new int[]{m.get(comp),i};
            }
            m.put(nums[i],i);
        }
        return new int[]{};
   }
}
