package com.fridaylab.util;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.Log;

public class Flog
{
  public static final Paint a = new Paint();
  public static final Paint b;
  public static final Paint c;
  public static final Paint d;
  
  static
  {
    a.setColor(Color.argb(255, 0, 0, 0));
    b = new Paint();
    b.setColor(Color.argb(30, 200, 200, 200));
    c = new Paint();
    c.setColor(Color.argb(220, 255, 0, 0));
    c.setStyle(Paint.Style.STROKE);
    c.setStrokeWidth(1.3F);
    c.setAntiAlias(true);
    d = new Paint();
    d.setColor(Color.argb(70, 0, 0, 200));
  }
  
  public static String a()
  {
    return "FridayLab";
  }
  
  public static void a(String paramString) {}
  
  public static void a(String paramString, Exception paramException)
  {
    Log.e(a(), paramString, paramException);
  }
  
  public static void b(String paramString) {}
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.util.Flog
 * JD-Core Version:    0.7.0.1
 */