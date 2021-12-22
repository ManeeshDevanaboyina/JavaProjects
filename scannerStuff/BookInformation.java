package scannerStuff;

import java.util.Scanner;

/**
 * @author merry
 */
public class BookInformation
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the name of the author: " );
		String lastName = in.next();
		String firstName = in.next();

		// You have just read the first name of the author into
		// the variable firstName, so your cursor has stopped 
		// immediately after the name and is now sitting at the
		// end of your first line of input.
		// If we use next() again, the cursor will
		// move over any whitespace and read the next token.
		// However, the next line of input contains the title
		// of the book, which may contain spaces, so we cannot
		// use next(), since next() would only return the first
		// word of the title.
		// In order to get the full title of the book, we must use
		// nextLine(), but nextLine() does not ignore whitespace.
		// When nextLine() is called, the cursor reads any characters
		// left in the current line, including the newline character
		// at the end of the line, and then stops.
		// In this example, there are no more characters to read
		// except for the newline, so nextLine will read the newline
		// character and will then stop. In order to dispose of
		// this newline character and move on to the next line
		// containing the title, you need to call nextLine an
		// extra time. You do not have to store the result when
		// the only reason for the call is to dispose of the
		// newline character.

		// Dispose of the newline character at the end of the last
		// input string.
		in.nextLine();
		// You are now on the line containing the title, so you
		// can now prompt for and read the title.
		System.out.print("Enter the title: " );
		String title = in.nextLine();

		System.out.println("The name of the book is: " + title);
		System.out.println("The book was written by " +
			firstName + " " + lastName);
		in.close();
	}
}

