package collection;
import java.util.*;
public class Queue_demo {

	public static void main(String[] args) {
		Queue<String> q=new PriorityQueue<String>();
		q.add("Apple");
		q.add("Mango");
		q.add("Banana");
		q.add("Watermelon");
		q.add("Kiwi");
		q.add("CusturApple");
		System.out.println(q);
		q.poll();
		System.out.println(q);
		q.poll();
		System.out.println(q);
		System.out.println(q.element());
		q.offer("Banana");
		System.out.println(q);
		System.out.println(q.contains("Kiwi"));
		System.out.println(q.peek());
		System.out.println(q.poll());//used to remove the random element by passing object
		System.out.println(q.remove());
		System.out.println(q);
		

	}

}

