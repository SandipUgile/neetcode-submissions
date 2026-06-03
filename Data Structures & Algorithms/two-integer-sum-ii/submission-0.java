class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> hp = new HashMap<>();
        int [] arr = new int[2];
        for(int i =0;i < numbers.length;i++){
            int first = numbers[i];
            int second = target - first;
            if(hp.containsKey(second)){
                arr[0] = hp.get(second) + 1;
                arr[1] = i + 1;
                break;
            }
            hp.put(first , i);
        } 
        return arr;       
    }
}
