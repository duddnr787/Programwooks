import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Queue<Integer> people = new LinkedList<>();
        Stack<Integer> wait = new Stack<>();

        int start = 1;
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            int num = Integer.parseInt(st.nextToken());
            people.add(num);
        }
        while(!people.isEmpty()){
            if(people.peek() == start){
                people.remove();
                start++;
            } else if(!wait.isEmpty() && wait.peek() == start) {
                wait.pop();
                start++;
            } else {
                wait.push(people.remove());
            }
        }
        while(!wait.isEmpty()){
            if(wait.peek() == start){
                wait.pop();
                start++;
            } else {
                System.out.println("Sad");
                return;
            }
        }
        System.out.println("Nice");
    }
}
