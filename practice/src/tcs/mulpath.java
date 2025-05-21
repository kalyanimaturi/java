package tcs;
class fruits{
	void benifits() {
		System.out.println("healthy");
	}
}
class mango extends fruits{
	void price() {
		System.out.println("100 kg");
	}
}
class banana extends fruits{
	void shake() {
		System.out.println("chill");
	}
}
class apple extends fruits{
	void doctor() {
		System.out.println("apple a day");
	}
}
public class mulpath {

	public static void main(String[] args) {
		mango m=new mango();
		banana b=new banana();
		apple a=new apple();
		a.benifits();
		m.price();
		b.shake();
		b.benifits();
		a.doctor();
		
	}

}
