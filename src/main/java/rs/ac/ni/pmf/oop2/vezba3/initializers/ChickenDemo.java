package rs.ac.ni.pmf.oop2.vezba3.initializers;

public class ChickenDemo
{
	public static void main(String[] args)
	{
		System.out.println("Start");

		final Chicken c1 = new Chicken(1);
		final Chicken c2 = new Chicken(2);
		final Chicken c4 = new Chicken();

		System.out.println("Done");
	}
}
