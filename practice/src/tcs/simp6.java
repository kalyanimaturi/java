package tcs;
class FixedAmount{
	public int fixedamount=10000;
}
abstract class Withdrawal{
	abstract void withdraw(int amount);
}
public class simp6 extends Withdrawal{
	FixedAmount f1=new FixedAmount();
	void withdraw(int amount) {
		f1.fixedamount-=amount;
		System.out.println("Withdrawn:"+amount);
		System.out.println("Available Balance:"+f1.fixedamount);
	}

	public static void main(String[] args) {
		int amount=Integer.parseInt(args[0]);
		simp6 s=new simp6();
		s.withdraw(amount);
		}
}

