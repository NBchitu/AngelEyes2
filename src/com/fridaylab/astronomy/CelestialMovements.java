package com.fridaylab.astronomy;

import com.fridaylab.util.LocalTime;

public class CelestialMovements
{
  public final LocalTime a;
  public final LocalTime b;
  public final LocalTime c;
  public final LocalTime d;
  public final boolean e;
  
  private CelestialMovements(LocalTime paramLocalTime1, LocalTime paramLocalTime2)
  {
    this(paramLocalTime1, paramLocalTime2, null, null);
  }
  
  private CelestialMovements(LocalTime paramLocalTime1, LocalTime paramLocalTime2, LocalTime paramLocalTime3, LocalTime paramLocalTime4)
  {
    this.a = paramLocalTime1;
    this.b = paramLocalTime2;
    this.c = paramLocalTime3;
    this.d = paramLocalTime4;
    this.e = false;
  }
  
  private CelestialMovements(boolean paramBoolean, LocalTime paramLocalTime1, LocalTime paramLocalTime2)
  {
    this.e = paramBoolean;
    this.a = null;
    this.b = null;
    this.c = paramLocalTime1;
    this.d = paramLocalTime2;
  }
  
  public static CelestialMovements a(LocalTime paramLocalTime1, LocalTime paramLocalTime2)
  {
    return new CelestialMovements(paramLocalTime1, paramLocalTime2);
  }
  
  public static CelestialMovements a(LocalTime paramLocalTime1, LocalTime paramLocalTime2, LocalTime paramLocalTime3, LocalTime paramLocalTime4)
  {
    return new CelestialMovements(paramLocalTime1, paramLocalTime2, paramLocalTime3, paramLocalTime4);
  }
  
  public static CelestialMovements a(boolean paramBoolean, LocalTime paramLocalTime1, LocalTime paramLocalTime2)
  {
    return new CelestialMovements(paramBoolean, paramLocalTime1, paramLocalTime2);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.astronomy.CelestialMovements
 * JD-Core Version:    0.7.0.1
 */