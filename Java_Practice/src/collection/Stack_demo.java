package collection;
import java.util.*;
public class Stack_demo {

	public static void main(String[] args) {
		Stack<Integer> s=new Stack<Integer>();
		s.push(2);
		s.push(8);
		s.push(5);
		s.push(3);
		s.push(5);
		s.push(7);
		System.out.println(s);
		System.out.println(s.pop());//remove last element from the stack
		System.out.println(s.peek());
		System.out.println(s.empty());
		System.out.println(s.search(9));
		System.out.println(s.push(9));
		System.out.println(s);

	}

}
