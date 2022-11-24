
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which file should have its contents printed?");
    
        String fileName = scanner.nextLine();
    
        try(Scanner anotherScanner = new Scanner(Paths.get(fileName))) {
            
        
            while (anotherScanner.hasNextLine()){
                String output = anotherScanner.nextLine();
                System.out.println(output);
            }
        
        } 
        catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }

        
    }
}
