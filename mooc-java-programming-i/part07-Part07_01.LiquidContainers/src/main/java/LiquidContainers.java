

import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int first = 0;
        int limitOfFirst = 100;
        int second = 0;
        int limitOfSecond = 100;

        while (true) {
            System.out.println("First: " + first + "/" + limitOfFirst);
            System.out.println("Second: " + second + "/" + limitOfSecond);
            

            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                break;
            } else {
                String[] parts = input.split(" ");
                String command = parts[0];
                int amount = Integer.valueOf(parts[1]);
                
                if(command.equals("add")){
                    if(amount > 0){                     
                        first += amount;
                        if(first > 100){
                            first = 100;
                        }
                    }    
                
                } else if (command.equals("move")){
                    if(amount > 0){
                        if(first >= amount){
                            first -= amount;
                            second += amount;
                        } else if (first < amount){
                            second += first;
                        }
                        
                        if(first < 0){
                            first = 0;
                        }
                        if(second > 100){
                            second = 100;
                        }
                    }    
                
                } else if (command.equals("remove")){
                    second -= amount;
                    if(second < 0){
                        second = 0;
                    }
                }
                        
            }
            
            
        }
    }

}
