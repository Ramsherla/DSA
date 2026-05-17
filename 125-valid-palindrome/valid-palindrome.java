class Solution {
    public boolean isPalindrome(String s) {
        String str=s.toLowerCase();
        // boolean b=true;
        String regex = "[^a-zA-Z0-9]";
        str=str.replaceAll(regex,"");
        // str=str.replaceAll(" ","");
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)==str.charAt(str.length()-1-i)){
                continue;

            }else{
                // b=false;
                return false;
                // break
            }
        }
        // if(b){
            return true;
        // }else{
        //     return false;
        // }


        
    }
}