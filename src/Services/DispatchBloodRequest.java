package Services;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Menu.*;

public class DispatchBloodRequest {
	public void dispatch(List<String> validBlood,HashMap<String,Integer> blood,HashMap<String, PatientRequest> request_M) {
        List<String> toRemove = new ArrayList<>();
		for(String id:request_M.keySet()) {
			if(blood.containsKey(request_M.get(id).bloodtpy)) {
				String name=request_M.get(id).name_p;
				if(request_M.get(id).quantity<=blood.get(request_M.get(id).bloodtpy)) {
					int a;
					System.out.println("Blood successfully dispatched for "+name);
					a=blood.get(request_M.get(id).bloodtpy);
					a-=(int)(request_M.get(id).quantity);
					blood.put(request_M.get(id).bloodtpy, a);
					//request_M.remove(id);
                    toRemove.add(id);
				}
				else {
					System.out.println("Not enough blood for "+name);
				}
			}
			else {
				System.out.println("Blood is not available");
			}
     	}
        for(String id:toRemove){
            request_M.remove(id);
        }
	}
}
