/*
 * @author Priscilla Paz, Tim McCoy, Emery Barnes, Francisco Martinez
 * CSE 4321
 * Project Part 4
 *
 * class Rocket
 * Retro Rocket mode for the MarsLander.
 * 
 */

package marslander;

public class Rocket 
{
    private float gps;
    private float rate;
    private String mode;
    
    public Rocket(String str,float g, float s)
    {
        mode = str;
        gps = g;
        rate = s;
    }
    
    public String getRRMode()
    {
        return mode;
    }
    
    public float getGPS()
    {
        return gps;
    }
    
    public float getRate()
    {
        return rate;
    }
    
}
