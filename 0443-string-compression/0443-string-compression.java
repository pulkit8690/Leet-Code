class Solution {
    public int compress(char[] chars) {
        int index = 0; 
        
        for (int i = 0; i < chars.length; i++) 
        {
            int count = 1;
            while (i < chars.length - 1 && chars[i] == chars[i + 1]) 
            {
                count++;
                i++;
            }
            chars[index++] = chars[i];
            if (count > 1) 
            {
                String countStr = Integer.toString(count);  
                for (char c : countStr.toCharArray()) 
                {
                    chars[index++] = c;  
                }
            }
        }
        
        return index;
    }
}
