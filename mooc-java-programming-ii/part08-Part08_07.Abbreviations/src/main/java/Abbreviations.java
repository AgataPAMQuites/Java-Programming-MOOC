
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agata
 */
public class Abbreviations {
    
    private HashMap<String, String> abbreviationHashMap;
    
    public Abbreviations(){
        this.abbreviationHashMap = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation){
        abbreviationHashMap.put(abbreviation, explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation){
        if(abbreviationHashMap.containsKey(abbreviation)){
            return true;
        }
        return false;                
    }
    
    public String findExplanationFor(String abbreviation){
        String explanation = abbreviationHashMap.get(abbreviation);
        if(!abbreviationHashMap.containsKey(abbreviation)){
            return null;
        }
        return explanation;
    }
    
}
