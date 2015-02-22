import java.util.*;

// minimum stack implementation

public class MinStack<E> extends Stack<E> {
	private Stack<E> min;
	private Stack<E> s;
	
	public MinStack() {
		min = new Stack<E> ();
		s = new Stack<E> ();
	}

	@Override
	public E push(E e) {
		s.add(e);
		if (min.empty()) min.add(e);
		else {
			Integer top = (Integer) min.peek();
			Integer inte = (Integer) e;
			if (inte.compareTo(top) <= 0) min.add(e);
		}
		return e;
	}

	@Override
	public E pop() {
		E res = s.pop();
		if (res == min.peek()) min.pop();
		return res;
	}

	public E min() {
		return min.peek();
	}
}
