package mypackage;
interface F1{
	void beach();
}
interface F2{
	void hills();
}
interface F3 extends F1,F2{
	void road();
}
class sunset {
	public void weather() {
		System.out.println("cool");
	}}
public class sample47 extends sunset{
	public void beach() {
		System.out.println("swim");
	}
	public void hill() {
		System.out.println("climb");
	}
	public void road() {
		System.out.println("walk");
	}
	public void air() {
		System.out.println("fly");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample47 r=new sample47();
		sunset e=new sunset();
		e.weather();
		r.beach();
		r.hill();
		r.road();
		r.air();
		

	}

}
