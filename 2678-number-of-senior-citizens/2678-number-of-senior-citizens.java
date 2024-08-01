class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        for(int i=0;i<details.length;i++)
        {
            String s = details[i];
            String sub1=s.substring(11,13);
            if(Integer.parseInt(sub1)>60)
            {
                count++;
            }
        }
        return count;
    }
}