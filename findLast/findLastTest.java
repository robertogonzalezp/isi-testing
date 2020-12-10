import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class findLastTest
{
	@Test
	public void arrayNumberNotFirst()
	{
		int arr[] = {0, 1, 2};
		assertEquals("Number to find is in second position", 1, findLast.findLast(arr, 1));
	}

	@Test
	public void arrayNumberFirst()
	{
		int arr[] = {0, 1, 2};
		assertEquals("Number to find is in first position", 0, findLast.findLast(arr, 0));
	}

	@Test
	public void arrayNoNumberToFind()
	{
		int arr[] = {0, 1, 2};
		assertEquals("Number to find is not in array", -1, findLast.findLast(arr, 3));
	}

	@Test (expected = NullPointerException.class)
	public void arrayEmpty()
	{
		int arr[] = null;
		findLast.findLast(arr, 0);
	}
}
