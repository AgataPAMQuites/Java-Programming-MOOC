/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author agata
 */
public class UserInterface {
    
    private ArrayList<Recipe> recipes;
    
    public UserInterface(){
        this.recipes = new ArrayList<>();
    }    
    
    public void start(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
    
        try(Scanner input = new Scanner(Paths.get(file))){
            while(input.hasNextLine()){                
                String name = input.nextLine();
                int time = Integer.valueOf(input.nextLine());
                Recipe recipe = new Recipe(name, time);   
                
                while(input.hasNextLine()){
                    String ingredient = input.nextLine();
                    if(ingredient.isEmpty()){
                        break;
                    }
                    recipe.addIngredient(ingredient);
                }           
            recipes.add(recipe);
            }
        }
        catch( Exception e){
            System.out.println("Reading the file " + file + " failed.");
        }
        
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println(" ");
        
        
        while(true){
            System.out.println("Enter command:");
            String command = scanner.nextLine();
            System.out.println(" ");
            
            if(command.equals("stop")){
                break;
            } else if(command.equals("list")){
                System.out.println("Recipes:");
                for(Recipe recipe: recipes){
                    System.out.println(recipe);
                }
            } else if(command.equals("find name")){
                System.out.println("Searched word:");
                String toSearch = scanner.nextLine();
                findName(toSearch);
            } else if(command.equals("find cooking time")){
                System.out.println("Max cooking time:");
                int time = Integer.valueOf(scanner.nextLine());
                findTime(time);
            } else if(command.equals("find ingredient")){
                System.out.println("Ingredient:");
                String ingredient = scanner.nextLine();
                System.out.println("Recipes:");
                findIngredient(ingredient);
            }
        }
        
    }
    
    public void findName(String toSearch){
        for(Recipe recipe: recipes){
            if(recipe.getName().contains(toSearch)){
                System.out.println(recipe);
            }          
        }
    }
    
    public void findTime(int time){
        for(Recipe recipe: recipes){
            if(recipe.getTime() <= time){
                System.out.println(recipe);
            }
        }
    }
    
    public void findIngredient(String ingredient){
        for(Recipe recipe: recipes){
            if(recipe.hasIngredient(ingredient)){
                System.out.println(recipe);
            }
        }
    }
    
}
