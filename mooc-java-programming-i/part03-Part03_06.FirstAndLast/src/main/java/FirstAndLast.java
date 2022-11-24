
import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLast {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
    
    int index = list.size();
    String first = list.get(index - index);
    String last = list.get(index - 1);
    
        System.out.println(first);
        System.out.println(last);
    }
}
