class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
           return false;

        HashMap<Character,Integer> map = new HashMap<>();
        char[] sr = s.toCharArray();
        for(int i = 0;i < sr.length;i++){
            if(map.containsKey(sr[i])){
                map.put(sr[i],map.getOrDefault(sr[i],0) +1);
                continue;
            }
            map.put(sr[i],1);
        }

        char[] tr = t.toCharArray();
        for(int i =0;i < tr.length;i++){
            if(!map.containsKey(tr[i])){
                return false;
            }
            map.put(tr[i],map.get(tr[i]) - 1);

            if(map.get(tr[i]) == 0){
                map.remove(tr[i]);
            }
        }

        return map.isEmpty();
    }
}
