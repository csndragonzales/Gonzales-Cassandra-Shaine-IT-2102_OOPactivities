import java.util.Scanner;

public class ScholarshipSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("......................................");
            System.out.println("|              WELCOME!              |");
            System.out.println("......................................");
            System.out.println("Choose an option:");
            System.out.println("[1] Student\n[2] Admin\n[3] Exit");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1": 
                    handleStudent(scanner);
                    break;
                case "2": 
                    if (authenticateAdmin(scanner)) {
                        Admin.adminMenu(scanner);
                    } else {
                        System.out.println("Invalid password. Returning to main menu.");
                    }
                    break;
                case "3": 
                    exit = true;
                    System.out.println("Exiting the system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please choose 1, 2, or 3.");
            }
        }

        scanner.close();
    }

    private static boolean authenticateAdmin(Scanner scanner) {
        System.out.println("......................................");
        System.out.println("|          Welcome Admin!            |");
        System.out.println("......................................");
        System.out.print("Enter admin password: ");
        String password = scanner.nextLine();
        return password.equals("adminpass");
    }

    private static void handleStudent(Scanner scanner) {
        System.out.println("......................................");
        System.out.println("|     FILL OUT THE NEEDED FIELDS      |");
        System.out.println("......................................");
        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter your age: ");
        int studentAge = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter address: ");
        String studentAddress = scanner.nextLine();

        System.out.print("Enter email account: ");
        String studentEmail = scanner.nextLine();

        System.out.print("Enter contact number: ");
        String studentContactNum = scanner.nextLine();

        System.out.print("Enter school: ");
        String studentSchool = scanner.nextLine();

        System.out.print("Enter student type (Highschool/College): ");
        String studentLevel = scanner.nextLine().toLowerCase();

        System.out.print("Enter grade level/year level: ");
        String studentGradeLevel = scanner.nextLine();

        System.out.print("Enter program: ");
        String studentProgram = scanner.nextLine();

        System.out.print("Enter GWA: ");
        double studentGWA = scanner.nextDouble();
        scanner.nextLine(); 

        ScholarshipApplication studentApp = null;

        if (studentLevel.equals("highschool")) {
            studentApp = new HighSchoolStudent(studentName, studentAge, studentAddress, studentEmail,
                    studentContactNum, studentSchool, studentLevel, studentGradeLevel, studentProgram, studentGWA);
        } else if (studentLevel.equals("college")) {
            studentApp = new CollegeStudent(studentName, studentAge, studentAddress, studentEmail,
                    studentContactNum, studentSchool, studentLevel, studentGradeLevel, studentProgram, studentGWA);
        } else {
            System.out.println("Invalid student type entered! Returning to menu.");
            return;
        }

        System.out.println("......................................");
        System.out.println("|   Please review your information   |");
        System.out.println("......................................");
        System.out.println("Name:           |" + studentName);
        System.out.println("Age:            |" + studentAge);
        System.out.println("Address:        |" + studentAddress);
        System.out.println("Email:          |" + studentEmail);
        System.out.println("Contact Number: |" + studentContactNum);
        System.out.println("School:         |" + studentSchool);
        System.out.println("Student Type:   |" + studentLevel);
        System.out.println("Grade Level:    |" + studentGradeLevel);
        System.out.println("Program:        |" + studentProgram);
        System.out.println("GWA:            |" + studentGWA);
    
        System.out.println("......................................");
        System.out.print("\nAre all the information correct? (yes/no): ");
        String confirmation = scanner.nextLine().toLowerCase();

        if (confirmation.equals("yes")) {
            System.out.println(studentApp.processApplication());
        } else {
            System.out.println("Application cancelled. Returning to menu.");
        }

        System.out.println("......................................");
        System.out.println("|               OPTIONS              |");
        System.out.println("......................................");
        System.out.println("[1] Return to Main Menu\n[2] Exit");
        String postChoice = scanner.nextLine();

        if (postChoice.equals("2")) {
            System.out.println("Exiting the system. Thank you!");
            System.exit(0);
        }
    }
}
