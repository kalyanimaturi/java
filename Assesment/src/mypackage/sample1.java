package mypackage;
interface I1{
	void add();

}
interface I2{
	void sub();
	
	}
interface I3 extends I1,I2{
	void mul();
	
}
public class sample1 implements I3{
	public void add() {
		System.out.println("plus");
   }
	public void sub() {
		System.out.println("minus");

	}

    public void mul() {
	System.out.println("multiplication");
    }
    public void div() {
	System.out.println("divident");
    }
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample1 t=new sample1();
		t.add();
		t.sub();
		t.mul();
		t.div();

	}

}


