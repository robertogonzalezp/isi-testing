import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class lastZeroTest
{
    @Test
    public void arrayFirstZero()
    {
        int arr[] = {0, 7, 0};
        assertEquals("Lastzero is in last element", 2, lastZero.lastZero(arr));
    }

    @Test
    public void arrayWithZero()
    {
        int arr[] = {8, 0, 8};
        assertEquals("Lastzero is in the second element", 1, lastZero.lastZero(arr));
    }

    @Test
    public void arrayWithoutZero()
    {
        int arr[] = {9, 9, 9};
        assertEquals("No zeros", -1, lastZero.lastZero(arr));
    }

    @Test (expected = NullPointerException.class)
    public void arrayEmpty()
    {
        int arr[] = null;
        lastZero.lastZero(arr);
    }
}
