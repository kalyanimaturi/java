package tcs;
class chocolate{
	void black() {
		System.out.println("tasty");
	}
}
class darkfantasy extends chocolate{
	void brown() {
		System.out.println("extreme");
	}
	
}
class sweet extends chocolate{
	void mothi() {
		System.out.println("chur");
	}
}
class bourveli extends darkfantasy{
	void biscuit() {
		System.out.println("crunch");
	}
}
class amul extends darkfantasy{
	void icecream() {
		System.out.println("creamy");
	}
}
class dairymilk extends sweet{
	void dark() {
		System.out.println("gift");
	
	}
}
class kikat extends sweet{
	void bytes() {
		System.out.println("fnd");
	}
}
public abstract class hierarcy {

	public static void main(String[] args) {
		bourveli b=new bourveli();
		amul a=new amul();
		dairymilk d=new dairymilk();
		kikat k=new kikat();
		b.black();
		a.brown();
		d.mothi();
		b.biscuit();
		a.icecream();
		d.dark();
		k.bytes();
	}

}
