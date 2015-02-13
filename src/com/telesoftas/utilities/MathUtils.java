package com.telesoftas.utilities;

public final class MathUtils
{
  public static double a(double paramDouble)
  {
    return 3.280839895D * paramDouble;	// 英尺ft->米
  }
  
  // 长度深度单位转换
  public static double a(double paramDouble, int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return paramDouble;
    case 2: 
      return paramDouble * 0.546806649D; // 米->英寸ftm
    }
    return paramDouble * 3.280839895D;  // 英尺ft->米
  }
  
  public static int a(int paramInt1, int paramInt2, int paramInt3)
  {
    return Math.min(Math.max(paramInt1, paramInt2), paramInt3);
  }
  
  public static boolean a(int paramInt)
  {
    return (paramInt != 0) && ((paramInt & paramInt - 1) == 0);
  }
  
  public static double b(double paramDouble)
  {
    return 0.546806649D * paramDouble;
  }
  
  // 摄氏度-> 华摄氏
  public static double b(double paramDouble, int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return paramDouble;
    }
    return 32.0D + 9.0D * paramDouble / 5.0D;	// 摄氏度-> 华摄氏
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.utilities.MathUtils
 * JD-Core Version:    0.7.0.1
 */