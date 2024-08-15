class Solution {
    class Point implements Comparable<Point>{
        int x;
        int y;
        int dis;
        Point(int x, int y, int dis)
        {
            this.x=x;
            this.y=y;
            this.dis=dis;
        }
        @Override
        public int compareTo(Point p2)
        {
            return this.dis-p2.dis;
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Point> pq= new PriorityQueue<>();
        for(int i=0;i<points.length;i++)
        {
            int dist= calDis(points[i][0],points[i][1]);
            pq.add(new Point(points[i][0], points[i][1], dist));
        }
        int ans[][] = new int[k][2];
        for(int i=0;i<k;i++)
        {
            Point a=pq.peek();
            ans[i][0]=a.x;
            ans[i][1]=a.y;
            pq.remove();
        }
        return ans;
    }
    public int calDis(int x , int y)
    {
        return x * x + y * y;
    }
}