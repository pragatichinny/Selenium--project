package collection;
import java.util.*;
public class ArrayDeque_demo {

	public static void main(String[] args) {
		ArrayDeque<String> q=new ArrayDeque<String>();
		q.add("Apple");
		q.add("Mango");
		q.add("Watermelon");
		q.add("Kiwi");
		q.add("CusturApple");
		q.add("Mango");
		System.out.println(q);
		System.out.println(q.getFirst());
		System.out.println(q.getLast());
		q.offer("Banana");
		System.out.println(q);
		q.offerFirst("Muskmelon");
		System.out.println(q);
		q.offerLast("Orange");
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q.peekFirst());
		System.out.println(q.peekLast());
		q.poll();
		System.out.println(q);
		q.pop();
		System.out.println(q);
	}

}
