import java.util.ArrayList;
import java.util.Scanner;


public class CourseList {
    private ArrayList<Course> courseList;


    public CourseList()
    {
        courseList = new ArrayList<>();
    }


    public ArrayList<Course> getCourseList()
    {
        return courseList;
    }


    public void setCourseList(ArrayList<Course> courseList)
    {
        this.courseList = courseList;
    }

    public void addCourse(int numOfCourses)
    {
        if (numOfCourses > 0) {
            Scanner input = new Scanner(System.in);
            for (int i = 0; i < numOfCourses; i++) {
                System.out.println("Please enter the name of course " + (i + 1));
                String name = input.next();
                System.out.println("Please enter the credit of course " + (i + 1));
                int credit = input.nextInt();
                System.out.println("Please enter the grade you achieved in course " + (i + 1));
                String grade = input.next();
                Course course = new Course(name, credit, grade);
                courseList.add(course);
            }
        }
        else
        {
            throw new IllegalArgumentException("Invalid number of courses");
        }
    }
}