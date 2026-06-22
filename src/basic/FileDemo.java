package basic;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo {
    public static void main(String[] args) {

        try {
            // Create a file object
            File myFile = new File("student.txt");

            // Create file
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }

            // Write to file
            FileWriter writer = new FileWriter(myFile);
            writer.write("Name: Yash Izate\n");
            writer.write("Branch: VLSI Design and Technology\n");
            writer.write("CGPA: 8.74\n");
            writer.close();

            System.out.println("Successfully wrote to the file.");

            // Read from file
            Scanner sc = new Scanner(myFile);

            System.out.println("\nContents of file:");
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                System.out.println(data);
            }
            sc.close();

            // File information
            System.out.println("\nFile Name: " + myFile.getName());
            System.out.println("Path: " + myFile.getAbsolutePath());
            System.out.println("Readable: " + myFile.canRead());
            System.out.println("Writable: " + myFile.canWrite());
            System.out.println("File Size: " + myFile.length() + " bytes");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}