import java.util.*;

public class AddressBookMain {
	public String FIRST_NAME;
	public String LAST_NAME;
	public String ADDRESS;
	public String CITY;
	public String STATE;
	public double ZIP_CODE;
	public double PHONE_NUMBER;
	public String EMAIL;
	public int NO_OF_CONTACTS;
	public String Address_Book_Name;
	Map<String, List<AddressBook>> mapper = new HashMap<>();

	Scanner sc = new Scanner(System.in);
	public int contacts_No;
	boolean found_Not_Found;
	int flag;

	public AddressBook(String last_Name, String first_Name, String address, String city, String state,
			double phone_Number, double zip_Code, String email) {
		this.FIRST_NAME = first_Name;
		this.LAST_NAME = last_Name;
		this.ADDRESS = address;
		this.CITY = city;
		this.STATE = state;
		this.ZIP_CODE = zip_Code;
		this.PHONE_NUMBER = phone_Number;
		this.EMAIL = email;
	}
	public AddressBookMain() {
	}

	public void add_Address_Book() {
		System.out.println("Enter Address Book Name \n");
		String Address_Book_Name_test = sc.next();
		try {
		for (String s : mapper.keySet()) {
			System.out.println("Keys " + s);
			if (s.equals(Address_Book_Name_test)) {
				  System.out.println("Already exsists \n");
			} else {
				  Address_Book_Name = Address_Book_Name_test;
			}
		}
		}
		catch (NullPointerException e) {
			System.out.println("No address books yet");
		}
	}

	public void add() {
		System.out.println("Enter Address Book Name ");
		List<AddressBook> address_Book_No = new ArrayList<>();
		Address_Book_Name = sc.next();
		System.out.println("Enter Number of Contacts ");
		NO_OF_CONTACTS = sc.nextInt();
		for (int i = 0; i < NO_OF_CONTACTS; i++) {
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
			Double phone_Number = sc.nextDouble();
			System.out.println("Enter Zip Name ");
			Double zip_Code = sc.nextDouble();
			address_Book_No.add(new AddressBook(last_Name, first_Name, address, city, state, phone_Number,
								zip_Code, email));
			contacts_No++;
		}
		mapper.put(Address_Book_Name, address_Book_No);
	}

	public void entry() {
		System.out.println("Enter address book name \n");
		String address_Book = sc.next();
		for (String s : mapper.keySet()) {
			System.out.println("Keys " + s);
			if (s.equals(address_Book)) {
				flag = 0;
				System.out.println("Current AddressBook: " + s);
				for (AddressBook r : mapper.get(s)) {
					r.entry1();
				}
			}
		}
		if (flag == 1) {
			System.out.println("Address Book not found");
		}
	}

	public void entry1() {
		System.out.println("First Name :" + FIRST_NAME);
		System.out.println("Last Name :" + LAST_NAME);
		System.out.println("ADDRESS :" + ADDRESS);
		System.out.println("CITY :" + CITY);
		System.out.println("STATE :" + STATE);
		System.out.println("ZIP :" + ZIP_CODE);
		System.out.println("PHONE :" + PHONE_NUMBER);
		System.out.println("EMAIL  :" + EMAIL);

	}

	public void edit() {

		System.out.println("Enter Address Book Name \n");
		String Address_Book_Name_test = sc.next();
		System.out.println("Enter Name of the contact you want to edit \n");
		String last_Name_Edit = sc.next();
		for (String s : mapper.keySet()) {
		if (s.equals(Address_Book_Name_test)) {
			System.out.println("Current key: " + s);
			for (AddressBook r : mapper.get(s)) {
				found_Not_Found = r.LAST_NAME.equals(last_Name_Edit);
				if (found_Not_Found == true) {
					System.out.println("Enter name you want edit 1.first_name 2.last_name 3. address"
									+ " 4. city 5.state 6. email 7. phone number  8. zip ");
					int option = sc.nextInt();
					System.out.println("Enter new details \n");
					switch (option) {
					case 1:
						System.out.println("Enter first Name \n");
						String first_Name = sc.next();
						r.FIRST_NAME = first_Name;
						break;
					case 3:
						System.out.println("Enter Address Lane \n");
						String address = sc.next();
						r.ADDRESS = address;
						break;
					case 4:
						System.out.println("Enter City \n");
						String city = sc.next();
						r.CITY = city;
						break;
					case 5:
						System.out.println("Enter state \n");
						String state = sc.next();
						r.STATE = state;
						break;
					case 6:
						System.out.println("Enter Email \n");
						String email = sc.next();
						r.EMAIL = email;
						break;
					case 7:
						System.out.println("Enter Phone Number \n");
						Double phone_Number = sc.nextDouble();
						r.PHONE_NUMBER = phone_Number;
						break;
					case 8:
						System.out.println("Enter Zip Name \n");
						Double zip_Code = sc.nextDouble();
						r.ZIP_CODE = zip_Code;
						break;
					case 2:
						System.out.println("Enter Last Name \n");
						String last_Name = sc.next();
						r.LAST_NAME = last_Name;
						break;
					default:
						System.out.println("Invalid option");
						break;
					}
				}
			}
			}
			else {
				System.out.println("Address book not fond");
			}
		}
	}

	public void delete() {
		System.out.println("Enter Address Book Name \n");
		String Address_Book_Name_test = sc.next();
		System.out.println("Enter Name of the contact you want to edit \n");
		String last_Name_Edit = sc.next();
		for (Map.Entry<String, List<AddressBook>> entry : mapper.entrySet()) {
			String key = entry.getKey();
			if (key.equals(Address_Book_Name_test)) {
				List<AddressBook> list = entry.getValue();
				for (int i = 0; i < list.size(); i++) {
					AddressBook we = list.get(i);
					found_Not_Found = we.LAST_NAME.equals(last_Name_Edit);
					System.out.println(found_Not_Found);
					if (found_Not_Found == true) {
						list.remove(we);
					}
				}
			}
			else {
				System.out.println("AddressBookNotffoundd");
			}

		}

	}

	public static void main(String Args[]) {
		AddressBook m = new AddressBook();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter your option \n 1.Add \n 2.Edit \n 3.Delete \n 4.Display \n 5.Add Address Boook \n");
			int option = sc.nextInt();
			switch (option) {
			case 1:
			       	m.add();
				break;
			case 2:
				m.edit();
				break;
			case 3:
				m.delete();
				break;
			case 4:
				m.entry();
				break;
			case 5:
				m.add_Address_Book();
				break;
			case 0:
				break;
			}
		}
	}
}
