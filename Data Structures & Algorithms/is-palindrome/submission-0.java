class Solution {
    public boolean isPalindrome(String s) { 
        int i = 0 ,j;
        StringBuffer str=new StringBuffer();

        for(i =0;i <= s.length() -1;i++){
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                str.append((char)(s.charAt(i) + 32));
            }else if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i)>='0' && s.charAt(i) <='9')){
                str.append(s.charAt(i));
            }
        }

        i = 0 ;
        j = str.length() -1;
        while(i < j){

            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
