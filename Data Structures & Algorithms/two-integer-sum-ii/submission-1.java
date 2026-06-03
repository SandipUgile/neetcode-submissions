class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // HashMap<Integer,Integer> hp = new HashMap<>();
        // int [] arr = new int[2];
        // for(int i =0;i < numbers.length;i++){
        //     int first = numbers[i];
        //     int second = target - first;
        //     if(hp.containsKey(second)){
        //         arr[0] = hp.get(second) + 1;
        //         arr[1] = i + 1;
        //         break;
        //     }
        //     hp.put(first , i);
        // } 
        // return arr;      


        int l =0, r=numbers.length -1;

        while(l < r){
            if(numbers[l] + numbers[r] > target){
                r--;
            }else if(numbers[l] + numbers[r] < target){
                l++;
            }else{
                return new int []{l + 1,r +1};
            }
        } 
        return new int[0];
    }
}
