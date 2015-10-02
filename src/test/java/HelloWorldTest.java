import it.ott8bre.ant.HelloWorld;
import org.junit.*;
import static org.junit.Assert.*;

public class HelloWorldTest {

	@Test
	public void testExample() throws Exception {
		assertEquals("Hello World", new HelloWorld().greet());
	}
}
