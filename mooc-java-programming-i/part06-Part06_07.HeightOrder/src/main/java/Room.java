
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
public class Room {
    
    private ArrayList<Person> persons;
        
    public Room(){
        this.persons = new ArrayList<>();
        } 
    
    public void add(Person person){
        persons.add(person);
    }
    
    public boolean isEmpty(){
        if(persons.isEmpty()){
            return true;
        }
        return false;
    }
    
    public ArrayList<Person> getPersons(){
        return persons;                    
    } 
    
    public Person shortest(){
        Person shortest = null;
        boolean isFirst = true;
        
        for(Person person: persons){          
            if(isFirst == true){
                isFirst = false;
                shortest = person;                
            } else { 
                if(person.getHeight() < shortest.getHeight()){
                    shortest = person;
                }
            }            
        }    
        return shortest;
    }
    
    public Person take(){
        if(persons.isEmpty()){
            return null;
        } else {
            Person toTake = shortest();
            persons.remove(shortest());
            return toTake;
        }
    }
    
}
