package p1;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonManageSystem {
	private static String fN;
	private static String lN;
	private static Scanner sc;
	private static ArrayList<BlueDevil> PersonList = new ArrayList<BlueDevil>();
	private static void init() {
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
	public static void main(String[] args) {
		init();
		while(true) {
			int j = 0;
			sc = new Scanner(System.in);
			sc.useDelimiter("/n");
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
	}
}
