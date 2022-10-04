package Task3;

public class ArrayCount {
	public int count(String[] array, String target) {
		{
			int counter = 0;
			for (int j = 0; j < array.length; j++) {

				/*
				 * checking if string given in query is present in the given string. If present,
				 * increase times
				 */
				if (target.equals(array[j]))
					counter++;
			}

			return counter;
		}
	}

	public static void main(String[] args) {

		ArrayCount arrayCount = new ArrayCount();
		String[] arr = { "aba", "xzxb" };
		String q = "aba";
		System.out.println(arrayCount.count(arr, q));
	}

}
