class Solution {
    public int divisorSubstrings(int num, int k) {
       String s = String.valueOf(num);
        int count =0;
        for(int i=0;i<= s.length()-k;i++){
            int part = Integer.parseInt(s.substring(i , i+k));
            if(part != 0  && num % part == 0){
                count++;
            }
        }
        return count;  
    }
}