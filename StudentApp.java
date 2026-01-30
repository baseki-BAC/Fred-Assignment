import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Student Registration System ===");
        
        // Gathering basic information
        System.out.print("Enter Student Name: ");
        String name = input.nextLine();
        
        System.out.print("Enter Matric Number: ");
        int matricNo = input.nextInt();
        
        System.out.print("Enter Year of Birth: ");
        int yearBirth = input.nextInt();

        // 1. Create the Student object using the 1st constructor
        // This automatically calls calculateAge()
        Student student = new Student(name, matricNo, yearBirth);

        // 2. Determine how many subjects to register
        System.out.print("How many subjects do you want to register (1-3)? ");
        int count = input.nextInt();
        input.nextLine(); // Consume the leftover newline

        // 3. Handle Overloaded method selection based on input
        if (count == 1) {
            System.out.print("Enter Subject 1: ");
            String s1 = input.nextLine();
            student.registerSubject(s1);
        } 
        else if (count == 2) {
            System.out.print("Enter Subject 1: ");
            String s1 = input.nextLine();
            System.out.print("Enter Subject 2: ");
            String s2 = input.nextLine();
            student.registerSubject(s1, s2);
        } 
        else if (count == 3) {
            System.out.print("Enter Subject 1: ");
            String s1 = input.nextLine();
            System.out.print("Enter Subject 2: ");
            String s2 = input.nextLine();
            System.out.print("Enter Subject 3: ");
            String s3 = input.nextLine();
            student.registerSubject(s1, s2, s3);
        } 
        else {
            System.out.println("Invalid number of subjects. Registration failed.");
        }

        // 4. Calculate fees (GHC 350.00 per subject)
        student.calculateFee();

        // 5. Display the final information
        student.displayInfo();

        input.close();
    }
}