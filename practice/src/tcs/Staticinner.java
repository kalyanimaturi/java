package tcs;
class inner {
	private static void show() {
		System.out.println("start");
	}
	static class Test4{
		static void print() {
			System.out.println("stop");
			show();
		}
	}
}
public class Staticinner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inner.Test4.print();
		
	}

}
