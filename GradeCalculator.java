import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of your subjects: ");
        int numOfSubjects = sc.nextInt();

        int totalMarks = 0;
        for (int i = 1; i <= numOfSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + ": ");
            int marks = sc.nextInt();
            totalMarks += marks;
        }

        double averagePercentage = (double) totalMarks / numOfSubjects;

        char grade ;
         if (averagePercentage >= 95) {
            grade = 'O';
        }else if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else if (averagePercentage >= 35) {
            grade = 'E';
        } else if (averagePercentage <35){
            grade = 'F';
        }else {
            grade = 'I';
            //I = INVALID
        }
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

    
    }
}
