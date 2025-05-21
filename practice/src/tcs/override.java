package tcs;
class test{
	void add() {
			System.out.println("hi");
	}
}
public class override extends test{
	void add() {
		System.out.println("hlo");
	}
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		override r=new override();
		r.add();
		
		}
	}

