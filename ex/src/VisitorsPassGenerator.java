public class VisitorsPassGenerator {

    public static void main(String[] args) {

        // Stores the name of the visitor
        String visitorName = "Alphin Joby";

        // Stores the date of the visit
        String visitDate = "17-08-2026";

        // Stores the name of the employee being visited
        String hostEmployeeName = "John Mathew";

        // Stores the unique visitor pass number
        int passNumber = 1001;

        // Prints the visitor pass
        System.out.println("\n\t==================================");
        System.out.println("\t          VISITOR PASS");
        System.out.println("\t==================================");
        System.out.printf("\tPass Number   : %d%n", passNumber);
        System.out.printf("\tVisitor Name  : %s%n", visitorName);
        System.out.printf("\tVisit Date    : %s%n", visitDate);
        System.out.printf("\tHost Employee : %s%n", hostEmployeeName);
        System.out.println("\t==================================");
    }
}
