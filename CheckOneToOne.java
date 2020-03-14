import static java.lang.System.*;
import java.util.*;
class CheckOneToOne{
	public static void main(String[]args){
		if ( args == null || args.length< 2 ){
                err.println("Two Strings are required!!");
                exit(1);
        }
        System.out.println(checkOneToOne(args[0],args[1]));
	}
	public static boolean checkOneToOne(String s, String t) {
		if(s.length()!= t.length())
		        return false; 
		HashMap<Character, Character> map = new HashMap<>();
			for(int i=0; i<s.length(); i++){
		        char c1 = s.charAt(i);
		        char c2 = t.charAt(i);
		        if(map.containsKey(c1)) {
		            if(c2!=map.get(c1))
		                return false;
		        }
		        else
		            map.put(c1, c2);
		    }
		return true;
	}
}