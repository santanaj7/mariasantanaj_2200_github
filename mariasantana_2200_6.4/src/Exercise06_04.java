/******************************
*author santana 
*date 11/14/22
*
*/
import java.util.Scanner;

public class Exercise06_04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		System.out.println("Enter an integer:");
		int number = input.nextInt();
		reverse(number);
		input.close();
	}

	public static void reverse(int number) {
		while (number > 0) {
			System.out.print((number % 10));
			number /= 10;
		}
		System.out.println();
	}
}