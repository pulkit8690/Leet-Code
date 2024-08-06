class Solution {
    public int minimumPushes(String word) {
        Integer[] arr = new Integer[26];
        Arrays.fill(arr, 0);
        for(int i=0;i<word.length();i++)
        {
            char ch= word.charAt(i);
            arr[ch-'a']++;
        }
        
        Arrays.sort(arr, Collections.reverseOrder());
        int res=0;
        for(int i=0;i<26;i++)
        {
            int freq=arr[i];
            int press=(i/8)+1;
            res+=freq*press;
        }
        return res;
    }
}