package Services;
import Menu.*;
import java.util.ArrayList;
import java.util.HashMap;

public class AddBloodRecords {
	public void add(String blood_group,int units,HashMap<String,Integer> map) {
		 ArrayList<String> validBloodTypes = new ArrayList<>();
	     validBloodTypes.add("A+");
	     validBloodTypes.add("A-");
	     validBloodTypes.add("B+");
	     validBloodTypes.add("B-");
	     validBloodTypes.add("AB+");
	     validBloodTypes.add("AB-");
	     validBloodTypes.add("O+");
	     validBloodTypes.add("O-");
	     String enteredBloodType=blood_group.toUpperCase();
	     if (!validBloodTypes.contains(enteredBloodType)) {
	            // Perform a task if the blood type is not valid
	            System.out.println("Invalid blood type entered. Please enter a valid blood type.");
	            // Additional task could be performed here
	        } else {
	        	if(!map.containsKey(enteredBloodType)) {
	        		map.put(enteredBloodType,units);
	        		System.out.println("Added new entry for blood type: " + enteredBloodType);
	        	}
	        	else {
	        	int currentvalue=map.get(enteredBloodType);
	        	map.put(enteredBloodType,currentvalue+units);
	             System.out.println("successfully updated the units " + enteredBloodType);
	        	}
	        }
	}
	

	
}


