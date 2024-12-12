public abstract class ScholarshipApplication {
    private String studentName;
    private int studentAge;
    private String studentAddress;
    private String studentEmail;
    private String studentContactNum;
    private String studentSchool;
    private String studentLevel;
    private String studentGradeLevel;
    private String studentProgram;
    private double studentGWA;

    public ScholarshipApplication(String studentName, int studentAge, String studentAddress,
                                  String studentEmail, String studentContactNum, String studentSchool,
                                  String studentLevel, String studentGradeLevel, String studentProgram,
                                  double studentGWA) {
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentAddress = studentAddress;
        this.studentEmail = studentEmail;
        this.studentContactNum = studentContactNum;
        this.studentSchool = studentSchool;
        this.studentLevel = studentLevel;
        this.studentGradeLevel = studentGradeLevel;
        this.studentProgram = studentProgram;
        this.studentGWA = studentGWA;
    }

    public abstract String processApplication();

    public double getStudentGWA() {
        return studentGWA;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public String getStudentContactNum() {
        return studentContactNum;
    }

    public String getStudentSchool() {
        return studentSchool;
    }

    public String getStudentLevel() {
        return studentLevel;
    }

    public String getStudentGradeLevel() {
        return studentGradeLevel;
    }

    public String getStudentProgram() {
        return studentProgram;
    }
}
