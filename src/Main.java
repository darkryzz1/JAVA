import java.util.Scanner;



public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello!\n Enter the number of tour courses for which you want to calculate GPA");
        int numOfCourses = input.nextInt();
        CourseList courseList = new CourseList();
        GPACalculator calculator = GPACalculator.getInstance();
        try {
            courseList.addCourse(numOfCourses);
            System.out.print("Your GPA is " + calculator.calculateGPA(courseList.getCourseList()));
        }
        catch (IllegalArgumentException exception)
        {
            System.out.println("Exception thrown: "+exception);
        }
    }
}