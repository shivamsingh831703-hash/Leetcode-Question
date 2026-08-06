class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        
        Arrays.sort(deck);
        int gcd = 0;
        int count = 1;
        for(int i = 1; i < deck.length; i++){
            if(deck[i] == deck[i - 1]){
                count++;
            }else{
                gcd = findGCD(gcd,count);
                count = 1;
            }
        }
        gcd = findGCD(gcd, count);
        return gcd >= 2;
    }
    public int findGCD(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}