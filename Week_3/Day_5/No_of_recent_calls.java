package Week_3.Day_5;

import java.util.*;

public class No_of_recent_calls {

    Queue<Integer> q;

    public No_of_recent_calls() {
        q = new LinkedList<>();
    }

    public int ping(int t) {

        q.offer(t);

        while (!q.isEmpty() && q.peek() < t - 3000) {
            q.poll();
        }

        return q.size();
    }

    public static void main(String[] args) {

        No_of_recent_calls rc = new No_of_recent_calls();

        System.out.println(rc.ping(1));
        System.out.println(rc.ping(100));
        System.out.println(rc.ping(3001));
        System.out.println(rc.ping(3002));
    }
}
    
