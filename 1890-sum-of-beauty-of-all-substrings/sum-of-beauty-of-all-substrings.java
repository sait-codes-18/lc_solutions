class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int beauty = 0;
        for (int i = 0; i < n; i++) {
            int [] freq= new int[26];
            for (int j = i; j < n; j++) {
                freq[s.charAt(j)-'a']++;
                beauty += beau(freq);
            }
        }
        return beauty;
    }

    public int beau(int[] freq) {
        int max=0;
        int min = Integer.MAX_VALUE;
        for(int count:freq){
            if(count>0){
                max = Math.max(max,count);
                min = Math.min(min,count);
            }
        }
        return max-min;
    }
}
