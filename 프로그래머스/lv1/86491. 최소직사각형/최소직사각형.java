class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxCol = 0; //세로
        int maxRow = 0; //가로 
        for(int i = 0; i<sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
                int tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
            if(maxCol<sizes[i][1]) maxCol = sizes[i][1];
            if(maxRow<sizes[i][0]) maxRow = sizes[i][0];
        }
        answer = maxCol * maxRow;
        return answer;
    }
}