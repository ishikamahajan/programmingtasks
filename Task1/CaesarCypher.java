package Task1;

import java.util.Scanner;

public class CaesarCypher {

// ALPHABET string denotes alphabet from a-z
public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

	// create encryptData() method for encrypting user input string with given shift key
	public static char[] encode(char[] input, int offset)
	{
		// convert inputStr into lower case
//		inputStr = inputStr.toLowerCase();

		// encryptStr to store encrypted data
		String encryptStr = "";
		char[] result = null;

		// use for loop for traversing each character of the input string
		for (int i = 0; i < input.length; i++)
		{
			// get position of each character of inputStr in ALPHABET
			int pos = ALPHABET.indexOf(input[i]);

			// get encrypted char for each char of inputStr
			int encryptPos = (offset + pos) % 26;
			char encryptChar = ALPHABET.charAt(encryptPos);

			// add encrypted char to encrypted string
			encryptStr += encryptChar;
			result = encryptStr.toCharArray();
		}

		// return encrypted string
		return result;
	}

	// create decryptData() method for decrypting user input string with given shift key
	public static char[] decode(char[] input, int offset)
	{
		// convert inputStr into lower case
//		inputStr = inputStr.toLowerCase();

		// decryptStr to store decrypted data
		String decryptStr = "";
		char[] result = null;

		// use for loop for traversing each character of the input string
		for (int i = 0; i < input.length; i++)
		{

			// get position of each character of inputStr in ALPHABET
			int pos = ALPHABET.indexOf(input[i]);

			// get decrypted char for each char of inputStr
			int decryptPos = (pos - offset) % 26;

			// if decryptPos is negative
			if (decryptPos < 0){
				decryptPos = ALPHABET.length() + decryptPos;
			}
			char decryptChar = ALPHABET.charAt(decryptPos);

			// add decrypted char to decrypted string
			decryptStr += decryptChar;
			result = decryptStr.toCharArray();
		}
		// return decrypted string
		return result;
	}

	// main() method start
	public static void main(String[] args)
	{
		// create an instance of Scanner class
		Scanner sc = new Scanner(System.in);

		// take input from the user
		System.out.println("Enter a string for encryption using Caesar Cipher: ");
		String inputStr = sc.nextLine();

		System.out.println("Enter offset value");
		int shiftKey = Integer.valueOf(sc.nextLine());

		char[] charArr = inputStr.toCharArray();
		System.out.println("Encryption");
		char[] encryption = encode(charArr, shiftKey);
		for (int i = 0; i < encryption.length; i++) {
			System.out.print(encryption[i]);

		}
		System.out.println();

		char[] decryption = decode(encode(charArr, shiftKey), shiftKey);
		System.out.println("Decryption");
		for (int i = 0; i < decryption.length; i++) {
			System.out.print(decryption[i]);
		}

		// close Scanner class object
		sc.close();
	}
}
