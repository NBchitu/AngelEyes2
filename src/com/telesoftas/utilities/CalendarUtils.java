package com.telesoftas.utilities;

import android.content.Context;
import android.text.format.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarUtils
{
  public static long a = 3600000L;
  public static long b = 24L * a;
  private static String[] c = new String[7];
  
  public static String a(int paramInt, Context paramContext)
  {
    b(paramContext);
    String str = " - ";
    if (paramInt < 8) {
      str = c[(paramInt - 1)];
    }
    return str;
  }
  
  public static String a(Context paramContext, long paramLong)
  {
    if (a(paramContext)) {
      return (String)DateFormat.format("kk:mm:ss", new Date(paramLong));
    }
    return (String)DateFormat.format("hh:mm:ss a", new Date(paramLong));
  }
  
  public static String a(GregorianCalendar paramGregorianCalendar)
  {
    return Integer.toString(paramGregorianCalendar.get(5));
  }
  
  public static String a(GregorianCalendar paramGregorianCalendar, Context paramContext)
  {
    b(paramContext);
    switch (paramGregorianCalendar.get(7))
    {
    default: 
      return " - ";
    case 2: 
      return c[1];
    case 3: 
      return c[2];
    case 4: 
      return c[3];
    case 5: 
      return c[4];
    case 6: 
      return c[5];
    case 7: 
      return c[6];
    }
    return c[0];
  }
  
  public static boolean a(Context paramContext)
  {
    return DateFormat.is24HourFormat(paramContext);
  }
  
  public static boolean a(Calendar paramCalendar1, Calendar paramCalendar2)
  {
    if ((paramCalendar1 == null) || (paramCalendar2 == null)) {
      throw new IllegalArgumentException("The dates must not be null");
    }
    return (paramCalendar1.get(0) == paramCalendar2.get(0)) && (paramCalendar1.get(1) == paramCalendar2.get(1)) && (paramCalendar1.get(6) == paramCalendar2.get(6));
  }
  
  private static void b(Context paramContext)
  {
    c[0] = paramContext.getString(2131427623);
    c[1] = paramContext.getString(2131427524);
    c[2] = paramContext.getString(2131427630);
    c[3] = paramContext.getString(2131427636);
    c[4] = paramContext.getString(2131427626);
    c[5] = paramContext.getString(2131427433);
    c[6] = paramContext.getString(2131427580);
  }
  
  public static boolean b(GregorianCalendar paramGregorianCalendar)
  {
    int i = paramGregorianCalendar.get(7);
    boolean bool;
    if (i != 7)
    {
      bool = false;
      if (i != 1) {}
    }
    else
    {
      bool = true;
    }
    return bool;
  }
  
  public static Long c(GregorianCalendar paramGregorianCalendar)
  {
    if (paramGregorianCalendar == null) {
      return null;
    }
    GregorianCalendar localGregorianCalendar1 = new GregorianCalendar();
    GregorianCalendar localGregorianCalendar2 = new GregorianCalendar(localGregorianCalendar1.get(1), localGregorianCalendar1.get(2), localGregorianCalendar1.get(5));
    long l1 = new GregorianCalendar(paramGregorianCalendar.get(1), paramGregorianCalendar.get(2), paramGregorianCalendar.get(5)).getTime().getTime() - localGregorianCalendar2.getTime().getTime();
    long l2 = 4L * a;
    if (l1 < 0L) {
      l2 = -l2;
    }
    return Long.valueOf((l2 + l1) / b);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.utilities.CalendarUtils
 * JD-Core Version:    0.7.0.1
 */