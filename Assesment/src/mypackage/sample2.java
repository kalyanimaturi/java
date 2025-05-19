package mypackage;
interface I1{
	void flow(); 
}
interface I2 extends I1{
	void run();
}

class demo implements I2 {
	public void run() {
		System.out.println("running");
	}
	public void fly() {
		System.out.println("flying");
	}
	public void flow() {
		System.out.println("flowing");
	}}
public class sample2 implements I2{
	public void run() {
		System.out.println("running");
	}
	public void drop() {
		System.out.println("dropping");
	}
	public void flow() {
		System.out.println("flowing");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample2 s=new sample2();
		demo s2=new demo();
		s2.run();
		s2.fly();
		s2.flow();
		s.drop();	
	}
	}



