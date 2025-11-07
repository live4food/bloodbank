package Menu;

public class PatientRequest {
	public String name_p;
	public String bloodtpy;
	public int quantity;
	public PatientRequest(String name, String blood, int quantity){
		this.name_p=name;
		this.bloodtpy=blood;
		this.quantity=quantity;
		
	}
	@Override
	public String toString() {
		return "Patient name : "+name_p+" blood type : "+bloodtpy+" quantity : "+quantity;
	}
	
}