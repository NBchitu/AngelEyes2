package com.telesoftas.utilities;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class StringUtils
{
  public static final DecimalFormat a = new DecimalFormat("0", new DecimalFormatSymbols(Locale.US));
  public static final DecimalFormat b = new DecimalFormat("0.0", new DecimalFormatSymbols(Locale.US));
  private static final SimpleDateFormat c = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);
  private static final SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
  
  public static String a(long paramLong)
  {
    return c.format(new Date(paramLong)).replaceAll("(\\d\\d)(\\d\\d)$", "$1:$2");
  }
  
  public static String a(Context paramContext)
  {
    try
    {
      String str = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).versionName;
      return str;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      throw new IllegalStateException("Unrecoverable failure", localNameNotFoundException);
    }
  }
  
  public static String a(Calendar paramCalendar, Context paramContext)
  {
    String str1 = android.text.format.DateFormat.getDateFormat(paramContext).format(paramCalendar.getTime());
    String str2 = android.text.format.DateFormat.getTimeFormat(paramContext).format(paramCalendar.getTime());
    String str3 = str1 + " ";
    return str3 + str2;
  }
  
  public static GregorianCalendar a(String paramString)
  {
    String[] arrayOfString = paramString.split("-");
    return new GregorianCalendar(Integer.parseInt(arrayOfString[0]), Integer.parseInt(arrayOfString[1]), Integer.parseInt(arrayOfString[2]));
  }
  
  public static String b(Calendar paramCalendar, Context paramContext)
  {
    return android.text.format.DateFormat.getDateFormat(paramContext).format(paramCalendar.getTime());
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.utilities.StringUtils
 * JD-Core Version:    0.7.0.1
 */