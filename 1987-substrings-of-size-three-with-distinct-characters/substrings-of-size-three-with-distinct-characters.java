class Solution {
    public int countGoodSubstrings(String s) {
        int count = 0;

        for (int i = 0; i <= s.length() - 3; i++) {
            char f= s.charAt(i);
            char sec= s.charAt(i + 1);
            char t= s.charAt(i + 2);

            if (f != sec&&sec!= t&& f !=t) {
                count++;
            }
        }

        return count;
    }
}