
import java.util.Scanner;


    public class UserInterface {
        private Register register;
        private Scanner scanner;

    public UserInterface(Register register, Scanner scanner) {
        this.register = register;
        this.scanner = scanner;
    }

    public void start() {
        readPoints();
        System.out.println("");
        printPointInfo();
        printGradeDistribution();
    }

    public void readPoints() {
        while (true) {
            System.out.print("Enter point totals, -1 stops:");
            String input = scanner.nextLine();
            if (input.equals("-1")) {
                break;
            }

            int points = Integer.valueOf(input);

            if (points < 0 || points > 100) {                
                continue;
            } 
            this.register.addPointsGrades(points);
        }
    }

    public void printPointInfo(){
        System.out.println("Point average (all): " + register.average());
        System.out.println("Point average (passing): " + register.pass());
        System.out.println("Pass percentage: " + register.percentage());
    }
    
    public void printGradeDistribution() {
        int grade = 5;
        while (grade >= 0) {
            int stars = register.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printsStars(stars);
            System.out.println("");
            grade = grade - 1;
        }
        
    }

    public static void printsStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
        
    }
}
