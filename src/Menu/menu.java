package Menu;
import Services.*;
import java.util.Scanner;

public class menu {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Blood bloodObject = new Blood();
		remove removeobj=new remove();
		display_records displayObject =new display_records();
		add_records addobj=new add_records();
		avilablity avilobj=new avilablity();
		dispatchtherequest dispachobj=new dispatchtherequest();
		
		request req = new request();
		Integer ch,dpch,bloodQuantity,patientId,patientQuantity;
		String exit,bloodGroup,patientName,patientType;
		do {
			System.out.println("1.Doctor/2.Patient");
			dpch=sc.nextInt();
			if(dpch==1) {
				System.out.println("Enter Choice:");
				System.out.println("1.Add blood:");
				System.out.println("2.Remove blood:");
				System.out.println("3.Display All:");
				System.out.println("4.Availability:");
				System.out.println("5.Display Requests:");
				ch=sc.nextInt();
				switch(ch) {
						case 1:	System.out.println("Enter the blood group");
								bloodGroup= sc.next();
								System.out.println("Enter the blood quantity");
								bloodQuantity = sc.nextInt();	
								addobj.add(bloodGroup,bloodQuantity,bloodObject.blood);
							  
								break;
						case 2:	System.out.println("Enter the blood group");
								bloodGroup= sc.next();
								System.out.println("Enter the blood quantity");
								bloodQuantity = sc.nextInt();
								removeobj.removeBlood(bloodGroup,bloodQuantity,bloodObject.blood);
								break;
						case 3:	
							    displayObject.display(bloodObject.blood);
								break;
						case 4:	
							    System.out.println("Which blood group do you want to check?(Blood group/All");
								String bloodAvailable;
								bloodAvailable=sc.next();
								avilobj.availability(bloodObject.validBlood,bloodAvailable ,  bloodObject.blood);
								break;
						case 5:	req.display();
								System.out.println("want to dispatch all (Y/N)");
								String value=sc.next();
								if(value.equals("Y")) {
									dispachobj.dispatch(bloodObject.validBlood,bloodObject.blood,req.getdet());
								}
								else {
									System.out.println("Invalid blood type...");
								}
								break;
				}
			}
			else {
					System.out.println("Enter Choice:");
					System.out.println("1.Display all:");
					System.out.println("2.Availability:");
					System.out.println("3.Request:");
					ch=sc.nextInt();
					switch(ch) {
							case 1:
								displayObject.display(bloodObject.blood);
									break;
							case 2:
								System.out.println("Which blood group do you want to check?(Blood group/All");
								String bloodAvailable;
								bloodAvailable=sc.next();
								avilobj.availability(bloodObject.validBlood,bloodAvailable ,  bloodObject.blood);
		
									break;
							case 3:	System.out.println("Enter your name:");
									patientName=sc.next();
									System.out.println("Enter your id:");
									patientId=sc.nextInt();	
									System.out.println("Enter units:");
									patientQuantity=sc.nextInt();
									System.out.println("Enter your blood type:");
									patientType=sc.next();
									
									request_p req_p = new request_p(patientName,patientType,patientQuantity);
									req.req(patientId.toString(),req_p);
									break;
							case 4:
									break;
				}
			}
			System.out.println("Do you want to Continue?(Y/N)");
			exit=sc.next();
		}while(exit.equals("Y"));
	}
}




