import java.util.Scanner;

class ArrayIndexValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.print("Enter an index: ");
        int index = sc.nextInt();

        try {
            System.out.println("Element = " + numbers[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index.");
        }
    }
}