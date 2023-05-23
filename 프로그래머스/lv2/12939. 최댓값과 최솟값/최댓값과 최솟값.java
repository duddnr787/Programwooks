import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] list = s.split(" ");
        int[] arr = new int[list.length];
        
        for(int i = 0; i<list.length; i++){
            arr[i] = Integer.parseInt(list[i]);
        }
        Arrays.sort(arr);
        
        int min = arr[0];
        int max = arr[list.length - 1];
        answer = min + " " + max;
        return answer;
    }
}