package food;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Items {
	
	public static LinkedHashMap<String, Integer> nonVegMenu = new LinkedHashMap<String, Integer>() {{ 
		put("Andhra Style Chicken Curry", 279); 
        put("Hyderabadi Dum Biryani", 350); 
        put("Curried Parmesan Fish Fingers",299);
        put("Fish Molee",120);
        put("Kori Gassi",99);
        put("Bommidayila Pulusu",125);
//        put("skip",0);
    }};
    
    public static LinkedHashMap<String, Integer> getnonVegMenu() {
    	return nonVegMenu;
    }
    
    public static void printnonVegMenu() {
    	for( Entry<String, Integer> entry : getnonVegMenu().entrySet() ){
//    		System.out.println();
		    System.out.println(" "+ entry.getKey() + ","+"Price:"+ " " + entry.getValue() );
		}
    }
    
    public static LinkedHashMap<String, Integer> idliMenu = new LinkedHashMap<String, Integer>() {{ 

        put("RavaIdli", 70); 
        put("RagiIdli",100);
        put("BrownRice-Idli",120);
        put("ThatteIdli",40);
        
        
    }};
    
    public static LinkedHashMap<String, Integer> getidliMap() {
    	return idliMenu;
    }
	
    public static void printidliMap() {
    	for( Entry<String, Integer> entry : getidliMap().entrySet() ){
		    System.out.println( entry.getKey() + " - " + entry.getValue() );
		}
    }
    
    public static LinkedHashMap<String, Integer> MasalaMenu = new LinkedHashMap<String, Integer>() {{ 
        put("Masala-vada", 50); 
        put("Masala-paneer ", 40); 
        put("Masala Channa", 80); 
        put("Quinoa Masala",99);
//        put("skip",0);
    }};
    
    public static LinkedHashMap<String, Integer> getMasalaMenu() {
    	return MasalaMenu;
    }
    
    public static void printsouthMenu() {
    	for( Entry<String, Integer> entry : getMasalaMenu().entrySet() ){
		    System.out.println( entry.getKey() + " - " + entry.getValue() );
		}
    }
    
    public static LinkedHashMap<String, Integer> specialMenu = new LinkedHashMap<String, Integer>() {{ 
    	put("Mushroom Kofta in Tomato Gravy", 99); 
        put("Aamras Ki Kadhi", 95); 
        put("Bombay Style Aloo", 70); 
        put("Chole Bhature",149);
        put("Malai ki Kheer",99);
        put("Palak paneer",129);
//        put("skip",0);
    }};
    
    public static LinkedHashMap<String, Integer> getnorthMenu() {
    	return specialMenu;
    }
    
    public static void printnorthMenu() {
    	for( Entry<String, Integer> entry : getnorthMenu().entrySet() ){
		    System.out.println( entry.getKey() + " - " + entry.getValue() );
		}
    }
}