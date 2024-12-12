public class HighSchoolStudent extends ScholarshipApplication {
    public HighSchoolStudent(String studentName, int studentAge, String studentAddress,
                             String studentEmail, String studentContactNum, String studentSchool,
                             String studentLevel, String studentGradeLevel, String studentProgram,
                             double studentGWA) {
        super(studentName, studentAge, studentAddress, studentEmail, studentContactNum,
              studentSchool, studentLevel, studentGradeLevel, studentProgram, studentGWA);
    }

    @Override
    public String processApplication() {
        if (getStudentGWA() >= Admin.getHighSchoolPassingGWA()) {
            String payoutDate = Admin.getPayoutDate();
            System.out.println("......................................");
            return "Scholarship application accepted for " + getStudentName() + "\nPayout date: " + payoutDate;
        } else {
            System.out.println("......................................");
            return "Scholarship application rejected for " + getStudentName();
        }
    }
}