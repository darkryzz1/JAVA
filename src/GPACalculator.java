
import java.util.ArrayList;

public class GPACalculator {
    private static GPACalculator onlyInstance = null;


    public static GPACalculator getInstance()
    {
        if (onlyInstance == null)
        {
            onlyInstance = new GPACalculator();
        }
        return onlyInstance;
    }


    public double calculateGPA(ArrayList<Course> courseList)
    {
        int totalCredit = 0;
        double totalGradePoint = 0.0;
        double gpa;
        for(Course i: courseList) {
            if (i.getCredit() > 0) {
                totalCredit += i.getCredit();
                switch (i.getGrade()) {
                    case "A+" -> totalGradePoint += i.getCredit() * 4.3;
                    case "A" -> totalGradePoint += i.getCredit() * 4;
                    case "A-" -> totalGradePoint += i.getCredit() * 3.7;
                    case "B+" -> totalGradePoint += i.getCredit() * 3.3;
                    case "B" -> totalGradePoint += i.getCredit() * 3;
                    case "B-" -> totalGradePoint += i.getCredit() * 2.7;
                    case "C+" -> totalGradePoint += i.getCredit() * 2.3;
                    case "C" -> totalGradePoint += i.getCredit() * 2;
                    case "C-" -> totalGradePoint += i.getCredit() * 1.7;
                    case "D+" -> totalGradePoint += i.getCredit() * 1.3;
                    case "D" -> totalGradePoint += i.getCredit() * 1;
                    case "D-" -> totalGradePoint += i.getCredit() * 0.7;
                    case "F" -> totalGradePoint += i.getCredit() * 0;
                    default -> throw new IllegalArgumentException("Invalid Grade");
                }
            }
            else
            {
                throw new IllegalArgumentException("Invalid Credit");
            }
        }
        gpa = totalGradePoint / totalCredit;
        return gpa;
    }
}
