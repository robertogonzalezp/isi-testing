import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class countPositiveTest
{
	@Test
	public void arrayWithZero()
	{
		int arr[] = {-2, 7, 0};
		assertEquals("Nonzero in first element", 1, countPositive.countPositive(arr));
	}

	@Test
	public void arrayWithoutZero()
	{
		int arr[] = {8, -7, 2};
		assertEquals("Zero in first element", 2, countPositive.countPositive(arr));
	}

	@Test (expected = NullPointerException.class)
	public void arrayEmpty()
	{
		int arr[] = null;
		countPositive.countPositive(arr);
	}
}
