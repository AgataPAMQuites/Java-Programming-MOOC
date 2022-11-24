
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agata
 */
public class UserInterface {
    
    private ArrayList<Bird> birds;
    
    public UserInterface(){
        this.birds = new ArrayList<>();
    }
    
    public void start(){
        
        
        Scanner scan = new Scanner(System.in);
                
        while(true){
            System.out.println("?");
            String command = scan.nextLine();
        
            if(command.equals("Quit")){
                break;            
            } else if(command.equals("Add")){
                System.out.println("Name:");
                String name = scan.nextLine();
                System.out.println("Name in Latin:");
                String latin = scan.nextLine();
                Bird bird =new Bird(name, latin);
                birds.add(bird);
            } else if(command.equals("Observation")){
                System.out.println("Bird?");
                String name = scan.nextLine();
                observation(name);
            } else if(command.equals("All")){
                for(Bird bird: birds){
                    System.out.println(bird);
                }
            }else if(command.equals("One")){
                System.out.println("Bird?");
                String name = scan.nextLine();
                One(name);
            }
        }
    }
    
    public boolean hasBird(String name){
        for(Bird bird: birds){
            if(bird.getName().equals(name)){
                return true;
            }            
        }
        return false;
    }
    
    public void observation(String name){
        if(hasBird(name)){
            for(Bird bird: birds){
                if(name.equals(bird.getName())){
                    bird.addObservation();
                }
            }       
        } else {
            System.out.println("Not a bird!");            
        }
    }
    
     public void One(String name) {
        if(hasBird(name)){
            for (Bird bird : birds) {
                if (bird.getName().contains(name)) {
                    System.out.println(bird);
                }
            } 
        } else {        
            System.out.println("Not a bird!");
        }
    }   
}
