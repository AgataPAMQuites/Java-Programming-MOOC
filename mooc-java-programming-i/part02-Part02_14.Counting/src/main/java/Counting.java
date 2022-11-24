
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int i = Integer.valueOf(scanner.nextLine());
        while(count != (i+1)){
            System.out.println(count);
            count++;
        }
    }
}
