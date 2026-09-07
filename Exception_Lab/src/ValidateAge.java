import java.util.Scanner;

class ValidateAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        try {
            if (age < 18) {
                throw new Exception("Age must be 18 or above.");
            }

            System.out.println("Eligible.");
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}