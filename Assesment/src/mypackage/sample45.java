package mypackage;
interface I1{
	void mean();
}
interface I2{
	void mode();
}
interface I3{
	void median();
}
class start implements I1,I2,I3 {
	public void mean() {
		System.out.println("normal");
	}
	public void mode() {
		System.out.println("least");
	}
	public void median() {
		System.out.println("supreme");
	
	}
	
	public void basic() {
		System.out.println("simple");
	}}
public class sample45 extends start {
	public void worst() {
		System.out.println("case");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample45 w=new sample45();
		start s=new start();
		s.mean();
		s.mode();
		s.median();
		s.basic();
		w.worst();

	}

}
