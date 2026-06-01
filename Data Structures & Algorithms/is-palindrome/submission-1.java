class Solution {
    public boolean isPalindrome(String s) { 
        // int i = 0 ,j;
        // StringBuffer str=new StringBuffer();

        // for(i =0;i <= s.length() -1;i++){
        //     if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
        //         str.append((char)(s.charAt(i) + 32));
        //     }else if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i)>='0' && s.charAt(i) <='9')){
        //         str.append(s.charAt(i));
        //     }
        // }

        // i = 0 ;
        // j = str.length() -1;
        // while(i < j){

        //     if(str.charAt(i) != str.charAt(j)){
        //         return false;
        //     }
        //     i++;
        //     j--;
        // }
        // return true;


        int i =0,j = s.length() -1;

        while(i < j){
            char left = s.charAt(i);
            char right = s.charAt(j);

            if(!((left >= 'A' && left <= 'Z') ||
                (left >= 'a' && left <= 'z') ||
                (left >= '0' && left <= '9'))){
                i++;
                continue;
            }

            if(!((right >= 'A' && right <= 'Z') ||
                (right >= 'a' && right <= 'z') ||
                (right >= '0' && right <= '9'))){
                j--;
                continue;
            }

            if(left >= 'A' && left <= 'Z'){
                left =(char)(left + 32);
            }

            if(right >= 'A' && right <= 'Z'){
                right = (char)(right + 32);
            }

            if(left !=right){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
