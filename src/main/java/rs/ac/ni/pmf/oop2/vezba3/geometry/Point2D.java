package rs.ac.ni.pmf.oop2.vezba3.geometry;

import java.util.RandomAccess;

public class Point2D
{
	private final int x;
	private final int y;

	private Point2D()
	{
		x = 0;
		y = 0;
	}

	public Point2D(final int x, final int y)
	{
		this.x = x;
		this.y = y;
	}

	public int getX()
	{
		return x;
	}

	public int getY()
	{
		return y;
	}

	@Override
	public String toString()
	{
		return "Point2D{" +
			"x=" + x +
			", y=" + y +
			'}';
	}
}
