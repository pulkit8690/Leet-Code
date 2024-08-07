class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        HashSet<Integer> set = new HashSet<>();
        int num=0;
        for(Integer key : map.keySet())
        {
            num= map.get(key);
            set.add(num);
        }
        return set.size()==map.size();
    }
}