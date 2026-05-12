class Solution {
    static boolean[] checked;
    static int result = 0;
    
    public int solution(int k, int[][] dungeons) {
        checked = new boolean[dungeons.length];
        dfs(k, dungeons, 0);      
        return result;
    }
    
    private void dfs(int k, int[][] dungeons, int count) {
        result = Math.max(result, count);
        
        for(int i = 0; i < dungeons.length; i++) {
         if(checked[i]) continue;
            
            if(k >= dungeons[i][0]) {
                checked[i] = true;
                dfs(k - dungeons[i][1], dungeons, count + 1);
                checked[i] = false;
            }
        }
    }
}