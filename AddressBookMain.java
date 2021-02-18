import java.util.Scanner;
public class AddressBookMain {
    Scanner s = new Scanner(System.in);
    class Entry{
        private String FIrst_NAME;
	private String LAST_NAME;
	private String ADDRESS;
	private String PHONE_NO;
	private String ZIP_CODE;
	private String EMAIL;
	Entry(String FIrst_NAME, String LAST_NAME, String ADDRESS, String PHONE_NO, String ZIP_CODE, String EMAIL){
            this.FIrst_NAME = FIrst_NAME;
	    this.LAST_NAME = LAST_NAME;
	    this.ADDRESS = ADDRESS;
	    this.PHONE_NO = PHONE_NO;
            this.ZIP_CODE = ZIP_CODE;
	    this.EMAIL = EMAIL;
        }
        Entry(){
        	  FIrst_NAME = "";
        	  LAST_NAME = "";
        	  ADDRESS = "";
        	  PHONE_NO = "";
        	  ZIP_CODE = "";
        	  EMAIL = "";
	}
	public void readEntry(){
	    System.out.println("First Name:"+FIrst_NAME );
	    System.out.println("Last Name:"+LAST_NAME );
	    System.out.println("Address:"+ADDRESS );
	    System.out.println("Phone_no:"+PHONE_NO );
            System.out.println("Zip_code:"+ZIP_CODE );
            System.out.println("Email:"+EMAIL );
	}
	}
          private int entries = 0;
          Entry[] contents;

        public void initEntries(int e){
          contents = new Entry[e];
        for (int i = 0;i<contents.length;i++){
          contents[i] = new Entry();
        }
    }

    public int getEntries(){
        return contents.length;
    }

    public void add(String FIRST_NAME, String LAST_NAME, String ADDRESS, String PHONE_NO, String ZIP_CODE, String EMAIL){
        if (entries<contents.length){
            contents[entries] = new Entry(FIRST_NAME, LAST_NAME, ADDRESS, PHONE_NO, ZIP_CODE, EMAIL);
            entries++;
        }
        else
            System.out.println("Error: book is full");
        }

        public static void main(String[] args)
        {
            Scanner s = new Scanner(System.in);
            System.out.print("How many books do you want to create? ");
            int howManyBooks;
            int howManyEntries;

            AddressBookMain[] library = new AddressBookMain[0];


            while(true){
                howManyBooks = s.nextInt();
                if (howManyBooks>0){
                    library = new AddressBookMain[howManyBooks];
                    break;
                }
                else
                    System.out.print("You must create at least 1 book.");
                }



            for (int i=0;i<library.length;i++){

                library[i] = new AddressBookMain();

                while(true){
                    System.out.print("How many entries in book "+i+"? ");
                    howManyEntries = s.nextInt();
                    if (howManyEntries>0) {
                        library[i].initEntries(howManyEntries);
                        break;
                    }
                    else
                        System.out.println("You must create at least 1 Entry.");
                    }
            }
              boolean done = false;
              int selectedBook = 0;
              int selection;
            while (done==false){
                System.out.println("Book "+selectedBook+" is currently selected.");

                for (int i = 0;i<library[selectedBook].getEntries();i++){
                    System.out.println("===========Entry "+i+" ===========");
                    library[selectedBook].contents[i].readEntry();
                    System.out.println("================================");
                }


                    System.out.println("Select an option!");
                    System.out.println("1. Add an entry");
                    selection = s.nextInt();
                    String FIRST_NAME, LAST_NAME, ADDRESS, PHONE_NO, ZIP_CODE, EMAIL;
                switch(selection){
                case 1: 
                    System.out.print("First name? ");
                    FIRST_NAME = s.next();
                    System.out.print("Last name? ");
                    LAST_NAME = s.next();
                    System.out.print("Address? ");
                    ADDRESS = s.next();
                    System.out.print("Phone_no? ");
                    PHONE_NO = s.next();
                    System.out.print("Zip_code? ");
                    ZIP_CODE = s.next();
                    System.out.print("Email? ");
                    EMAIL = s.next();
                    library[selectedBook].add(FIRST_NAME, LAST_NAME, ADDRESS, PHONE_NO, ZIP_CODE, EMAIL);
                    break;
                case 2:
                    done = true;
                    break;
                default:
                    System.out.print("Please choose a valid menu number");


                }

            }
        }
}
