
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agata
 */
public class Recipe {
    
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;
    
    public Recipe(String name, int cookingTime){
        this.name = name;
        this.cookingTime  = cookingTime;
        this.ingredients = new ArrayList<>();
    }
    
    public String getName(){
        return this.name;
    } 
   
    public void addIngredient(String ingredient){
        ingredients.add(ingredient);
    }
    
    public int getTime(){
        return this.cookingTime;
    }
    
    public boolean hasIngredient(String ingredient){
        if(ingredients.contains(ingredient)){
            return true;
        }
        return false;
    }
    
    
    public String toString(){
        return name + ", cooking time: " + cookingTime;
    }    
    
}
