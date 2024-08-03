class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        HashMap<Integer,Integer> m1 = new HashMap<>();
        HashMap<Integer,Integer> m2 = new HashMap<>();
        for(int i=0;i<target.length;i++)
        {
            m1.put(target[i],m1.getOrDefault(target[i],0)+1);
        }
        for(int i=0;i<arr.length;i++)
        {
            m2.put(arr[i],m2.getOrDefault(arr[i],0)+1);
        }
        for(Integer key : m1.keySet())
        {
            if(!m2.containsKey(key))
            {
                return false;
            }else{
                if(m2.get(key)!=m1.get(key))
                {
                    return false;
                }
            }
        }
        return true;
    }
}