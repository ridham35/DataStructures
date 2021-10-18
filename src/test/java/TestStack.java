import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestStack {

	Stack s = new Stack();

	@Test
	public void add() {
		assertTrue(s.empty());
		assertThrows(RuntimeException.class,() -> s.peek());
		assertThrows(RuntimeException.class,() -> s.pop());
		assertEquals(3, s.push(3));
		assertEquals(0,s.search(3));
		assertEquals(1, s.push(1));
		assertEquals(1, s.peek());
		assertEquals(1,s.search(1));
		assertEquals(4, s.push(4));
		assertEquals(0, s.push(0));
		assertEquals(0, s.pop());
		assertEquals(1, s.push(1));
		assertEquals(3,s.search(1));
		assertFalse(s.empty());
		assertEquals(5, s.push(5));
		assertEquals(5, s.peek());
		assertThrows(RuntimeException.class,() -> s.push(6));
		assertEquals(5, s.pop());
		assertEquals(3, s.search(1));
		assertEquals(1, s.pop());
		assertEquals(1, s.search(1));
		assertEquals(4, s.pop());
		assertEquals(1, s.pop());
		assertFalse(s.empty());
		assertEquals(3, s.pop());
		assertTrue(s.empty());
		assertThrows(RuntimeException.class,() -> s.peek());
		assertTrue(s.empty());
	}
}
