package mypackage;
interface H1{
	void summer();
}
interface H2{
	void winter();
}
interface H3{
	void rainy();
}
interface H4{
	void spring();
}

class seasons implements H1,H2,H3{
	public void summer(){
		System.out.println("sweat");
	}
	public void winter(){
		System.out.println("cool");
	}
	public void rainy(){
		System.out.println("water");
	}
	public void whirl() {
		System.out.println("whirling");
	}
}
public class sample49 extends seasons implements H4{
	public void spring() {
		System.out.println("snow");
	}
	public void weather() {
		System.out.println("warm");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample49 d=new sample49();
		seasons g=new seasons();
		g.summer();
		g.winter();
		g.rainy();
		g.whirl();
		d.spring();
		d.weather();

	}

}
