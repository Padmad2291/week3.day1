package week3.day2;

public class AxisBank extends BankInfo{
	public void deposit() {
		System.out.println("This is overridden method");
	}

	public static void main(String[] args) {
		AxisBank ab = new AxisBank();
		ab.saving();
		ab.fixed();
		ab.deposit();

	}

}
