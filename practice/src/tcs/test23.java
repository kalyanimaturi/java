package tcs;

public class test23 extends Thread{
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println(i);
			if(i==5) {
				try {
					Thread.sleep(2000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test23 t1=new test23();
		for(int i=0;i<=10;i++) {
			System.out.println(i);
	}
		t1.start();

}}
