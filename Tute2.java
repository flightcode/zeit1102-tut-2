/**
 * @Elliot Parker
 * @2020-07-15
 */

import java.util.*;

public class Tute2
{
    Scanner scan = new Scanner(System.in);
    
    public void init()
    {
        
    }
    
    public static void main(String [] args)
    {
        Tute2 t2 = new Tute2();
        t2.init();
    }
    
    int random(int i1, int i2)
    {
        Random r = new Random();
        int low;
        int high;
        if(i1 > i2)
        {
            high = i1;
            low = i2;
        } else if(i2 > i1)
        {
            high = i2;
            low = i1;
        } else
        {
            return 0;
        }
        return r.nextInt(high - low) + low;
    }
}
