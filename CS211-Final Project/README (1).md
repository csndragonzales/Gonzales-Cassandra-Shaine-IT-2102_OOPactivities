# Scholarship Application System

## I. Brief Project Overview


This Scholarship Application System is a console-based platform that allows students to apply for scholarships by submitting their academic details and supporting documents. It features an admin panel where administrators can manage the eligibility criteria by adjusting the passing GWA for high school and college students, as well as set the scholarship payout date. This system offers an easy-to-use, secure interface for both students and administrators, simplifying the application process and managing scholarship payouts efficiently. The platform aims to enhance efficiency, transparency, and accessibility for all users involved.
## II. Explanation of How OOP Principles Were Applied

### Encapsulation
- **Implementation**:
  - Classes like `ScholarshipApplication`, `HighSchoolStudent`, and `CollegeStudent` encapsulate attributes such as `studentName`, `studentGWA`, and `studentLevel`.
  - Methods like `processApplication()` provide controlled access to manipulate these attributes.
  - Access modifiers ensure attributes are private and accessible only through getters or specific methods.

### Inheritance
  - `HighSchoolStudent` and `CollegeStudent` extend the abstract `ScholarshipApplication` class.
  - Common properties and methods such as `studentName` and `studentAge` are inherited while child classes override specific behaviors like `processApplication`.

### Polymorphism
- **Implementation**:
  - The abstract method `processApplication` is overridden in `HighSchoolStudent` and `CollegeStudent`.
  - Parent class references handle subclass objects dynamically, e.g., `ScholarshipApplication studentApp = new HighSchoolStudent(...)`.

### Abstraction
  - `ScholarshipApplication` is abstract, serving as a blueprint for subclasses.
  - Subclasses implement the `processApplication` method while hiding implementation specifics from calling code.

## III. Details of the Chosen SDG and Its Integration into the Project

### SDG 4: Quality Education

- Scholarships make education affordable, offering financial support to students from low-income households giving them a chance to get quality education
### SDG 1: No Poverty

-  By enabling access to education, scholarships help individuals improve their social and economic conditions, breaking the cycle of poverty.

### SDG 10: Reduced Inequality

-  The system prioritizes fair opportunities for marginalized groups such as rural or low-income students, promoting equal access to quality education.

### SDG 17: Partnership for the Goals

- The system fosters collaboration between government and educational institutions to enhance the impact and reach of scholarship initiatives.

## IV. Instructions for Running the Program

1. **User Selection**:

   - Choose whether the user is a **Student** or an **Admin**.

2. **If an Admin**:

   - **Authentication**: Enter the admin password to access the admin menu.
   - **Admin Menu Options**:
     - Change the passing GWA for high school or college students.
     - Set the payout date for approved applications.

3. **Student Workflow**:

   - Fill out the required information (e.g., name, age, address, GWA).
   - Confirm the entered details.
   - The system verifies the application based on the GWA set by the admin and determines if the application is **approved** or **rejected**.

4. **Navigation**:

   - After completing an operation, the user can return to the main menu or exit the program.

## Explanation

### Admin Authentication

- **Method**: `authenticateAdmin` verifies the admin by checking their password.
- **Outcome**: Grants access to the admin menu upon successful authentication or displays an error message otherwise.

### Student Workflow

- **Method**: `handleStudent` collects student details (e.g., name, age, address, GWA) through prompts.
- Depending on the student type (Highschool or College), an appropriate subclass object is created.
- **Confirmation**: Shows a summary of the entered information for confirmation before processing.

###
