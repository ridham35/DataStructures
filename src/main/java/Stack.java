import java.util.Arrays;

//	implemented using array
public class Stack {

	// max size of array
	static final int MAX = 5;

	// top element
	int top = -1;
	int[] a = new int[MAX];

	int push(int i) {
		if (top >= MAX - 1)
			throw new RuntimeException("Stack is full!");
		else {
			a[++top] = i;
			return i;
		}
	}

	int pop() {
		if (top < 0)
			throw new RuntimeException("Stack is empty!");
		else {
			return a[top--];
		}
	}

	int peek() {
		if (top < 0)
			throw new RuntimeException("Stack is empty!");
		else {
			return a[top];
		}
	}

	boolean empty() {
		return top < 0;
	}

	int search(int i) {
		for(int x=top; x>=0; x--) {
			if(a[x] == i) {
				return x;
			}
		}
		return -1;
	}

	@Override
	public String toString() {
		return Arrays.toString(a);
	}
}
