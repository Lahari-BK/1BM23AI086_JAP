import java.util.Scanner;

class Student {
    int marks;
}

public class lab4b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int NUM_STUDENTS = 5;

        Student[] obj = new Student[NUM_STUDENTS]; // Proper array initialization

        for (int i = 0; i < NUM_STUDENTS; i++) { // Fixed loop condition
            obj[i] = new Student();
            System.out.println("Enter score for student " + (i + 1) + ":");
            obj[i].marks = scanner.nextInt();
        }

        // Compute statistics
        int sum = 0;
        int highestScore = obj[0].marks;

        for (int i = 0; i < NUM_STUDENTS; i++) { // Fixed loop condition
            sum += obj[i].marks;
            if (obj[i].marks > highestScore) {
                highestScore = obj[i].marks;
            }
        }

        // Display statistics
        System.out.println("\nTotal sum of marks: " + sum);
        System.out.println("Highest score: " + highestScore);

        scanner.close(); // Close scanner to avoid resource leaks
    }
}
