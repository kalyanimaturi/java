package tcs;
class Test1{
	final void show() {
		System.out.println("hi");
}}
public class ex extends Test1{
	 void show() {
		int a=23;
		System.out.println(a);
		a=34;
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex w=new ex();
		w.show();

	}

}
