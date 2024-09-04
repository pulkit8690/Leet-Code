class Solution {
    public int findCircleNum(int[][] adj) {
        int V= adj.length;
        ArrayList<ArrayList<Integer>> adjls = new ArrayList<>();
        for(int i=0;i<V;i++)
        {
            adjls.add(new ArrayList<>());
        }
        for(int i=0;i<V;i++)
        {
            for(int j=0;j<V;j++)
            {
                if(adj[i][j]==1 && i!=j)
                {
                    adjls.get(i).add(j);
                    adjls.get(j).add(i);
                }
            }
        }
        int count=0;
        int visited[]= new int[V+1];
        for(int i=0;i<V;i++)
        {
            if(visited[i]!=1)
            {
                count++;
                Queue<Integer> q= new LinkedList<>();
                q.add(i);
                visited[i]=1;
                while(!q.isEmpty())
                {
                    int n= q.remove();
                    for(Integer j : adjls.get(n))
                    {
                        if(visited[j]!=1)
                        {
                            visited[j]=1;
                            q.add(j);
                        }
                    }
                }
            }
        }
        return count;
    }
}