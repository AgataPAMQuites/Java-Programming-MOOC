
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Double> points;
    
    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.points = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        double pointsInD = points;
        this.points.add(pointsInD);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
    
    public double averageOfGrades(){
        double sumOfGrades = 0;
        int count = 0;
        for(Integer points: grades){
            sumOfGrades += points;
            count++;
        }
        double averageOfGrades = sumOfGrades / count;
        if (count == 0) {
            return -1;            
        } else {
            return  averageOfGrades;
        }    
    }
    
    public double averageOfPoints(){
        double sumOfPoints = 0;
        int count = 0;
        for(Double pointsInD: points){
            sumOfPoints += pointsInD;
            count++;
        }
        double averageOfPoints = sumOfPoints / count;
        if (count == 0) {
            return -1;            
        } else {
            return  averageOfPoints;
        }  
    }
    
}
