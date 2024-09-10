package Examples;
//sub or child class
public class Brother extends Sister
{
	//example of method overriding
	public void bike()
	{
		System.out.println("Bike: Pulsar 180");
	}
	public void car()   ///override
	{
		System.out.println("Car: Hyundai Creta");
	}
	public void land()
	{
		System.out.println("Land: 2 acres");
	}
	public void implicitCasting()
	{
		int a=90;
		System.out.println(a);
		long b=a;
		System.out.println(b);
	}
	public void explicitCasting()
	{
		float m=4.6f;
		System.out.println(m);
		float n=(float)m;
		System.out.println(n);
	}
}
