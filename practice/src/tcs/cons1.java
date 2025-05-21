package tcs;

public class cons1 {
	int a=40;
	int b=30;
	public cons1(int x,int y) {
		a=x;
		b=y;
		System.out.println(x+y);
	}

	public void add() {
		System.out.println(this.a-this.b);
	}
	public static void main(String[] args) {
		cons1 c=new cons1(40,30);
		c.add();
	}

}
