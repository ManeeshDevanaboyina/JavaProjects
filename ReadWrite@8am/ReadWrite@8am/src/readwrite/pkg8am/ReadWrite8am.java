package readwrite.pkg8am;

import java.io.*;
import java.util.Scanner;

public class ReadWrite8am {

    public static void main(String[] args) throws FileNotFoundException {
        // opening the file
        PrintWriter outputFile = new PrintWriter("StudentData.txt");
        // Read from the keyboard
        Scanner keyboard = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter your name ");
            String name = keyboard.nextLine();
            System.out.println("Enter the grade ");
            int grade = keyboard.nextInt();
            // writing into the file StudentData
            outputFile.println(name);
            outputFile.println(grade);
            keyboard.nextLine();
        }
        // closing the file
        outputFile.close();

    }

}
