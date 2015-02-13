package com.telesoftas.deeper;

public class Analytics
{
  public static String a(long paramLong1, long paramLong2)
  {
    double d = 100.0D * paramLong1 / (paramLong1 + paramLong2);
    if (d <= 5.0D) {
      return "0-5%";
    }
    if (d <= 20.0D) {
      return "5-20%";
    }
    if (d <= 40.0D) {
      return "20-40%";
    }
    if (d < 60.0D) {
      return "40-60%";
    }
    if (d < 80.0D) {
      return "60-80%";
    }
    if (d < 95.0D) {
      return "80-95%";
    }
    return "95-100%";
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.Analytics
 * JD-Core Version:    0.7.0.1
 */