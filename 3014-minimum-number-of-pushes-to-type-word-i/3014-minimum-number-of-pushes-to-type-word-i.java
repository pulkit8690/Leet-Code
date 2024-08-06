class Solution {
    public int minimumPushes(String word) {
        HashMap<Integer,Integer> map= new HashMap<>();
        int res=0;
        int assign_key=2;
        for(char ch : word.toCharArray())
        {
            if(assign_key>9)
            {
                assign_key=2;
            }
            map.put(assign_key,map.getOrDefault(assign_key,0)+1);
            res+=map.get(assign_key);
            assign_key++;
        }
        return res;
    }
}