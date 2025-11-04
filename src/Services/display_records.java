package Services;
import Menu.*;

import java.util.HashMap;

public class display_records {
	public void display(HashMap<String,Integer> map) {
		for(String key:map.keySet()) {
			System.out.println("Blood group = "+key+" unit = "+map.get(key)+"\n");
		}
	}

}
