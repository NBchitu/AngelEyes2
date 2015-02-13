package com.telesoftas.deeper.activities;

import android.os.Handler;
import com.crashlytics.android.Crashlytics;
import com.facebook.android.Facebook;
import org.json.JSONObject;
import org.json.JSONTokener;

class SettingsActivity$3
  extends Thread
{
  SettingsActivity$3(SettingsActivity paramSettingsActivity) {}
  
  public void run()
  {
    try
    {
      String str2 = ((JSONObject)new JSONTokener(SettingsActivity.c(this.a).a("me")).nextValue()).getString("name");
      str1 = str2;
      i = 0;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Crashlytics.a(localException);
        int i = 1;
        String str1 = "";
      }
    }
    SettingsActivity.d(this.a).sendMessage(SettingsActivity.d(this.a).obtainMessage(i, str1));
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.SettingsActivity.3
 * JD-Core Version:    0.7.0.1
 */