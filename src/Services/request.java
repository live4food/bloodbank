package Services;
import Menu.*;

public class request {
	Blood bloodObject = new Blood();
	public void req(String patientId,request_p obj) {
		bloodObject.request_M.put(patientId,obj);
		}
	public void display() {
		// TODO Auto-generated method stub
		bloodObject.display();
	}
}