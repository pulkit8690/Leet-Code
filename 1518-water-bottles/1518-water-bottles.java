class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans= numBottles;
        while((numBottles/numExchange)>0)
        {
            ans= ans+(numBottles/numExchange);
            int mod= numBottles%numExchange;
            numBottles=(numBottles/numExchange)+mod;
        }
        return ans;
    }
}