import java.util.Scanner;

class ValidateMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        try {
            if (marks < 0 || marks > 100) {
                throw new Exception("Marks must be between 0 and 100.");
            }

            System.out.println("Valid Marks: " + marks);
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}