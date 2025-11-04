package Services;
import java.util.HashMap;

import Menu.*;

public class request {
	Blood bloodObject = new Blood();
	public void req(String patientId,patientRequest obj) {
		bloodObject.request_M.put(patientId,obj);
		}
	public void display() {
		// TODO Auto-generated method stub
		bloodObject.display();
	}
	public HashMap<String,patientRequest> getdet() {
		return bloodObject.request_M;
	}
}