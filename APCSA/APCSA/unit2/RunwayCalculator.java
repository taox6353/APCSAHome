package unit2;

import java.lang.Math;

public class RunwayCalculator
{
    private double vTakeOff;
    private double aTakeOff;
    private double runwayLength;

    public RunwayCalculator()
    {
        vTakeOff = 0;
        aTakeOff = 0;
    }

    public RunwayCalculator(double reqVel, double reqAccel)
    {
        vTakeOff = reqVel;
        aTakeOff = reqAccel;
    }

    public void calcRunway()
    {
        runwayLength = (Math.pow(vTakeOff,2))/(2*aTakeOff);
    }
    public double print() //double is the return type here. 
    {
      return runwayLength;
    }
}