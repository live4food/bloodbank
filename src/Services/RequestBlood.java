package Services;
import java.util.HashMap;

import Menu.*;

public class RequestBlood {
	Blood bloodObject = new Blood();
	public void req(String patientId, PatientRequest obj) {
		bloodObject.patientRequestHashMap.put(patientId,obj);
		}
	public void display() {
		bloodObject.display();
	}
	public HashMap<String, PatientRequest> getdet() {
		return bloodObject.patientRequestHashMap;
	}
}