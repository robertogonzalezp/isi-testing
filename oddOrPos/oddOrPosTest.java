import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class oddOrPosTest
{
	@Test
	public void arrayPositive()
	{
		int arr[] = {5, 6, 7};
		assertEquals("Number of positives and/or odd", 3, oddOrPos.oddOrPos(arr));
	}

	@Test
	public void arrayNegativeEven()
	{
		int arr[] = {-2, -4, -6};
		assertEquals("Number of positives and/or odd", 0, oddOrPos.oddOrPos(arr));
	}

	@Test
	public void arrayNegativeOdd()
	{
		int arr[] = {-1, -3, -5};
		assertEquals("Number of positives and/or odd", 3, oddOrPos.oddOrPos(arr));
	}

	@Test (expected = NullPointerException.class)
	public void arrayEmpty()
	{
		int arr[] = null;
		oddOrPos.oddOrPos(arr);
	}
}
