package com.fridaylab.util;

import android.content.Context;
import java.util.GregorianCalendar;

public final class LocalTime
{
  public final int a;
  public final int b;
  
  private LocalTime(int paramInt1, int paramInt2)
  {
    this.a = paramInt1;
    this.b = paramInt2;
  }
  
  public static LocalTime a(int paramInt1, int paramInt2, long paramLong)
  {
    if (paramLong >= 0L) {}
    for (int i = 1;; i = 0)
    {
      if (i == 0) {
        paramLong = -paramLong;
      }
      long l1 = paramLong % 60000L;
      long l2 = (paramLong - l1) / 3600000L;
      if (i == 0)
      {
        l1 = -l1;
        l2 = -l2;
      }
      return new LocalTime(paramInt1 + (int)l2, paramInt2 + (int)l1);
    }
  }
  
  public String a(Context paramContext, GregorianCalendar paramGregorianCalendar)
  {
    GregorianCalendar localGregorianCalendar = new GregorianCalendar(paramGregorianCalendar.get(1), paramGregorianCalendar.get(2), paramGregorianCalendar.get(5), this.a, this.b);
    return android.text.format.DateFormat.getTimeFormat(paramContext).format(localGregorianCalendar.getTime());
  }
  
  public String toString()
  {
    return "[" + this.a + ":" + this.b + "]";
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.util.LocalTime
 * JD-Core Version:    0.7.0.1
 */