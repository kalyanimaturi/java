package tcs;
class flower{
	void tulip() {
		System.out.println("smell");
		}
}
class rose extends flower{
	void red() {
		System.out.println("glam");
	}
}
class lilly extends rose{
	void white() {
		System.out.println("glimpse");
	}
}
class culpa extends rose{
	void blue() {
		System.out.println("tuya");
	}
}

public class hybrid {

	public static void main(String[] args) {
		lilly l=new lilly();
		culpa c=new culpa();
		l.tulip();
		c.red();
		l.white();
		c.blue();
		
		
		}

	}

