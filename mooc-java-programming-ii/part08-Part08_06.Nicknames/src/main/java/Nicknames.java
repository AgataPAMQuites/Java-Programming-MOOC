
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!
        
        HashMap<String,String> nicknames = new HashMap<>();
        
        nicknames.put("Matthew","matt");
        nicknames.put("michael", "mix");
        nicknames.put("arthur","artie");
        
        System.out.println(nicknames.get("Matthew"));
        
    }

}
