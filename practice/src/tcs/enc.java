package tcs;

public class enc {
	private String firstName;
	private String lastName;
	private String email;
	private long phonenumber;
	public void setFirstName(String fn) {
		firstName=fn;
		
	}
	public void setLastName(String ln) {
		lastName=ln;
		
	}
	public void setEmail(String em) {
		email=em;
		}
	public void setPhonenumber(long pn) {
		phonenumber=pn;
		}
	
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public static void main(String[] args) {
		enc e=new enc();
		e.setFirstName("kalyani");
		e.setLastName("maturi");
		e.setEmail("kalyanimaturi20@gmail.com");
		e.setPhonenumber(9177578351l);
		System.out.println(e.getFirstName());
		System.out.println(e.getLastName());
		System.out.println(e.getEmail());
		System.out.println(e.getPhonenumber());
		
	}

}
