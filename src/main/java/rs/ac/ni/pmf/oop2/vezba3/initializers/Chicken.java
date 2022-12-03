package rs.ac.ni.pmf.oop2.vezba3.initializers;

public class Chicken
{
	private Integer eggs = 2;

	static
	{
		System.out.println("Going through static initialization block");
	}

	{
		System.out.println("Going through common instance initialization block");
		this.eggs = 3;
	}

	public Chicken()
	{
		System.out.println("Zero args constructor");
	}

	public Chicken(int eggs)
	{
		System.out.println("One argument constructor");
		this.eggs = eggs;
	}
}
