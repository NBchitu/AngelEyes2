package com.facebook.android;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class SessionStore
{
  public static void a(Context paramContext)
  {
    SharedPreferences.Editor localEditor = paramContext.getSharedPreferences("facebook-session", 0).edit();
    localEditor.clear();
    localEditor.commit();
  }
  
  public static boolean a(Facebook paramFacebook, Context paramContext)
  {
    SharedPreferences.Editor localEditor = paramContext.getSharedPreferences("facebook-session", 0).edit();
    localEditor.putString("access_token", paramFacebook.b());
    localEditor.putLong("expires_in", paramFacebook.c());
    return localEditor.commit();
  }
  
  public static boolean a(String paramString, Context paramContext)
  {
    SharedPreferences.Editor localEditor = paramContext.getSharedPreferences("facebook-session", 0).edit();
    localEditor.putString("username", paramString);
    return localEditor.commit();
  }
  
  public static String b(Context paramContext)
  {
    return paramContext.getSharedPreferences("facebook-session", 0).getString("username", " ");
  }
  
  public static boolean b(Facebook paramFacebook, Context paramContext)
  {
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("facebook-session", 0);
    paramFacebook.b(localSharedPreferences.getString("access_token", null));
    paramFacebook.a(localSharedPreferences.getLong("expires_in", 0L));
    return paramFacebook.a();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.facebook.android.SessionStore
 * JD-Core Version:    0.7.0.1
 */