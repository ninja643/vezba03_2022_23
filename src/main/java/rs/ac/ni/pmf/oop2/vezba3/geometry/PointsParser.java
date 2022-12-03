package rs.ac.ni.pmf.oop2.vezba3.geometry;

import java.util.List;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PointsParser
{
	private final ObjectMapper _objectMapper = new ObjectMapper();
	public String createJson(final Point2D point) throws JsonProcessingException
	{
		return _objectMapper.writeValueAsString(point);
	}

	public String createJson(final List<Point2D> points) throws JsonProcessingException
	{
		return _objectMapper.writeValueAsString(points);
	}

	public Point2D fromJson(final String input) throws JsonProcessingException
	{
		return _objectMapper.readValue(input, Point2D.class);
	}

	public List<Point2D> fromJsonArray(final String input)
	{
		return null;
	}
}
