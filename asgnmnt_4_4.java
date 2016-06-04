import java.util.Scanner;
public class asgnmnt_4_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		TestString testString = new TestString();
		System.out.println("Enter the string which you want to reverse");
		testString.setString(sc.next());
		System.out.println("\nThe string you entered was \n" + testString.getString() + "\n\n");
		System.out.println("The reverse of the string is \n");
		testString.printReverseString();
		System.out.println();
	}

}
