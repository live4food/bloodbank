package Menu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Blood {
	Scanner sc=new Scanner(System.in);
	 public Blood(){
		validBloodList.add("A+");
		validBloodList.add("A-");
		validBloodList.add("B+");
		validBloodList.add("B-");
		validBloodList.add("AB+");
		validBloodList.add("AB-");
		validBloodList.add("O+");
		validBloodList.add("O-");
	}
	
	public HashMap<String, PatientRequest> patientRequestHashMap =new HashMap<>();
	 
	public HashMap<String,Integer> bloodHashMap = new HashMap<>();
	
	public List<String> validBloodList = new ArrayList<String>();
	
	public void display() {
		for(String id: patientRequestHashMap.keySet()) {
			System.out.println(patientRequestHashMap.get(id));
		}
		
			
	}
}
