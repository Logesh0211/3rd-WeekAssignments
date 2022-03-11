package week3day1;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("Deposit Amount is:"+"30000");
	}

	public static void main(String[] args) {
		AxisBank axis=new AxisBank();
		axis.saving();
		axis.deposit();
		axis.fixed();

	}

}
