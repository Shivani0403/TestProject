
class Banks {
	int getRateOfInterest()
	{
		return 0;
	}
}
class SBI extends Banks
{
	int getRateOfInterest()
	{
		return 8;
	}
}

class ICICI extends Banks
{
	int getRateOfInterest()
	{
		return 7;
	}

}
class AXIS extends Banks
{
	int getRateOfInterest()
	{
		return 9;
	}
}
public class Bank {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI s=new SBI();
		ICICI i=new ICICI();
		AXIS a=new AXIS();
		System.out.println("SBI Rate of Interest "+s.getRateOfInterest());
	    System.out.println("ICICI Rate of Interest "+i.getRateOfInterest());
		System.out.println("AXIS Rate of Interest "+a.getRateOfInterest());
			
	}
}
