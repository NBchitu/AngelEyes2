package com.telesoftas.deeper;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.google.tagmanager.Container;
import com.google.tagmanager.ContainerOpener;
import com.google.tagmanager.ContainerOpener.OpenType;
import com.google.tagmanager.TagManager;
import com.telesoftas.utilities.deeper.SettingsUtils;

public final class Tags
{
  private static volatile Container a;
  private static SharedPreferences b;
  
  public static String a(String paramString)
  {
    if (a == null) {
      return b.getString(paramString, "2015-01-01");
    }
    String str = a.a(paramString);
    b.edit().putString(paramString, str).apply();
    return str;
  }
  
  public static void a(Context paramContext)
  {
    TagManager localTagManager = TagManager.a(paramContext);
    b = SettingsUtils.a(paramContext);
    ContainerOpener.a(localTagManager, "GTM-WWD5ZB", ContainerOpener.OpenType.a, null, new Tags.1());
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.Tags
 * JD-Core Version:    0.7.0.1
 */