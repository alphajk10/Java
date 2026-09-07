import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class CountLines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        int count = 0;

        try {
            File file = new File(fileName);
            Scanner fileReader = new Scanner(file);

            while (fileReader.hasNextLine()) {
                fileReader.nextLine();
                count++;
            }

            fileReader.close();

            System.out.println("Number of lines = " + count);
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
    }
}