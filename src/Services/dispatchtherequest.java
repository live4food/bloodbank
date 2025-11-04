package Services;
import java.util.HashMap;
import java.util.List;

import Menu.*;

public class dispatchtherequest {
	public void dispatch(List<String> validBlood,HashMap<String,Integer> blood,HashMap<String,request_p> request_M) {
		System.out.println(request_M+"/n"+validBlood+"/n"+blood);
		for(String id:request_M.keySet()) {
			if(blood.containsKey(request_M.get(id).bloodtpy)) {
				if(request_M.get(id).quantity<=blood.get(request_M.get(id).bloodtpy)) {
					int a;
					a=blood.get(request_M.get(id).bloodtpy);
					a-=(int)(request_M.get(id).quantity);
					blood.put(request_M.get(id).bloodtpy, a);
					request_M.remove(id);
					System.out.println("Blood successfully dispatched");
				}
				else {
					System.out.println("Not enough blood");
				}
			}
			else {
				System.out.println("Blood is not available");
			}
     	}
	}
}
