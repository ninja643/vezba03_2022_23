package rs.ac.ni.pmf.oop2.vezba3.geometry;

import java.util.*;

public class PointsReaderStd
{
	public static List<Point2D> read()
	{
		final List<Point2D> points = new ArrayList<>();

		final Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter number of points: ");
		final int n = scanner.nextInt();

		for(int i = 0; i < n; i++)
		{
			final int x = scanner.nextInt();
			final int y = scanner.nextInt();

			points.add(new Point2D(x, y));
		}

		return points;
//		scanner.close();
	}
}
