package readwrite.pkg8am;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Readingthefile {

    public static void main(String[] args) throws FileNotFoundException {
        // open file for reading
        File myFile = new File("Numbers.txt");
        Scanner inputFile = new Scanner(myFile);
        int sum = 0;
        for (int i = 1; i <= 7; i++) {
            // Reading the file
            int num = inputFile.nextInt();
            sum = sum + num;
        }
        // Writing to the screen
        System.out.println("Sum is :" + sum);        
        inputFile.close();
    }

}
