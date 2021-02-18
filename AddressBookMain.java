import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
	class Book {
		Scanner sc = new Scanner(System.in);
		String FIRST_NAME = " ";
		String LAST_NAME = " ";
		String CITY = " ";
		String STATE = " ";
		String ZIP_CODE = "  ";
		String PHONE_NO = "";
		String EMAIL = "";

		public Book(String first_name, String last_name, String city, String state, String zip_code, String phone_no,
			String email) {
		  super();
		  this.FIRST_NAME = first_name;
		  this.LAST_NAME = last_name;
		  this.CITY = city;
		  this.STATE = state;
		  this.ZIP_CODE = zip_code;
		  this.PHONE_NO = phone_no;
		  this.EMAIL = email;
		}

		public Scanner getSc() {
			return sc;
		}

		public void setSc(Scanner sc) {
			this.sc = sc;
		}

		public String getFirstname() {
			return FIRST_NAME;
		}

		public void setFirstname(String first_name) {
			this.FIRST_NAME = first_name;
		}

		public String getLastname() {
			return LAST_NAME;
		}

		public void setLastname(String last_name) {
			this.LAST_NAME = last_name;
		}

		public String getCity() {
			return CITY;
		}

		public void setCity(String city) {
			this.CITY = city;
		}

		public String getState() {
			return STATE;
		}

		public void setState(String state) {
			this.STATE = state;
		}

		public String getZip_code() {
			return ZIP_CODE;
		}

		public void setZip_code(String zip_code) {
			this.ZIP_CODE = zip_code;
		}

		public String getPhone_no() {
			return PHONE_NO;
		}

		public void setPhone_no(String phone_no) {
			this.PHONE_NO = phone_no;
		}

		public String getEmail() {
			return EMAIL;
		}

		public void setEmail(String email) {
			this.EMAIL = email;
		}

		public String toString() {
			return "Book [ first_name=" + FIRST_NAME + ", last_name=" + LAST_NAME + ", city=" + CITY + ", state=" + STATE
					+ ", zip_code=" + ZIP_CODE + ", phone_no=" + PHONE_NO + ", email=" + EMAIL + "]";
		}
	}

	public class AddressBookMain
	{
		public static void main(String[] args)
		{
		  Map<Integer, Book> store = new Hashtable<Integer, Book>();
		  Book b11 = new Book("NK", "gandi nagar", "puttur", "TN", "600001", "709****907", "NK@gmail.com");
		  Book b12 = new Book("KN", "chitra nagar", "chennai", "AP", "517581", "875****537", "KN@gmail.com");
		  store.put(2, b12);
		  store.put(1, b11);
		  for (Map.Entry<Integer, Book> e1 : store.entrySet()) {
			int key = e1.getKey();
			Book b = e1.getValue();
			System.out.println(key + " contact details are:");
			System.out.println( b.FIRST_NAME + " " + b.LAST_NAME + " " + b.CITY + " " + b.STATE + " " + b.ZIP_CODE
					+ " " + b.PHONE_NO + " " + b.EMAIL + " ");
		}
	}
}
