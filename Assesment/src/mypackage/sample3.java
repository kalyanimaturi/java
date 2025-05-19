package mypackage;
interface I1{
	void tulip();
}
class flower{
	public void colour() {
		System.out.println("colourful");
	}
}
class rose extends flower implements I1{
	public void tulip() {
		System.out.println("blue petals");
	}
	public void lily() {
		System.out.println("white petals");
	}
}
public class sample3 extends rose{
	public void cost() {
		System.out.println("rs:200");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample3 s1=new sample3();
		s1.colour();
		s1.tulip();
		s1.lily();
		s1.cost();

	}

}

