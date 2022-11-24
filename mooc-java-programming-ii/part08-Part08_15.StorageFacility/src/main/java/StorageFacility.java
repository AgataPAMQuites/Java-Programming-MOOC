
import java.util.ArrayList;
import java.util.Dictionary;
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
public class StorageFacility {
    
    private HashMap <String, ArrayList> storageUnits;
    
    public StorageFacility(){
        this.storageUnits = new HashMap<>();
    }
    
    public void add(String unit, String item){
        storageUnits.putIfAbsent(unit, new ArrayList());
        ArrayList<String> items = storageUnits.get(unit);
        items.add(item);
    }
    
    public ArrayList<String> contents(String storageUnit){
        return storageUnits.getOrDefault(storageUnit, new ArrayList());
    }
    
    public void remove(String storageUnit, String item){
        storageUnits.get(storageUnit).remove(item);
    }
    
    public ArrayList<String> storageUnits(){
        ArrayList<String> units = new ArrayList<>();        
        for(String unit: storageUnits.keySet()){
            if(!(storageUnits.get(unit).isEmpty())){
                units.add(unit);
            }
        }
        return units;
    }
    
}
