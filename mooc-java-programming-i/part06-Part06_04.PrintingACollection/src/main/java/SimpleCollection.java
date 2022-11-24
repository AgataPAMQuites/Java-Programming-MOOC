
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString(){
        
        String printOutput  = "The collection " + this.name;               
        if(elements.isEmpty()){
            return printOutput + " is empty.";            
        } 
        String theList = "";
        
        if (this.elements.size() == 1){
            for (String element: elements){
                theList = element; 
            }  
            return printOutput + " has " + elements.size() + " element:\n" + theList;
        } else {
            for (String element: elements){
                theList += element + "\n"; 
            }   
            return printOutput + " has " + elements.size() + " elements:\n" + theList;
        }
        
    }
    
}
