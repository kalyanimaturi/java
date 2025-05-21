package tcs;

public class day1 {
	int a=5,b=10;
	static int x=5,y=10;
	void and() {
		System.out.println((a<b)&&(a>b));}
	void or() {
		System.out.println((x>y)||(x<y));
	}
	void not() {
		int p=5,q=10;
		System.out.println(!(p<q));
	}
	
	
	public static void main(String[] args) {
		day1 d=new day1();
		d.and();
		d.or();
		d.not();
		
		
	}

}
