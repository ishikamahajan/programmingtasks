package Task3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ArrayCountTest {

	@Test
	void count() {

		ArrayCount arrayCount = new ArrayCount();
		String[] arr = { "aba", "xzxb" };
		int expected = 1;
		String target = "aba";
		assertEquals(expected, arrayCount.count(arr, target), "Not Equal");
	}
}