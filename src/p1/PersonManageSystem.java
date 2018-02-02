package p1;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonManageSystem {
	//private static String fN;
	//private static String lN;
	private static Scanner sc;
	private static ArrayList<BlueDevil> PersonList = new ArrayList<BlueDevil>();
	public static void init() {
		PersonList.add(new BlueDevil(
				"Ric", //first Name
				"Telford",   // Last Name
				"San Antonio, TX", //country or region
				"Executive-in-Residence and Adjunct Assoc. Professor, and Director in DUhatch Business Incubator and Duke Center for Mobile Development",
				//status
				"Telford retired from IBM as Vice President, Cloud Strategy and now is the Founder of Telford Ventures, focusing on startups.", // Experience
				"Telford enjoys golf, sand volleyball, swimming and biking.")); //hobbies
		PersonList.add(new BlueDevil(
				"Anil", 
				"Ganti",  
				"NJ, spent time in CO, CA, WA",
				"Phd ECE candidate",
				"Ganti worked for a few software startups.",
				"Ganti enjoys climbing."));
		PersonList.add(new BlueDevil(
				"Shalin", 
				"Shah", 
				"India", 
				"PhD ECE candidate",
				"Shah was an undergrad from DA-IICT.", 
				"Shah enjoys bodybuilding and dancing."));
		PersonList.add(new BlueDevil(
				"Niral", 
				"Shal", 
				"NJ", 
				"MEng ECE student", 
				"Shal was an undergrad at Rutgers University.", 
				"Shal enjoys playing tennis and reading the news."));
		PersonList.add(new BlueDevil("Siyue", 
				"Zhou", 
				"China", 
				"master's student", 
				"Zhou graduated from Beijing University of Posts and Telecommunications.", 
				"Zhou enjoys swimming, and listening to classical music."));
	}
	public static void searchList() {
		int j = 0;
		String fN, lN;
		sc = new Scanner(System.in);
		sc.useDelimiter("/n");
		System.out.println("\n" + "Searching mode:");
		System.out.println("Please input the first name: ");
		fN = sc.nextLine();
		System.out.println("Please input the last name: "); 
		lN = sc.nextLine();
		while(j < PersonList.size()) {
			BlueDevil i = PersonList.get(j);
			if(i.find(fN, lN)) {
				i.printString(i.find(fN, lN));
				break;
			}
			else {
				j++;
			}
		}
		if(j == PersonList.size()) {
			System.out.println("Sorry! We cannot find " + lN + " "+ fN + "!\n");
		}
	}
	public static void add2List() {
		String fn, ln, country, stu2pro, experience, hobbies;
		sc = new Scanner(System.in);
		sc.useDelimiter("/n");
		System.out.println("\n" + "Adding mode:");
		System.out.println("first name:");
		fn = sc.nextLine();
		System.out.println("last name: ");
		ln = sc.nextLine();
		System.out.println("Country: ");
		country =sc.nextLine();
		System.out.println("Student or professor? (i.e. associate professor)");
		stu2pro =sc.nextLine();
		System.out.println("Describe his or her experience: (i.e. He worked as an software engineer for 3 years.)");
		experience = sc.nextLine();
		System.out.println("Describe his or her hobbies: (i.e. He likes swimming.)");
		hobbies =sc.nextLine();
		BlueDevil addPerson = new BlueDevil(fn, ln, country,stu2pro, experience, hobbies);
		PersonList.add(addPerson);
	}
	public static void main(String[] args) {
		init();
		sc = new Scanner(System.in);
		sc.useDelimiter("/n");
		while(true) {
			String choice;
			System.out.println("Welcome! Please select the mode: Press 1 for searching and Press 2 for adding "
					+ "and Press 3 for exit.");
			choice = sc.nextLine();
			if(choice.equals("1")) {
				searchList();
			}
			else if(choice.equals("2")) {
				add2List();
			}
			else if(choice.equals("3")) {
				System.out.println("Good bye!");
				break;
			}
			else {
				System.out.println("Usage: please press any number from 1 to 3.");
			}
		}
	}
}
