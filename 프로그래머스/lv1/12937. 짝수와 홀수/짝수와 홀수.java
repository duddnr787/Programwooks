class Solution {
    public String solution(int num) {
        String answer = "";
        int a = num;
        if(num % 2 == 0){
            answer = "Even";
        } else {
            answer = "Odd";
        }
        return answer;
    }
}