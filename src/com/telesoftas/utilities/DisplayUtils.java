package com.telesoftas.utilities;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.provider.Settings.SettingNotFoundException;
import android.provider.Settings.System;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Window;

public class DisplayUtils
{
  public static int a(float paramFloat, Context paramContext)
  {
    return (int)TypedValue.applyDimension(1, paramFloat, paramContext.getResources().getDisplayMetrics());
  }
  
  public static int a(Context paramContext, int paramInt)
  {
    DisplayMetrics localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
    return (int)(paramInt * localDisplayMetrics.density);
  }
  
  public static void a(Activity paramActivity)
  {
    paramActivity.requestWindowFeature(1);
    paramActivity.getWindow().setFlags(1024, 1024);
  }
  
  public static boolean a()
  {
    return Build.VERSION.SDK_INT < 11;
  }
  
  public static boolean a(Context paramContext)
  {
    if (a()) {}
    do
    {
      do
      {
        return false;
        if (!b()) {
          break;
        }
      } while (b(paramContext) < 3);
      return true;
    } while (c(paramContext) < 600);
    return true;
  }
  
  public static int b(Context paramContext)
  {
    return paramContext.getResources().getConfiguration().screenLayout;
  }
  
  public static boolean b()
  {
    return (Build.VERSION.SDK_INT >= 11) && (Build.VERSION.SDK_INT < 13);
  }
  
  @TargetApi(13)
  public static int c(Context paramContext)
  {
    return paramContext.getResources().getConfiguration().smallestScreenWidthDp;
  }
  
  public static int d(Context paramContext)
  {
    try
    {
      int j = Settings.System.getInt(paramContext.getContentResolver(), "screen_brightness");
      f = j;
    }
    catch (Settings.SettingNotFoundException localSettingNotFoundException)
    {
      for (;;)
      {
        boolean bool;
        int i;
        float f = 0.0F;
      }
    }
    bool = f < 0.0F;
    i = 0;
    if (bool) {
      i = (int)(100.0F * (f / 255.0F));
    }
    return i;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.utilities.DisplayUtils
 * JD-Core Version:    0.7.0.1
 */