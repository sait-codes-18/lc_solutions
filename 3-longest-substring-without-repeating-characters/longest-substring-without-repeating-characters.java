class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n= s.length();
        int maxlen=0;
        for(int i=0;i<n;i++){
            boolean[] seen = new boolean[128];
            for(int j=i;j<n;j++){
                char ch = s.charAt(j);
                if(seen[ch]){
                    break;
                }
                seen[ch] = true;
                maxlen = Math.max(maxlen , j-i+1);
            }
        }
        return maxlen;
    }
}
