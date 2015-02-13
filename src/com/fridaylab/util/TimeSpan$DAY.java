package com.fridaylab.util;

import java.util.GregorianCalendar;

public final class TimeSpan$DAY
{
  public static int a(long paramLong1, long paramLong2)
  {
    if (paramLong1 == paramLong2) {
      return 0;
    }
    long l = Math.abs(paramLong1 - paramLong2);
    if (paramLong1 > paramLong2) {}
    for (int i = 1;; i = -1) {
      return i * (1 + (int)(l / 86400000L));
    }
  }
  
  public static boolean a(GregorianCalendar paramGregorianCalendar1, GregorianCalendar paramGregorianCalendar2)
  {
    if (paramGregorianCalendar1.get(1) > paramGregorianCalendar2.get(1)) {}
    while ((paramGregorianCalendar1.get(2) > paramGregorianCalendar2.get(2)) || (paramGregorianCalendar1.get(5) >= paramGregorianCalendar2.get(5))) {
      return false;
    }
    return true;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.util.TimeSpan.DAY
 * JD-Core Version:    0.7.0.1
 */