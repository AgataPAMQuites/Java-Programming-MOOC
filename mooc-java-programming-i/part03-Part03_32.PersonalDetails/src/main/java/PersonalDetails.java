
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        boolean isfirst = true;
        int lengthOfOld = 0;
        int lenght = 0;
        String nameOfOld = "";
        String name = "";

        while(true){
            String text = String.valueOf(scanner.nextLine());
            if(text.equals("")){
                break;
            } else {
                String[] pieces = text.split(",");

                if(isfirst){
                    name = pieces[0];
                    nameOfOld = pieces[0];
                    lengthOfOld = nameOfOld.length();
                    isfirst = false;
                    sum += Integer.valueOf(pieces[1]);
                    count++;
                    
                } else {
                    name = pieces[0];
                    lenght = name.length();
                    sum += Integer.valueOf(pieces[1]);
                    count++;

                   

                    if(lengthOfOld < lenght){
                        nameOfOld = name;
                        lengthOfOld = nameOfOld.length();
                    }

                }
                
            }
        }


        double average = (double) sum / count;
        System.out.println("Longest name: " + nameOfOld);
        System.out.println("Average of the birth years: " + average);

    }
}
