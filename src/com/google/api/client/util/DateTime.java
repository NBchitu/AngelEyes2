package com.google.api.client.util;

import com.google.common.base.Objects;
import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public final class DateTime
  implements Serializable
{
  private static final TimeZone a = TimeZone.getTimeZone("GMT");
  private final long b;
  private final boolean c;
  private final Integer d;
  
  public DateTime(long paramLong)
  {
    this(false, paramLong, null);
  }
  
  public DateTime(boolean paramBoolean, long paramLong, Integer paramInteger)
  {
    this.c = paramBoolean;
    this.b = paramLong;
    this.d = paramInteger;
  }
  
  public static DateTime a(String paramString)
  {
    for (;;)
    {
      int i1;
      int i2;
      boolean bool;
      try
      {
        i = Integer.parseInt(paramString.substring(0, 4));
        j = -1 + Integer.parseInt(paramString.substring(5, 7));
        k = Integer.parseInt(paramString.substring(8, 10));
        m = paramString.length();
        if (m <= 10) {
          break label336;
        }
        if (Character.toUpperCase(paramString.charAt(10)) == 'T') {
          break label363;
        }
      }
      catch (StringIndexOutOfBoundsException localStringIndexOutOfBoundsException)
      {
        int i;
        int j;
        int k;
        int m;
        GregorianCalendar localGregorianCalendar;
        int i6;
        int i7;
        int i8;
        long l3;
        int i9;
        throw new NumberFormatException("Invalid date/time format.");
      }
      localGregorianCalendar = new GregorianCalendar(a);
      localGregorianCalendar.set(i, j, k, i3, i1, i2);
      localGregorianCalendar.set(14, i5);
      long l1 = localGregorianCalendar.getTimeInMillis();
      long l2;
      Integer localInteger;
      int n;
      if (m > i4)
      {
        if (Character.toUpperCase(paramString.charAt(i4)) == 'Z')
        {
          l2 = l1;
          i6 = 0;
          localInteger = Integer.valueOf(i6);
          return new DateTime(bool, l2, localInteger);
          n = Integer.parseInt(paramString.substring(11, 13));
          i1 = Integer.parseInt(paramString.substring(14, 16));
          i2 = Integer.parseInt(paramString.substring(17, 19));
          if (paramString.charAt(19) == '.')
          {
            i5 = Integer.parseInt(paramString.substring(20, 23));
            i3 = n;
            i4 = 23;
          }
        }
        else
        {
          i7 = 60 * Integer.parseInt(paramString.substring(i4 + 1, i4 + 3)) + Integer.parseInt(paramString.substring(i4 + 4, i4 + 6));
          i8 = paramString.charAt(i4);
          if (i8 == 45) {
            i7 = -i7;
          }
          l3 = l1 - 60000 * i7;
          i9 = i7;
          l2 = l3;
          i6 = i9;
          continue;
        }
      }
      else
      {
        l2 = l1;
        localInteger = null;
        continue;
        label336:
        label363:
        for (bool = true;; bool = false)
        {
          if (!bool) {
            break label367;
          }
          i4 = 2147483647;
          i3 = 0;
          i1 = 0;
          i2 = 0;
          i5 = 0;
          break;
        }
        label367:
        continue;
      }
      int i3 = n;
      int i4 = 19;
      int i5 = 0;
    }
  }
  
  private static void a(StringBuilder paramStringBuilder, int paramInt1, int paramInt2)
  {
    if (paramInt1 < 0)
    {
      paramStringBuilder.append('-');
      paramInt1 = -paramInt1;
    }
    int i = paramInt1;
    while (i > 0)
    {
      i /= 10;
      paramInt2--;
    }
    for (int j = 0; j < paramInt2; j++) {
      paramStringBuilder.append('0');
    }
    if (paramInt1 != 0) {
      paramStringBuilder.append(paramInt1);
    }
  }
  
  public String a()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    GregorianCalendar localGregorianCalendar = new GregorianCalendar(a);
    long l = this.b;
    Integer localInteger = this.d;
    if (localInteger != null) {
      l += 60000L * localInteger.longValue();
    }
    localGregorianCalendar.setTimeInMillis(l);
    a(localStringBuilder, localGregorianCalendar.get(1), 4);
    localStringBuilder.append('-');
    a(localStringBuilder, 1 + localGregorianCalendar.get(2), 2);
    localStringBuilder.append('-');
    a(localStringBuilder, localGregorianCalendar.get(5), 2);
    if (!this.c)
    {
      localStringBuilder.append('T');
      a(localStringBuilder, localGregorianCalendar.get(11), 2);
      localStringBuilder.append(':');
      a(localStringBuilder, localGregorianCalendar.get(12), 2);
      localStringBuilder.append(':');
      a(localStringBuilder, localGregorianCalendar.get(13), 2);
      if (localGregorianCalendar.isSet(14))
      {
        localStringBuilder.append('.');
        a(localStringBuilder, localGregorianCalendar.get(14), 3);
      }
    }
    if (localInteger != null)
    {
      if (localInteger.intValue() == 0) {
        localStringBuilder.append('Z');
      }
    }
    else {
      return localStringBuilder.toString();
    }
    int i = localInteger.intValue();
    if (localInteger.intValue() > 0) {
      localStringBuilder.append('+');
    }
    for (;;)
    {
      int j = i / 60;
      int k = i % 60;
      a(localStringBuilder, j, 2);
      localStringBuilder.append(':');
      a(localStringBuilder, k, 2);
      break;
      localStringBuilder.append('-');
      i = -i;
    }
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    DateTime localDateTime;
    do
    {
      return true;
      if (!(paramObject instanceof DateTime)) {
        return false;
      }
      localDateTime = (DateTime)paramObject;
    } while ((this.c == localDateTime.c) && (this.b == localDateTime.b) && (Objects.a(this.d, localDateTime.d)));
    return false;
  }
  
  public String toString()
  {
    return a();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.util.DateTime
 * JD-Core Version:    0.7.0.1
 */