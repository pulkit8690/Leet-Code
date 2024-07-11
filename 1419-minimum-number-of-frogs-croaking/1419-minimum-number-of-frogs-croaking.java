class Solution {
    public int minNumberOfFrogs(String croakOfFrogs) {
        int c=0,r=0,o=0,a=0,k=0;
        int activefrog=0;
        int ans=0;
        for(char ch : croakOfFrogs.toCharArray())
        {
            switch(ch)
            {
                case 'c':
                    activefrog++;
                    c++;
                    break;
                case 'r':
                    r++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'a':
                    a++;
                    break;
                case 'k':
                    k++;
                    activefrog--;
                    break;
            }
            ans= Math.max(ans,activefrog);
            if(c<r||r<o||o<a||a<k)
            {
                return -1;
            }
        }
        return activefrog==0? ans:-1;
    }
}