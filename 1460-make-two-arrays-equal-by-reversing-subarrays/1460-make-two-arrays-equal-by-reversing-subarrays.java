class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        
        for (int num : target) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) - 1);
            if (countMap.get(num) == 0) {
                countMap.remove(num);
            }
        }
        
        return countMap.isEmpty();
    }
}