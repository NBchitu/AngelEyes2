package com.telesoftas.deeper.activities;

import android.app.ProgressDialog;
import android.os.Handler;
import android.os.Message;
import com.facebook.android.SessionStore;

class SettingsActivity$4
  extends Handler
{
  SettingsActivity$4(SettingsActivity paramSettingsActivity) {}
  
  public void handleMessage(Message paramMessage)
  {
    SettingsActivity.e(this.a).dismiss();
    if (paramMessage.what == 0)
    {
      String str = (String)paramMessage.obj;
      if (str.equals("")) {
        str = "---";
      }
      SessionStore.a(str, this.a);
      SettingsActivity.f(this.a);
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.SettingsActivity.4
 * JD-Core Version:    0.7.0.1
 */