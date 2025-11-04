package Services;
import java.util.HashMap;
import java.util.List;

import Menu.*;

public class dispatchtherequest {
	//request_p obj=new request_p(null, null, 0);
	public void dispatch(List<String> validBlood,HashMap<String,Integer> blood,HashMap<String,request_p> request_M) {
		System.out.println("Not avilable now...");
		for(String id:request_M.keySet()) {
     	if(validBlood.contains(request_M.get(id).bloodtpy)) {
			System.out.println(blood.get(id).toString()+" "+request_M.get(id).quantity);
			if(blood.containsKey(request_M.get(id).bloodtpy) ) {
				
				if(blood.get(id) >= request_M.get(id).quantity) {
					request_M.remove(id);
					blood.put(id, blood.get(id)-request_M.get(id).quantity);
					System.out.println("dispatched ");
				}
				else {
					System.out.println("low Quantity");
				}
			}
			else {
				System.out.println("Not avilable now...");
			}
			
}
		}}}
