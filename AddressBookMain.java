import java.util.Scanner;

public class AddressBookMain {
	public String FIRST_NAME;
	public String LAST_NAME;
	public String ADDRESS;
	public String CITY;
	public String STATE;
	public String ZIP_CODE;
	public String PHONE_NUMBER;
	public String EMAIL;
	public static int NO_OF_CONTACTS = 0;

	public AddressBook(String last_Name, String first_Name, String address, String city, String state,
			String phone_Number, String zip_Code, String email) {
		this.FIRST_NAME = first_Name;
		this.LAST_NAME = last_Name;
		this.ADDRESS = address;
		this.CITY = city;
		this.STATE = state;
		this.ZIP_CODE = zip_Code;
		this.PHONE_NUMBER = phone_Number;
		this.EMAIL = email;
	}

	public void entry() {
		System.out.println("First Name :" + FIRST_NAME);
		System.out.println("Last Name :" + LAST_NAME);
		System.out.println("ADDRESS :" + ADDRESS);
		System.out.println("CITY :" + CITY);
		System.out.println("STATE :" + STATE);
		System.out.println("ZIP :" + ZIP_CODE);
		System.out.println("PHONE :" + PHONE_NUMBER);
		System.out.println("EMAIL  :" + EMAIL);
	}

	public static void main(String Args[]) {
    	       Scanner sc = new Scanner(System.in);
               AddressBook contact[] = new AddressBook[10];
    	       System.out.println("Weclome to Address Book \n");
    	while (true) {
    	       System.out.println("Select an option \n 1.Add \n 2.Edit \n 3.Delete");
    	       int option = sc.nextInt();
    	       switch (option) {
    	       case 1:
    			System.out.println("Enter Number of Contacts \n");
    			NO_OF_CONTACTS = sc.nextInt();
    			for (int i = 0; i < NO_OF_CONTACTS; i++) {
    			System.out.println("Enter first Name ");
    			String first_Name = sc.next();
    			System.out.println("Enter last Name ");
    			String last_Name = sc.next();
    			System.out.println("Enter Address Lane ");
    			String address = sc.next();
    			System.out.println("Enter City ");
    			String city = sc.next();
    			System.out.println("Enter state ");
    			String state = sc.next();
    			System.out.println("Enter Email ");
    			String email = sc.next();
    			System.out.println("Enter Phone Number ");
    			String phone_Number = sc.next();
    			System.out.println("Enter Zip Name ");
    			String zip_Code = sc.next();
    			contact[i] = new AddressBook(last_Name, first_Name, address, city, state, phone_Number, zip_Code,
    							email);
    		}
    			break;
    		case 2:
    			System.out.println("Enter Name of the contact you want to edit \n");
    			String last_Name_Edit = sc.next();
    			for (int j = 0; j < NO_OF_CONTACTS; j++) {
    			boolean found_Not_Found = contact[j].LAST_NAME.equals(last_Name_Edit);
    			if (found_Not_Found == true) {
    				System.out.println("Enter new contact details ");
    				System.out.println("Enter first Name ");
    				String first_Name = sc.next();
    				System.out.println("Enter Last Name ");
    				String last_Name = sc.next();
    				System.out.println("Enter Address Lane ");
    				String address = sc.next();
    				System.out.println("Enter City ");
    				String city = sc.next();
    				System.out.println("Enter state ");
    				String state = sc.next();
    				System.out.println("Enter Email ");
    				String email = sc.next();
    				System.out.println("Enter Phone Number ");
    				String phone_Number = sc.next();
    				System.out.println("Enter Zip Name ");
    				String zip_Code = sc.next();
    				contact[j] = new AddressBook(last_Name, first_Name, address, city, state, phone_Number,
    						zip_Code, email);
    				}
    			}
    			break;
    		case 3:
    			System.out.println("Enter Name of the contact you want to delete \n");
    			String last_Name_Delete = sc.next();
    			AddressBook contact_Final[] = new AddressBook[10];
    			for (int k = 0, s = 0; k < NO_OF_CONTACTS; k++) {
    				boolean found_Not_Found = contact[k].LAST_NAME.equals(last_Name_Delete);
    				if (found_Not_Found == true) {
    					continue;
    				}
    				contact_Final[s++] = contact[k];
    			}
    			try {
    				for (int k = 0; k < NO_OF_CONTACTS; k++) {
   					contact_Final[k].entry();
   					}
   				} catch (NullPointerException e) {
   					System.out.println("End of Contacts");
   				}
    			break;
    		case 4:
    			for (int k = 0; k < NO_OF_CONTACTS; k++) {
    				contact[k].entry();
    			}
    			break;
    		}
    	}
   	}
}
