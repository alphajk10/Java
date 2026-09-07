import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class OpenFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        try {
            File file = new File(fileName);
            Scanner fileReader = new Scanner(file);

            System.out.println("File Contents:");

            while (fileReader.hasNextLine()) {
                System.out.println(fileReader.nextLine());
            }

            fileReader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
    }
}
