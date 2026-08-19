class Solution {
    public String mergeAlternately(String word1, String word2) {
          String ans = "";
        int i = 0;

        while (i < word1.length() || i < word2.length()) {

            if (i < word1.length()) {
                ans = ans + word1.charAt(i);
            }

            if (i < word2.length()) {
                ans = ans + word2.charAt(i);
            }

            i++;
        }

        return ans;
    }
}