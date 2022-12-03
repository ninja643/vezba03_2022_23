package rs.ac.ni.pmf.oop2.vezba3.geometry;

public class PointsDemo
{
	public static void main(String[] args)
	{
		for (final Point2D point : PointsReaderStd.read())
		{
			System.out.println(point);
		}

		System.out.println("And once more...");

		for (final Point2D point : PointsReaderStd.read())
		{
			System.out.println(point);
		}

	}
}
