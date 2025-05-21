package tcs;
class bike {
	void speed() {
		System.out.println("250 km per hour");
	}
	
}
class bmw extends bike{
	void rev() {
		System.out.println("1000cc");
	}
}
class model extends bmw{
	void price() {
		System.out.println("just 30 lakhs");
	}
}
public class mul {

	public static void main(String[] args) {
		model a=new model();
		a.speed();
		a.rev();
		a.price();
			
		

	}

}
