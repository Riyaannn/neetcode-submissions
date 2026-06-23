class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] s1=s.toCharArray();
        char[] t1=t.toCharArray();
        int j = 0;
        for(int i=0;i<s1.length;i++){
            while(j < t1.length && s1[i] != t1[j]){
                j++;
            }
            if(j == t1.length) return false;
            j++;
        }
        return true;
    }
}