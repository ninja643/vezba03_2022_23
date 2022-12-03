package rs.ac.ni.pmf.oop2.vezba3.geometry;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import com.fasterxml.jackson.core.JsonProcessingException;

class PointsParserTest
{
	final PointsParser pointsParser = new PointsParser();

	@Test
	public void shouldConvertPointToJson() throws JsonProcessingException
	{
		final Point2D point = new Point2D(1, 2);
		final String json = pointsParser.createJson(point);

		assertThat(json).isEqualTo("{\"x\":1,\"y\":2}");
	}

	@Test
	public void shouldConvertListOfPointsToJson() throws JsonProcessingException
	{
		final List<Point2D> points = new ArrayList<>();
		points.add(new Point2D(1, 2));
		points.add(new Point2D(3, 3));

		final String json = pointsParser.createJson(points);

		assertThat(json).isEqualTo("[{\"x\":1,\"y\":2},{\"x\":3,\"y\":3}]");
	}

	@Test
	public void shouldCreatePointFromJson() throws JsonProcessingException
	{
		final String json = "{\"x\":1,\"y\":2}";
		final Point2D point2D = pointsParser.fromJson(json);

		assertThat(point2D.getX()).isEqualTo(1);
		assertThat(point2D.getY()).isEqualTo(2);
	}
}
