class Solution {
    public String reverseWords(String s) {
        ArrayList <String> list= new ArrayList<>();
        s=s.trim();
        int start=0;
        for(int end=0;end<s.length();end++)
        {
            if(s.charAt(end)==' ')
            {
                if(start!=end)
                {
                    list.add(s.substring(start, end));
                }
                start=end+1;
            }
            
        }
        // Add the last word
        if (start < s.length()) {
            list.add(s.substring(start));
        }
        // Step 4: Reverse the list of words
        StringBuilder reversedString = new StringBuilder();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedString.append(list.get(i));
            if (i > 0) {
                reversedString.append(" ");
            }
        }
        
        return reversedString.toString();
    }
}