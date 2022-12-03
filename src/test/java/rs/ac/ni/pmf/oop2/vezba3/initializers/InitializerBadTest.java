package rs.ac.ni.pmf.oop2.vezba3.initializers;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class InitializerBadTest
{
	@Test
	public void shouldConfirmIncorrectResult()
	{
		assertThat(InitializerBad.getSum()).isNotEqualTo(4950);
	}
}
