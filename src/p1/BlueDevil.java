package p1;

public class BlueDevil extends Person<String> {
	public String Experience;
	public String Hobby;
	public BlueDevil(String fn1, String ln1, String c1, String s1, String ep1, String h1) {
		super(fn1, ln1, c1, s1);
		Experience = ep1;
		Hobby = h1;
	}
	public void printString(boolean value) {
		if(value) {
			System.out.println(this.FirstName + " " + this.LastName +" is from " + this.Country + " and is a " + this.Status + ".");
			System.out.println(Experience + " ");
			System.out.println("When not in class, " + Hobby + "\n");
		}
		//else {
	//		System.out.println("Sorry! We cannot find that person!");
	//	}
	}
}