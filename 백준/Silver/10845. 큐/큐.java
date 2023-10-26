import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch(command) {
                case "push" :
                    int num = Integer.parseInt(st.nextToken());
                    queue.add(num);
                    break;
                case "pop" :
                    if(queue.isEmpty()){
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(queue.remove()).append("\n");
                    }
                    break;
                case "size" :
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty" :
                    sb.append(queue.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front" :
                    sb.append(queue.isEmpty() ? -1 : queue.peek()).append("\n");
                    break;
                case "back" :
                    sb.append(queue.isEmpty() ? -1 : ((LinkedList<Integer>) queue).peekLast()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}
