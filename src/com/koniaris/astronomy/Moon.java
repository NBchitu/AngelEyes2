package com.koniaris.astronomy;

public class Moon
{
  private final double a;
  private final double b;
  
  public Moon()
  {
    this(new JulianDay());
  }
  
  public Moon(JulianDay paramJulianDay)
  {
    this.a = ((paramJulianDay.a() - 2451545.0D) / 36525.0D);
    this.b = d(this.a);
  }
  
  public static boolean a(double paramDouble)
  {
    double d = h(paramDouble);
    if (d < 0.0D) {}
    do
    {
      return true;
      if (d > 0.0D) {
        return false;
      }
    } while (i(paramDouble) > 0.0D);
    return false;
  }
  
  public static double b(double paramDouble)
  {
    return 0.5D * (1.0D + i(paramDouble));
  }
  
  public static int c(double paramDouble)
  {
    return (int)Math.round(100.0D * b(paramDouble));
  }
  
  public static double d(double paramDouble)
  {
    double d1 = e(paramDouble);
    double d2 = f(paramDouble);
    double d3 = g(paramDouble);
    return 180.0D - d1 - 6.289D * h(d3) + 2.1D * h(d2) - 1.274D * h(2.0D * d1 - d3) - 0.658D * h(2.0D * d1) - 0.214D * h(d3 * 2.0D) - 0.11D * h(d1);
  }
  
  public static double e(double paramDouble)
  {
    return 297.85019210000002D + paramDouble * (445267.11140340002D + paramDouble * (-0.0018819D + paramDouble * (1.831944719236152E-006D - paramDouble / 113065000.0D)));
  }
  
  public static double f(double paramDouble)
  {
    return 357.52910919999999D + paramDouble * (35999.050290899999D + paramDouble * (-0.0001536D + paramDouble / 24490000.0D));
  }
  
  public static double g(double paramDouble)
  {
    return 134.96339639999999D + paramDouble * (477198.86750549998D + paramDouble * (0.0087414D + paramDouble * (1.434740814071938E-005D - paramDouble / 14712000.0D)));
  }
  
  private static double h(double paramDouble)
  {
    return Math.sin(Math.toRadians(paramDouble));
  }
  
  private static double i(double paramDouble)
  {
    return Math.cos(Math.toRadians(paramDouble));
  }
  
  public boolean a()
  {
    return a(this.b);
  }
  
  public int b()
  {
    return c(this.b);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.koniaris.astronomy.Moon
 * JD-Core Version:    0.7.0.1
 */