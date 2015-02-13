package com.telesoftas.deeper.activities;

import android.os.Handler;
import com.crashlytics.android.Crashlytics;
import com.facebook.android.Facebook;
import com.facebook.android.SessionStore;

class SettingsActivity$5
  extends Thread
{
  SettingsActivity$5(SettingsActivity paramSettingsActivity) {}
  
  public void run()
  {
    SessionStore.a(this.a);
    int i = 1;
    try
    {
      SettingsActivity.c(this.a).a(this.a);
      i = 0;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Crashlytics.a(localException);
      }
    }
    SettingsActivity.g(this.a).sendMessage(SettingsActivity.g(this.a).obtainMessage(i));
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.SettingsActivity.5
 * JD-Core Version:    0.7.0.1
 */