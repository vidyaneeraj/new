package Bank;

public class AxisBank extends BankInfo {
public void deposit (int fl) {
	System.out.println("Total number of deposits in Axis bank is"+fl);
}
public static void main(String[] args) {
	AxisBank ab =new AxisBank();
	ab.saving(650);
	ab.fixed();
	ab.deposit(500);
	
	
}
}
