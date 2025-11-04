package Services;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Menu.*;

public class avilablity {

	public void availability(List<String> validBlood,String bloodType,HashMap<String,Integer> bloodAvailable) {
        if(!validBlood.contains(bloodType)) {
     	   System.out.println("Please type the valid blood Type");
        }else {
     	   if(!bloodAvailable.containsKey(bloodType)) {
     		   System.out.println("blood Type is not available");
     	   }else {
     		   System.out.println("Blood group "+bloodType+" => "+bloodAvailable.get(bloodType)+" Units" );
     	   }
        }    	
 }


}
