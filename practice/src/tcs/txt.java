package tcs;
class txt2 extends Thread{
	public void run() {
		System.out.println("hi");
	}
	
}
class txt5 extends txt2{
     public void run1() {
		System.out.println("hyy");
     }	
}
class txt3 implements Runnable{
	public void run()
	{	System.out.println("good mng");
	}}
class txt4 extends txt3{
	public void run() {
		System.out.println("hello");
	}
}
class txt{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		txt3 t2=new txt3();
		txt4 t3=new txt4();
		txt5 t1=new txt5();
		t1.run1();
		t1.run();
		//System.out.println("hello");
		Thread t4=new Thread(t2);
		Thread t5=new Thread(t3);
		t4.run();
		t5.run();
	}

}
