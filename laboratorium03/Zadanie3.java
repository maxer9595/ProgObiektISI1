package pl.edu.uwm.wmii.marcelmrozowski.laboratorium03;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Zadanie3 {
    public static int fileCountSubStr(String filename, String subStr){
        try {
            int counter = 0;
            File file = new File(filename);
            String reader;
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                reader = scanner.nextLine();
                counter = counter + Zadanie1.countSubStr(reader, subStr);
            }

            return counter;
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();

            return 0;
        }

    }
}
