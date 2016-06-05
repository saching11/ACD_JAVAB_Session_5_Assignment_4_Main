
public class TestBank extends Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank sbi = new SBI();
		Bank icici = new ICICI();
		Bank axis = new AXIS();
		System.out.println("Rate of Interest of SBI is : \n" + sbi.getRateOfInterest());
		System.out.println("Rate of Interest of ICICI is : \n" + icici.getRateOfInterest());
		System.out.println("Rate of Interest of AXIS is : \n" + axis.getRateOfInterest());
		
	}

}
