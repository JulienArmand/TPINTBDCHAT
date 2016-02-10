import java.io.Serializable;

public class Person implements Serializable{
	private String firstName;
	private String lastName;
	transient private Thread myThread;
	public Person(String first, String last){
		this.firstName = first;
		this.lastName = last;
		this.myThread = new Thread();
	}
	
	public String getFirstName(){ return firstName;}
	public void setFirstName(String first){this.firstName = first;}
	public String getLastName(){ return lastName;}
	public void setLastName(String last){this.lastName = last;}
	public String toString(){
		return "Person [firstName=" + firstName + ", lastname=" + lastName+"]";
	}
}
