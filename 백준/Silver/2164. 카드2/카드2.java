import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 1; i<=in; i++){
            queue.add(Integer.valueOf(i));
        }

        while(queue.size() > 1){
            queue.remove();
            queue.add(queue.remove());
        }
        System.out.println(queue.peek());
    }
}
