package tcs;

public class cs {
	int x;
	int y;
	int z;
	public cs() {
		System.out.println("welcome to my profile");
	}
	public cs(int x) {
		this.x=x;
		System.out.println("x marks:"+x);
	}
	public cs(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.println("x marks:"+x+",y marks:"+y);
	}
	public cs(int x,int y,int z) {
		this.x=x;
		this.y=y;
		this.z=z;
		System.out.println("x marks:"+x+",y marks:"+y+",z marks:"+z);
	}
	public static void main(String[] args) {
		cs t1=new cs();
		cs t2=new cs(100);
		cs t3=new cs(100,72);
		cs t4=new cs(100,72,77);
	}

}
