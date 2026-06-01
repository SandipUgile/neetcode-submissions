class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] result = new int[n];

        result[0] = 1;
        int i;
        //Gives me prefix product array
        for(i = 1;i < n ; i++){
            result[i] = result[i -1] * nums[i -1];
        }

        int suffix = 1;
        for(i = n-1;i >= 0;i--){
            result[i] = result[i] * suffix;
            suffix = suffix * nums[i];
        }

        return result;

    }
}  
