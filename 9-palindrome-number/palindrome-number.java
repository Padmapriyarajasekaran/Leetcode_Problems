class Solution {
    public boolean isPalindrome(int x) {
        int ori = x;
        int sum=0;
        if(x==0){
            return true;
        }
        while(x>0){
            int a = x%10;
            sum = sum * 10 + a;
            x = x/10;
        }
        if(ori == sum ){
            return true;
        }else{
            return false;
        }
    }
}