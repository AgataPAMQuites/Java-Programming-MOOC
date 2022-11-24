
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
        
        HashMap<String, String> hm = new HashMap<>();
    hm.put("abcd", "jkl");
    hm.put("def", "mno");
    hm.put("ghi", "pqr");
    printValuesOfKeysWhere(hm, "a");
        
        
    }
    public static void printKeys(HashMap<String, String> hashmap){
        for(String string: hashmap.keySet()){
            System.out.println(string);
        }
    }

    public static void printKeysWhere(HashMap<String, String> hashmap, String text){
        for(String string: hashmap.keySet()){
            if(string.contains(text)){
                System.out.println(string);
            }
        }
    }
    
    public static void printValuesOfKeysWhere(HashMap<String, String> hashMap, String text){
        for(String string: hashMap.keySet()){
            if(string.contains(text)){
                System.out.println(hashMap.get(string));
            }
        }
    }
    
}
