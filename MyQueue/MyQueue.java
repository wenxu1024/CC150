import java.util.*;

// implement myqueue class with two stacks

public class MyQueue<E> {

	private Stack<E> sl;
	private Stack<E> sr;
	
	public MyQueue() {
		sl = new Stack<E> ();
		sr = new Stack<E> ();
	}


	public boolean add(E e) {
		sl.add(e);
		return true;
	}

	public E peek() {
		return sr.peek();
	}

	public E poll() {
		if (sr.empty()) {
			while(!sl.empty()) {
				E e = sl.pop();
				sr.push(e);
			}
		}
		return sr.pop();
	}

	public E element() {
		return sr.peek();
	}

	public E remove() {
		return poll();
	}

	public boolean offer(E e) {
		return add(e);
	}
}
