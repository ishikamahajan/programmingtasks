package Task2;
public class Loops {
	public void printWords(int numberOfTimes) {
		String[] str = {"Ok"};
		for (String s : str) {
			System.out.print(s);
		}
	}


	public static void main(String[] args) {
		Loops loop = new Loops();
		loop.printWords(2);

	}
}
