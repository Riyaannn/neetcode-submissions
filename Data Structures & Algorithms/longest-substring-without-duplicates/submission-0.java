class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0,right=0,count=0;
        HashSet<Character> set=new HashSet<>();
        int n=s.length();
        for(right=0;right<n;right++){
            
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
        set.add(s.charAt(right));
        count=Math.max(count,right-left+1);
        }
        return count;

    }
}
