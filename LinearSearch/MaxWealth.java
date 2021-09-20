public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts= {
            {3,5,4},
            {4,199,3},
            {123,456,789}
        };
        System.out.println(maximumWealth(accounts));
    }

    static int maximumWealth(int[][] accounts){
        int ans= Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum=0;
            for (int amount = 0; amount < accounts[person].length; amount++) {
                sum+=accounts[person][amount];
            }
            if (sum>ans) {
                ans=sum;
            }
        }
        return ans;
    }
}
