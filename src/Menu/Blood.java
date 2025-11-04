package Menu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Blood {
	Scanner sc=new Scanner(System.in);
	 public Blood(){
		validBlood.add("A+");
		validBlood.add("A-");
		validBlood.add("B+");
		validBlood.add("B-");
		validBlood.add("AB+");
		validBlood.add("AB-");
		validBlood.add("O+");
		validBlood.add("O-");
	}
	
	public HashMap<String,patientRequest> request_M=new HashMap<>();
	 
	public HashMap<String,Integer> blood = new HashMap<>();
	
	public List<String> validBlood= new ArrayList<String>();
	
	public void display() {
		for(String id:request_M.keySet()) {
			System.out.println(request_M.get(id));
		}
		
			
	}
}
