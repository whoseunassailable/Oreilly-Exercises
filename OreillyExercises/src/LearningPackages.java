import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LearningPackages {
    public static void main(String[] args) throws IOException {
        // Importing the BR
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Asking the user to inupt their choice for the package
        System.out.println("How many packages that you want to enroll for : 1, 2 or 3? \t");

        // Considering the inupt
        int input = Integer.parseInt(reader.readLine());
        int baseCourse;
        int costPerCourse;
        int totalCost;

        System.out.println("How many courses that you want to enroll for : \t");
        int nCourses = Integer.parseInt(reader.readLine());

        switch (input){
            case 1:
                baseCourse = 2;
                costPerCourse = 6;
                totalCost = 10 + ((nCourses - baseCourse) * costPerCourse);
                System.out.println("Total cost is " + totalCost + "$");
                break;
            case 2:
                baseCourse = 4;
                costPerCourse = 4;
                totalCost = 12 + ((nCourses - baseCourse) * costPerCourse);
                System.out.println("Total cost is " + totalCost + "$");
                break;
            case 3:
                baseCourse = 6;
                costPerCourse = 3;
                totalCost = 15 + ((nCourses - baseCourse) * costPerCourse);
                System.out.println("Total cost is " + totalCost + "$");
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}
