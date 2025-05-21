package tcs;
public class test26 extends Thread{
	String s;
	public test26(String name) {
		s=name;
	}
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println(s+"is Daemon Thread");
		}else {
			System.out.println(s+"user Thread");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test26 thread1=new test26("Thread1");
		test26 thread2=new test26("Thread2");
		test26 thread3=new test26("Thread3");
		thread1.setDaemon(true);
		thread1.start();
		thread2.start();
		thread3.setDaemon(false);
		thread3.start();

	}

}
