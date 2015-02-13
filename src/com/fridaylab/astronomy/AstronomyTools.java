package com.fridaylab.astronomy;

import android.location.Location;
import com.fridaylab.util.LocalTime;
import com.koniaris.astronomy.JulianDay;
import com.koniaris.astronomy.Moon;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public final class AstronomyTools
{
  static
  {
    System.loadLibrary("astronomy");
  }
  
  public static CelestialMovements a(GregorianCalendar paramGregorianCalendar, Location paramLocation)
  {
    int i = 1;
    double[] arrayOfDouble = new double[2];
    int k = calculateSunEvents(paramGregorianCalendar.get(i), 1 + paramGregorianCalendar.get(2), paramGregorianCalendar.get(5), paramLocation.getLongitude(), paramLocation.getLatitude(), arrayOfDouble);
    long l = TimeZone.getDefault().getOffset(System.currentTimeMillis());
    LocalTime localLocalTime1 = a(arrayOfDouble[0], l);
    LocalTime localLocalTime2 = a(arrayOfDouble[i], l);
    if ((localLocalTime1 == null) && (localLocalTime2 == null))
    {
      if (k > 0) {}
      for (;;)
      {
        return CelestialMovements.a(i, null, null);
        int j = 0;
      }
    }
    return CelestialMovements.a(localLocalTime1, localLocalTime2);
  }
  
  private static LocalTime a(double paramDouble, long paramLong)
  {
    if (paramDouble < 0.0D) {
      return null;
    }
    JulianDay localJulianDay = new JulianDay(paramDouble);
    return LocalTime.a(localJulianDay.b(), localJulianDay.c(), paramLong);
  }
  
  public static Moon a(GregorianCalendar paramGregorianCalendar)
  {
    return new Moon(new JulianDay(paramGregorianCalendar));
  }
  
  public static void a(GregorianCalendar paramGregorianCalendar, Location paramLocation, int[] paramArrayOfInt)
  {
    calculateDailyFishingRating(paramGregorianCalendar.get(1), 1 + paramGregorianCalendar.get(2), paramGregorianCalendar.get(5), paramLocation.getLongitude(), paramLocation.getLatitude(), paramArrayOfInt);
  }
  
  private static double[][] a(int paramInt1, int paramInt2, double[] paramArrayOfDouble)
  {
    int i = paramArrayOfDouble.length;
    double[][] arrayOfDouble = new double[paramInt1][];
    int j = 0;
    int m;
    for (int k = 0; j < paramInt1; k = m)
    {
      double[] arrayOfDouble1 = new double[paramInt2];
      m = k + paramInt2;
      if (i >= m) {
        System.arraycopy(paramArrayOfDouble, k, arrayOfDouble1, 0, paramInt2);
      }
      arrayOfDouble[j] = arrayOfDouble1;
      j++;
    }
    return arrayOfDouble;
  }
  
  public static CelestialMovements b(GregorianCalendar paramGregorianCalendar, Location paramLocation)
  {
    int i = 1;
    double[] arrayOfDouble = new double[4];
    int k = calculateMoonEvents(paramGregorianCalendar.get(i), 1 + paramGregorianCalendar.get(2), paramGregorianCalendar.get(5), paramLocation.getLongitude(), paramLocation.getLatitude(), arrayOfDouble);
    long l = TimeZone.getDefault().getOffset(System.currentTimeMillis());
    LocalTime localLocalTime1 = a(arrayOfDouble[0], l);
    LocalTime localLocalTime2 = a(arrayOfDouble[i], l);
    LocalTime localLocalTime3 = a(arrayOfDouble[2], l);
    LocalTime localLocalTime4 = a(arrayOfDouble[3], l);
    if ((localLocalTime1 == null) && (localLocalTime3 == null))
    {
      if (k > 0) {}
      for (;;)
      {
        return CelestialMovements.a(i, localLocalTime2, localLocalTime4);
        int j = 0;
      }
    }
    return CelestialMovements.a(localLocalTime1, localLocalTime3, localLocalTime2, localLocalTime4);
  }
  
  public static double[][] b(GregorianCalendar paramGregorianCalendar, Location paramLocation, int[] paramArrayOfInt)
  {
    double[] arrayOfDouble = new double[24 * paramArrayOfInt.length];
    double d = TimeZone.getDefault().getOffset(System.currentTimeMillis()) / 86400000.0D;
    calculateHourlyFishingRating(paramGregorianCalendar.get(1), 1 + paramGregorianCalendar.get(2), paramGregorianCalendar.get(5), paramLocation.getLongitude(), paramLocation.getLatitude(), paramArrayOfInt, arrayOfDouble, d);
    return a(paramArrayOfInt.length, 24, arrayOfDouble);
  }
  
  private static native void calculateDailyFishingRating(int paramInt1, int paramInt2, int paramInt3, double paramDouble1, double paramDouble2, int[] paramArrayOfInt);
  
  private static native void calculateHourlyFishingRating(int paramInt1, int paramInt2, int paramInt3, double paramDouble1, double paramDouble2, int[] paramArrayOfInt, double[] paramArrayOfDouble, double paramDouble3);
  
  private static native int calculateMoonEvents(int paramInt1, int paramInt2, int paramInt3, double paramDouble1, double paramDouble2, double[] paramArrayOfDouble);
  
  private static native int calculateSunEvents(int paramInt1, int paramInt2, int paramInt3, double paramDouble1, double paramDouble2, double[] paramArrayOfDouble);
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.astronomy.AstronomyTools
 * JD-Core Version:    0.7.0.1
 */