import java.util.Collections;
import java.util.PriorityQueue;

public class KthMaxElmt {
    public static void main(String[] args) {
        int a[]={2,5,3,7,5,6,8,321,5};
        int k=4;
        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
        for(int n:a){
            pq.add(n);
        }
        for(int i=1;i<k;i++){
            pq.poll();
        }
        System.out.println(pq.peek());
    }
}
