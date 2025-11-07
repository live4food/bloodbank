package Menu;
import Services.*;
import java.util.Scanner;

public class Menu {
	
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			Blood bloodObject = new Blood();
			RemoveBloodRecord removeObj=new RemoveBloodRecord();
			DisplayRecords displayObject =new DisplayRecords();
			AddBloodRecords addObj=new AddBloodRecords();
			Availablity availabilityObject=new Availablity();
			DispatchBloodRequest dispatchObject=new DispatchBloodRequest();
			
			RequestBlood req = new RequestBlood();
			Integer ch,dpch,bloodQuantity,patientId,patientQuantity;
			String exit="Y",bloodGroup,patientName,patientType;
			do {
				System.out.print("1.Doctor\n2.Patient\nChoice: ");
				dpch=sc.nextInt();
				if(dpch==1) {
					System.out.println("Enter Choice");
					System.out.println("1.\tAdd blood");
					System.out.println("2.\tRemove blood");
					System.out.println("3.\tDisplay All");
					System.out.println("4.\tAvailability");
					System.out.println("5.\tDisplay Requests");
					ch=sc.nextInt();
					switch(ch) {
							case 1:	System.out.println("Enter the blood group");
									bloodGroup= sc.next().toUpperCase();
									System.out.println("Enter the blood quantity");
									bloodQuantity = sc.nextInt();	
									addObj.add(bloodGroup,bloodQuantity,bloodObject.bloodHashMap);
								  
									break;
							case 2:	System.out.println("Enter the blood group");
									bloodGroup= sc.next().toUpperCase();
									System.out.println("Enter the blood quantity");
									bloodQuantity = sc.nextInt();
									removeObj.removeBlood(bloodGroup,bloodQuantity,bloodObject.bloodHashMap);
									break;
							case 3:	
								    displayObject.display(bloodObject.bloodHashMap);
									break;
							case 4:	
								    System.out.println("Which blood group do you want to check?");
									String bloodAvailable;
									bloodAvailable=sc.next().toUpperCase();
									availabilityObject.availability(bloodObject.validBloodList,bloodAvailable ,  bloodObject.bloodHashMap);
									break;
							case 5:	req.display();
									System.out.println("Dispatch all? (Y/N)");
									String value=sc.next();
									if(value.equals("Y")) {
										dispatchObject.dispatch(bloodObject.validBloodList,bloodObject.bloodHashMap,req.getdet());
									}
									break;
					}
				}
				else {
						System.out.println("Enter Choice");
						System.out.println("1.\tDisplay all");
						System.out.println("2.\tAvailability");
						System.out.println("3.\tRequest");
						ch=sc.nextInt();
						switch(ch) {
								case 1:
									displayObject.display(bloodObject.bloodHashMap);
										break;
								case 2:
									System.out.println("Which blood group do you want to check?(Blood group/All");
									String bloodAvailable;
									bloodAvailable=sc.next().toUpperCase();
									availabilityObject.availability(bloodObject.validBloodList,bloodAvailable ,  bloodObject.bloodHashMap);
			
										break;
								case 3:	System.out.println("Enter your name:");
										patientName=sc.next();
										System.out.println("Enter your id:");
										patientId=sc.nextInt();	
										System.out.println("Enter units:");
										patientQuantity=sc.nextInt();
										System.out.println("Enter your blood type:");
										patientType=sc.next().toUpperCase();
										
										PatientRequest req_p = new PatientRequest(patientName,patientType,patientQuantity);
										req.req(patientId.toString(),req_p);
										break;
								case 4:
										break;
					}
				}
				System.out.println("Do you want to Continue?(Y/N)");
				exit=sc.next().toUpperCase();
			}while(exit.equals("Y"));
	}
	catch(Exception e) {
		//	e.printStackTrace();
		System.out.println("Problem is : "+e);
	}
}
	
}




