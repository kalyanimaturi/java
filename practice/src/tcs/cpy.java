package tcs;

public class cpy {
	int x;
	int y;
	public cpy(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.println(x+y);
	}
	public cpy(cpy t1) {
		this.x=t1.x;
		this.y=t1.y;
		System.out.println(x-y);
	}

	public static void main(String[] args) {
		
		cpy t1=new cpy(45,23);
		cpy t2=new cpy(t1); 
	}

}
