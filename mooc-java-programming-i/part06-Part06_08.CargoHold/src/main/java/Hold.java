
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
public class Hold {
    
    private ArrayList<Suitcase> suitcases;
    private int maxSuitcaseWeight;
    
    
    public Hold(int maxSuitcaseWeight){
        this.suitcases = new ArrayList<>();
        this.maxSuitcaseWeight = maxSuitcaseWeight;
    }
    
    public int packOfSuitcases(){
        int packOfSuitcasesWeight = 0;
        for(Suitcase suitcase: suitcases){
            packOfSuitcasesWeight += suitcase.totalWeight();
        }
        return packOfSuitcasesWeight;
    }
    
    public void addSuitcase(Suitcase suitcase){
        
        if(suitcase.totalWeight() + packOfSuitcases() <= maxSuitcaseWeight){
            suitcases.add(suitcase);
            }
    }
    
    public void printItems(){
        for(Suitcase suitcase: suitcases){    
            suitcase.printItems();
        }
    }
    
    public String toString(){
        return suitcases.size() + " suitcases (" + packOfSuitcases() + " kg)";
    }
    
}
