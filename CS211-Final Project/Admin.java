import java.util.Scanner;

public class Admin {

    private static double highSchoolPassingGWA = 85.0;  
    private static double collegePassingGWA = 3.0;  
    private static String payoutDate = "2024-12-31"; 

    public static void changePassingGWA(String level, double newGWA) {
        if (level.equals("highschool")) {
            highSchoolPassingGWA = newGWA;
            System.out.println("......................................");
            System.out.println("High school passing GWA has been updated to: " + highSchoolPassingGWA);
        } else if (level.equals("college")) {
            collegePassingGWA = newGWA;
            System.out.println("......................................");
            System.out.println("College passing GWA has been updated to: " + collegePassingGWA);

        } else {
            System.out.println("Invalid student level.");
        }
    }

    public static void changePayoutDate(String newPayoutDate) {
        payoutDate = newPayoutDate;
        System.out.println("Payout date has been updated to: " + payoutDate);
    }

    public static void adminMenu(Scanner scanner) {
        while (true) {
            System.out.println("......................................");
            System.out.println("|             ADMIN MENU             |");
            System.out.println("......................................");
            System.out.println("[1] Change High School Passing GWA");
            System.out.println("[2] Change College Passing GWA");
            System.out.println("[3] Change Payout Date");
            System.out.println("[4] Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) {
                case 1:
                    System.out.print("Enter new High School Passing GWA: ");
                    double highSchoolGWA = scanner.nextDouble();
                    changePassingGWA("highschool", highSchoolGWA);
                    break;

                case 2:
                    System.out.print("Enter new College Passing GWA: ");
                    double collegeGWA = scanner.nextDouble();
                    changePassingGWA("college", collegeGWA);
                    break;

                case 3:
                    System.out.print("Enter new Payout Date (YYYY-MM-DD): ");
                    String newDate = scanner.nextLine();
                    changePayoutDate(newDate);
                    break;

                case 4:
                    System.out.println("Exiting Admin Menu.");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static double getHighSchoolPassingGWA() {
        return highSchoolPassingGWA;
    }

    public static double getCollegePassingGWA() {
        return collegePassingGWA;
    }

    public static String getPayoutDate() {
        return payoutDate;
    }
}
