
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
public class Bird {
    
    private String name;
    private String latin;
    private int observations;
    
    public Bird(String name, String latin){
        this.name = name;
        this.latin = latin;
        this.observations = 0;
    }
    
    
    
    public String getName(){
        return this.name;
    } 
    
    public String getLatin(){
        return this.latin;
    }       
    
    public int getObservations(){        
        return observations;  
    }
    
    public void addObservation(){
        observations++;
    }
    
    
    public String toString(){
        return name + " (" + latin + "): " + observations + " observations";
    }
    
}
