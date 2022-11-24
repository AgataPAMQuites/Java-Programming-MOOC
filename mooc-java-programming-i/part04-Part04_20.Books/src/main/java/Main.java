import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> book = new ArrayList<>();

        while(true){
            System.out.println("Title:");
            String title = scanner.nextLine();
            if(title.isEmpty()){
                break;
            }
            
            System.out.println("Pages:");
            int pages = Integer.valueOf(scanner.nextLine());
            
            System.out.println("Publication year:");
            int year = Integer.valueOf(scanner.nextLine());
            
            book.add(new Book(title, pages, year));
            
        }
        
        System.out.println("What information will be printed?");
        String info = scanner.nextLine();
        
        for(Book thisBook: book){
            if(info.equals("everything")){
                System.out.println(thisBook);
            } else {
                System.out.println(thisBook.getName());
            }
        }
        
        
        
    }
}
