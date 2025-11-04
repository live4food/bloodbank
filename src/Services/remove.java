package Services;
import java.util.HashMap;

import Menu.*;

public class remove {

	public void removeBlood(String name, int Remquan,HashMap<String,Integer> blood) {
	       if (blood.containsKey(name)) {
	           int available = blood.get(name);
	            if (available >= Remquan) {
	
	                blood.put(name, available- Remquan);
	                System.out.println(Remquan + " units of " +name + " removed.");
	            } 
	            else {
	               
	                System.out.println("Blood unit not available in the requested quantity.");
	            }
	        } 
	       else {

	            System.out.println("Blood type " + name + " is not available.");
	        }
	    }
	}
