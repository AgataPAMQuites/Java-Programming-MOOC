
public class AdvancedAstrology {

    public static void printStars(int number) {
        int count = 0;
        while(count < number){
            System.out.print("*");
            count++;
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        int count = 0;
        while(count < number){
            System.out.print(" ");
            count++;
        }
    }

    public static void printTriangle(int size) {
        int stars = 1;
        int spaces = size - 1;
        while(stars <= size){
            printSpaces(spaces);
            printStars(stars);
            stars++;
            spaces--;                   
        }               
    }

    public static void christmasTree(int height) {
        int stars = 1;
        int spaces = height - 1;
        while(stars < height * 2){
            printSpaces(spaces);
            printStars(stars);
            stars += 2;
            spaces--;
        }
        int baseSpaces = height -2;
        int count = 0;
        while(count < 2){
            printSpaces(baseSpaces);
            printStars(3);
            count++;
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
