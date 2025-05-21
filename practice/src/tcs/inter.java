package tcs;
interface I1{
	abstract void add();
		void sub();
	}

public class inter implements I1 {
	public void add() {
		System.out.println("good");
	}
	public void sub() {
		System.out.println("afternoon");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inter t1=new inter();
		t1.add();
		t1.sub();
	}

}
