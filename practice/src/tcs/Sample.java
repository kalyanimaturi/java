package tcs;

public class Sample {
	int a=5,b=10;
	static int p=5,q=10;
	void mod() {
		System.out.println(a%b);
	}
	void mul() {
		System.out.println(p*q);
	}
    void div() {
    	int x=5,y=10;
    	System.out.println(a/b);
    }
	public static void main(String[] args) {
		Sample t1=new Sample();
		t1.mod();
		t1.mul();
		t1.div();
		

	}

}
