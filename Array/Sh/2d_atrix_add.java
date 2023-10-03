class Solution {
    public int[][] count(int[][] arr1,int[][] arr2) {
        //Dont print anything only return the Output.
 
        int r = arr1.length;
int c = arr1[0].length;
        
        int[][] answer = new int[r][c];
        for(int i =0;i<r;i++){
            for(int j =0;j<c;j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
 return answer;
    }
}
