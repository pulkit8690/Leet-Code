class Solution {
    public int findMinArrowShots(int[][] points) {
        int n= points.length;
        Arrays.sort(points, Comparator.comparingDouble(o->o[1]));
        int count=1;
        int last_end=points[0][1];
        for(int i=1;i<n;i++)
        {
            if(points[i][0]>last_end)
            {
                count++;
                last_end=points[i][1];
            }
        }
        return count;
    }
}