class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int len = p.length();
        Long b = Long.parseLong(p);
        
        for(int i = 0; i<t.length() - len + 1; i++){
            Long a = Long.parseLong(t.substring(i, i+len));
            if(a <= b){
                answer++;
            } else {
                continue;
            }
        }
        return answer;
    }
}