/**
 * Find LAST index of zero
 *
 * @param x array to search
 * @return index of last 0 in x; -1 if absent
 * @throws NullPointerException if x is null
 */

public class lastZero
{

    public static int lastZero (int[] x)
    {

        int last = -1;
        int found = 0;

        for (int i = 0; i < x.length; i++)
        {
            if (x[i] == 0)
            {
                last = i;
                found = 1;
            }
        }

        if (found == 0)
        {
            return -1;
        } else {
            return last;
        }
    }
}
