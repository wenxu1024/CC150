import java.util.*;

//mininum stack demo

public class MinStackDemo {
	public static void main(String[] args) {
		MinStack<Integer> ms = new MinStack<Integer> ();
		ms.push(1);
		ms.push(2);
		ms.push(0);
		ms.push(-1);
		ms.push(3);
		System.out.println(ms.min());
		ms.pop();
		System.out.println(ms.min());
		ms.pop();
		System.out.println(ms.min());
		ms.pop();
		System.out.println(ms.min());

	}
}
