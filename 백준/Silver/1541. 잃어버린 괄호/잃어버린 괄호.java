import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer minus = new StringTokenizer(br.readLine(), "-");

        int sum = Integer.MAX_VALUE;

        while (minus.hasMoreTokens()) {
            int temp = 0;
            StringTokenizer plus =  new StringTokenizer(minus.nextToken(),"+");

            while(plus.hasMoreTokens()) {
                temp += Integer.parseInt(plus.nextToken());
            }
            if(sum == Integer.MAX_VALUE){
                sum = temp;
            } else {
                sum -= temp;
            }
        }
        System.out.println(sum);
    }
}
