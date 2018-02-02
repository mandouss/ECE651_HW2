package p1;

public class Person <T>{
	public T FirstName;
	public T LastName;
	public T Country;
	public T Status;
	public Person() {
		super();
	}
	public Person(T fn1, T ln1, T c1, T s1) {
		FirstName = fn1;
		LastName = ln1;
		Country = c1;
		Status = s1;
	}
	public Boolean find(String fn, String ln) {
		if(this.FirstName.equals(fn) && this.LastName.equals(ln)) {
			return true;
		}
		else {
			return false;
		}
	}
}
