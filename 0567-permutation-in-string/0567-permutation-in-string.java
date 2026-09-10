class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int[] arr1 = new int[128];
        int[] arr2 = new int[128];

        int l = 0;
        int r = 0;

        int k = s1.length();

        if (s1.length() > s2.length()) {
            return false;
        }
        while (r < k) {
            arr1[s1.charAt(r)]++;
            arr2[s2.charAt(r)]++;
            r++;
        }

        if (Arrays.equals(arr1, arr2)) {
            return true;
        }
        while (r < s2.length()) {

            arr2[s2.charAt(r)]++;
            arr2[s2.charAt(l)]--;  
            l++;
            r++;
            if (Arrays.equals(arr1, arr2)) {
                return true;
            }
        }

        return false;
    }
}