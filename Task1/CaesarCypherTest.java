package Task1;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CaesarCypherTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void encode() {

		CaesarCypher cc = new CaesarCypher();
		char[] input1 = { 'a', 'b', 'c' };
		char[] expected1 = { 'c', 'd', 'e' };

		char[] input2 = { 'A', 'B', 'C' };
		char[] expected2 = { 'a', 'b', 'c' };

		char[] input3 = { 'A', 'b', 'c' };
		char[] expected3 = { 'z', 'd', 'e' };

		assertArrayEquals(expected1, cc.encode(input1, 2), "The encoding method does not work as expected.");
		assertArrayEquals(expected2, cc.encode(input2, 2), "The encoding method does not work as expected.");
		assertArrayEquals(expected3, cc.encode(input3, 2), "The encoding method does not work as expected.");
	}

	@Test
	void decode() {
		CaesarCypher cc = new CaesarCypher();

		char[] input1 = { 'a', 'b', 'c' };
		char[] expected1 = { 'c', 'd', 'e' };

		char[] input2 = { 'A', 'B', 'C' };
		char[] expected2 = { 'a', 'b', 'c' };

		char[] input3 = { 'A', 'b', 'c' };
		char[] expected3 = { 'z', 'd', 'e' };

		assertArrayEquals(expected1, cc.decode(input1, 2), "The decoding method does not work as expected.");
		assertArrayEquals(expected2, cc.encode(input2, 2), "The decoding method does not work as expected.");
		assertArrayEquals(expected3, cc.encode(input3, 2), "The decoding method does not work as expected.");

	}
}