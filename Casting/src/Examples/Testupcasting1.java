package Examples;

public class Testupcasting1 
{
	public static void main(String[]args)
	{
	
		Sister s=new Brother(); 
		s.car();
		s.cash();
		s.moped();
		System.out.println("........................");
		s.add(78, 89);
		System.out.println("........................");
		s.sub(988, 756);
	}
}
