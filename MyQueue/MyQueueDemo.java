import java.util.*;

public class MyQueueDemo {
	public static void main(String[] args) {
		MyQueue<Integer> myqueue = new MyQueue<Integer> ();
		myqueue.add(1);
		myqueue.add(2);
		myqueue.add(3);
		myqueue.add(4);
		System.out.println(myqueue.poll());
		System.out.println(myqueue.poll());
	}
}
