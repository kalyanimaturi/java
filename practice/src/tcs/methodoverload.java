package tcs;

public class methodoverload {
	void show() {
		System.out.println("good mng");
	}
	void show(int a,int b) {
		System.out.println(a+b);
	}
	void show(double d1,double d2) {
		System.out.println(d1-d2);
	}
	void show(String s1,String s2) {
		System.out.println(s1+s2);
	}

	public static void main(String[] args) {
		methodoverload m=new methodoverload();
		m.show();
		m.show(10,4);
		m.show(10.5,5.0);
		m.show("maturi","kalyani");

	}

}
