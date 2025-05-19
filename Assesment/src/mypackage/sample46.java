package mypackage;
interface E1{
	void bank();
}
class bk{
	void passbook() {
		System.out.println("details");
}
}
class bk1 extends bk implements E1{
	public void check() {
		System.out.println("cash");
	}
	public void request() {
			System.out.println("problems");
	}
}
class bk2{
	public void loan() {
		System.out.println("apply");
	}
}
public class sample46 extends bk2{
	public void receive() {
		System.out.println("form");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample46 f=new sample46();
		bk1 b=new bk1();
		f.receive();
		f.loan();
		b.passbook();
		b.check();
		b.request();
		
		

	}

}
