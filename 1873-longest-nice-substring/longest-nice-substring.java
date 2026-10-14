class Solution {
    public String longestNiceSubstring(String s) {
        int l = s.length();
        String res = "";
        for (int i = 0; i < l; i++) {
            for (int j = i; j < l; j++) {
                String sub = s.substring(i, j + 1);
                if (nice(sub) && sub.length() > res.length())
                    res = sub;
            }
        }
        return res;
    }

    public boolean nice(String subs) {
        Set<Character> set = new HashSet<>();
        for (char ch : subs.toCharArray()) {
            set.add(ch);
        }
            for (char ch : subs.toCharArray()) {
                char opp = Character.isLowerCase(ch) ? Character.toUpperCase(ch) : Character.toLowerCase(ch);
                if (!set.contains(opp))
                    return false;
            }
        
        return true;
    }
}