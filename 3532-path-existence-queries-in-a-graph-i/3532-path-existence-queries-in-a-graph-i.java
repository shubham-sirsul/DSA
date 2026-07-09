class Solution {
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
        int comp[] = new int[n];
        int current =0;
        comp[0] = current;
        for(int i=1;i<n;i++){
            if(Math.abs(nums[i-1] - nums[i]) <=maxDiff) comp[i] = current;
            else comp[i] = ++current;
        }

        boolean ans[] = new boolean[queries.length];
        int i=0;
        for(int temp[] : queries){
            if(comp[temp[0]]==comp[temp[1]]){
                ans[i] = true;
            }

            i++;
        }
        return ans;
    }
}