import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.*;

public class ListTests {
    @Test 
	public void testFilter() {
    List<String> input1 = Arrays.asList("Thomas", "NotThomas", "Hello");
    StringChecker s;
    ListExamples.filter(input1, s);
    assertArrayEquals(Arrays.asList("Thomas", "NotThomas"), input1);
	}
}
