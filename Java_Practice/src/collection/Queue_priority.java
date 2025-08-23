package collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_priority {

		public static void main(String[] args) {
			Queue<Integer> q=new PriorityQueue<Integer>();
			q.add(2);
			q.add(6);
			q.add(0);
			q.add(9);
			q.add(3);
			System.out.println(q);
			q.poll();
			System.out.println(q);
			q.poll();
			System.out.println(q);
			q.poll();
			System.out.println(q);
			q.poll();
			System.out.println(q);

	}

}
