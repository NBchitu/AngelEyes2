package com.telesoftas.utilities;

public final class MathUtils
{
  public static double a(double paramDouble)
  {
    return 3.280839895D * paramDouble;	// Ӣ��ft->��
  }
  
  // ������ȵ�λת��
  public static double a(double paramDouble, int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return paramDouble;
    case 2: 
      return paramDouble * 0.546806649D; // ��->Ӣ��ftm
    }
    return paramDouble * 3.280839895D;  // Ӣ��ft->��
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
  
  // ���϶�-> ������
  public static double b(double paramDouble, int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return paramDouble;
    }
    return 32.0D + 9.0D * paramDouble / 5.0D;	// ���϶�-> ������
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.utilities.MathUtils
 * JD-Core Version:    0.7.0.1
 */