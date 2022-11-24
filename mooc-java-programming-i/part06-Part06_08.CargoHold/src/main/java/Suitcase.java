
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
public class Suitcase {
    
    private  ArrayList<Item> items;
    private int maxWeight;
    
    
    public Suitcase(int maxWeight){
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void addItem(Item item){
        ;
        if(item.getWeight() <= maxWeight - totalWeight()){
            items.add(item);            
        }
    }
    
    public void printItems(){
        for(Item item: items){    
            System.out.println(item);
        }
    }
    
        
    public Item heaviestItem(){
        
        if(items.isEmpty()){
            return null;
        } else {
            Item heaviest = new Item("test", 0);
            for(Item item: items){
                if(item.getWeight() > heaviest.getWeight()){
                    heaviest = item;
                }
            }       
            return heaviest;
        }
    }
    
    public int totalWeight(){
        int totalWeight = 0;
        for(Item item: items){
            totalWeight += item.getWeight();
        }        
        return totalWeight;
    }
    
    public String toString(){
        
                
        if(items.isEmpty()){
            return "no items (" + totalWeight() + " kg)";
        } else if (items.size() == 1){
            return items.size() + " item (" + totalWeight() + " kg)";
        } else {
            return items.size() + " items (" + totalWeight() + " kg)";
        }
    }
}
