package mypackage;
interface I1{
	void near();
}
interface I2{
	void far();
}
interface I3{
	void react();
}
interface I4 extends I1,I2,I3{
	void problem();
}
public class sample48 implements I4{
	public void near() {
		System.out.println("starting");
	}
	public void far() {
		System.out.println("stopping");
	}
	public void react() {
		System.out.println("waiting");
	}
	public void go() {
		System.out.println("going");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample48 d=new sample48();
		d.near();
		d.far();
		d.react();
		d.go();

	}

}
