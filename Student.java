import java.time.Year;

public class Student {
    // Attributes
    private String name;
    private int matricNo;
    private int yearBirth;
    private int age;
    private double fees;
    private int numberOfCoursesRegistered;
    private String[] subjectName;
    private boolean registered;

    // 1st Constructor
    public Student(String name, int matricNo, int yearBirth) {
        this.name = name;
        this.matricNo = matricNo;
        this.yearBirth = yearBirth;
        this.numberOfCoursesRegistered = 0;
        this.subjectName = new String[3];
        this.calculateAge();
    }

    // 2nd Constructor
    public Student(String name, int matricNo) {
        this.name = name;
        this.matricNo = matricNo;
        this.numberOfCoursesRegistered = 0;
        this.subjectName = new String[3];
    }

    // Member Methods
    
    // Calculate Age
    public void calculateAge() {
        int currentYear = Year.now().getValue(); // Using 2026
        this.age = currentYear - this.yearBirth;
    }

    // Calculate Fees
    public void calculateFee() {
        if (this.registered) {
            this.fees = this.numberOfCoursesRegistered * 350.00;
        }
    }

    // Overloaded method: Register 1 subject
    public void registerSubject(String subject1) {
        this.subjectName[0] = subject1;
        this.numberOfCoursesRegistered = 1;
        this.registered = true;
    }

    // Overloaded method: Register 2 subjects
    public void registerSubject(String subject1, String subject2) {
        this.subjectName[0] = subject1;
        this.subjectName[1] = subject2;
        this.numberOfCoursesRegistered = 2;
        this.registered = true;
    }

    // Overloaded method: Register 3 subjects
    public void registerSubject(String subject1, String subject2, String subject3) {
        this.subjectName[0] = subject1;
        this.subjectName[1] = subject2;
        this.subjectName[2] = subject3;
        this.numberOfCoursesRegistered = 3;
        this.registered = true;
    }

    // Display Information
    public void displayInfo() {
        if (this.registered) {
            System.out.println("--- Student Information ---");
            System.out.println("Name: " + name);
            System.out.println("Matric No: " + matricNo);
            System.out.println("Age: " + age);
            System.out.println("Courses Registered: " + numberOfCoursesRegistered);
            System.out.println("Total Fees: GHC " + fees);
            System.out.print("Subjects: ");
            for (int i = 0; i < numberOfCoursesRegistered; i++) {
                System.out.print(subjectName[i] + (i < numberOfCoursesRegistered - 1 ? ", " : ""));
            }
            System.out.println("\n---------------------------");
        }
    }
}