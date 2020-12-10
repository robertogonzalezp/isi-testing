/**
 * Counts positive elements in array
 *
 * @param x array to search
 * @return number of positive elements in x
 * @throws NullPointerException if x is null
 */

public class countPositive
{

	public static int countPositive (int[] x)
	{
		int count = 0;

		if (x == null)
		{
		 	throw new NullPointerException ("countPositive.countPositive");
		}

		for (int i=0; i < x.length; i++)
		{
			if (x[i] > 0)
			{
				count++;
			}
		}

		return count;
	}

}
