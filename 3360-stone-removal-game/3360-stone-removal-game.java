class Solution {
    public boolean canAliceWin(int n) {
       int remove = 10;
       int move = 0;
       while(n >= remove){
        n -= remove;
        remove--;
        move++;
       } 
       return move % 2 == 1;
    }
}