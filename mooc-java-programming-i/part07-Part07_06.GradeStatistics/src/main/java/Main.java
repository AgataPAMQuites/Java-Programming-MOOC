
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Register register = new Register();

        UserInterface ui = new UserInterface(register, scanner);
        ui.start();
    }
}
