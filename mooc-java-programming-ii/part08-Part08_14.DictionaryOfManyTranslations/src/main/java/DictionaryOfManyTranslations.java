import java.util.ArrayList;
import java.util.Collections;
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
public class DictionaryOfManyTranslations {
   
    private HashMap <String, ArrayList<String>> dictionary;
    
    public DictionaryOfManyTranslations(){
        this.dictionary = new HashMap<>();
    }
    
    public void add(String word, String translation){
        dictionary.putIfAbsent(word, new ArrayList<>());
        ArrayList<String> translations = dictionary.get(word);
        translations.add(translation);
    }
    
    public ArrayList<String> translate(String word){
        return dictionary.getOrDefault(word, new ArrayList<>());
    }
    
    public void remove(String word){
        dictionary.remove(word);
    }
}
