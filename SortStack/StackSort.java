import java.util.*;

// sort stack

public class StackSort {
	public static void sort(Stack s) {
		Object e = s.pop();
		if (s.empty()) {
			s.push(e);
			return;
		}
		else {
			sort(s);
			Stack temp = new Stack ();
			Integer inte = (Integer) e;
			while (!s.empty()) {
				Object currenttop = s.peek();
				Integer intcurrenttop = (Integer) currenttop;
				if (inte.compareTo(intcurrenttop) >= 0) break;
				else {
					temp.push(s.pop());
				}
			}
			s.push(e);
			while (!temp.empty()) {
				s.push(temp.pop());
			}
		}
	}

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer> ();
		s.push(1);
		s.push(3);
		s.push(2);
		s.push(0);
		System.out.println(s);
	//	StackSort ss = new StackSort();
		StackSort.sort(s);
		System.out.println(s);
	}
}
			
