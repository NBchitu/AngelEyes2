package com.telesoftas.utilities.deeper;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.telesoftas.utilities.MathUtils;

public class SettingsUtils
{
  public static String a = "units";
  public static String b = "visualization";
  public static String c = "frequency";
  public static String d = "sensitivity";
  public static String e = "gain";
  public static String f = "fishIcons";
  public static String g = "nightFishing";
  public static String h = "depth_alarms";
  public static String i = "max_depth_alarm";
  public static String j = "max_depth_alarm_value";
  public static String k = "min_depth_alarm";
  public static String l = "min_depth_alarm_value";
  public static String m = "sounds_main";
  public static String n = "fish_alarm";
  public static String o = "fish_small_alarm";
  public static String p = "fish_medium_alarm";
  public static String q = "fish_large_alarm";
  public static String r = "fish_depth";
  public static String s = "ice_fishing";
  public static String t = "vertical_flasher";
  public static String u = "history";
  
  public static float a(float paramFloat, int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return paramFloat;
    case 1: 
    case 3: 
      return (float)MathUtils.a(paramFloat);
    }
    return (float)MathUtils.b(paramFloat);
  }
  
  public static SharedPreferences a(Context paramContext)
  {
    return paramContext.getSharedPreferences("prefs", 0);
  }
  
  public static String a(float paramFloat, int paramInt, Context paramContext)
  {
    switch (paramInt)
    {
    default: 
      return (int)paramFloat + paramContext.getString(2131427513);
    case 1: 
    case 3: 
      return (int)paramFloat + paramContext.getString(2131427424);
    }
    return (int)paramFloat + paramContext.getString(2131427422);
  }
  
  public static void a(Context paramContext, String paramString)
  {
    SharedPreferences.Editor localEditor = paramContext.getSharedPreferences("prefs", 0).edit();
    localEditor.putString("default_deeper_address", paramString);
    localEditor.putBoolean("has_deeper", true);
    localEditor.apply();
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("records", 0);
    if (!localSharedPreferences.contains(paramString)) {
      localSharedPreferences.edit().putBoolean(paramString, true).apply();
    }
  }
  
  public static void a(Context paramContext, boolean paramBoolean)
  {
    SharedPreferences.Editor localEditor = paramContext.getSharedPreferences("prefs", 0).edit();
    if (paramBoolean) {
      localEditor.putInt(r, 1);
    }
    for (;;)
    {
      localEditor.apply();
      return;
      localEditor.putInt(r, 0);
    }
  }
  
  public static boolean[] b(Context paramContext)
  {
    boolean[] arrayOfBoolean = { 0, 0, 0 };
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("prefs", 0);
    if (localSharedPreferences.getInt(n, 1) == 1)
    {
      if (localSharedPreferences.getInt(o, 1) == 1) {
        arrayOfBoolean[0] = true;
      }
      if (localSharedPreferences.getInt(p, 1) == 1) {
        arrayOfBoolean[1] = true;
      }
      if (localSharedPreferences.getInt(q, 1) == 1) {
        arrayOfBoolean[2] = true;
      }
      return arrayOfBoolean;
    }
    return null;
  }
  
  public static int[] c(Context paramContext)
  {
    int[] arrayOfInt = { 0, 41 };
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("prefs", 0);
    if (localSharedPreferences.getInt(h, 1) == 1)
    {
      if (localSharedPreferences.getInt(k, 1) == 1) {
        arrayOfInt[0] = localSharedPreferences.getInt(l, 5);
      }
      if (localSharedPreferences.getInt(i, 1) == 1) {
        arrayOfInt[1] = localSharedPreferences.getInt(j, 25);
      }
      return arrayOfInt;
    }
    return null;
  }
  
  public static String d(Context paramContext)
  {
    return paramContext.getSharedPreferences("prefs", 0).getString("default_deeper_address", null);
  }
  
  public static boolean e(Context paramContext)
  {
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("prefs", 0);
    boolean bool;
    if (!localSharedPreferences.getBoolean("has_deeper", false))
    {
      String str = localSharedPreferences.getString("default_deeper_address", null);
      bool = false;
      if (str == null) {}
    }
    else
    {
      bool = true;
    }
    return bool;
  }
  
  public static int f(Context paramContext)
  {
    return paramContext.getSharedPreferences("prefs", 0).getInt(r, -1);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.utilities.deeper.SettingsUtils
 * JD-Core Version:    0.7.0.1
 */