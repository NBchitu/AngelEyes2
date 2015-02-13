package com.telesoftas.deeper.activities;

import android.app.ProgressDialog;
import android.os.Handler;
import android.os.Message;
import com.facebook.android.Facebook;
import com.facebook.android.SessionStore;

class SettingsActivity$6
  extends Handler
{
  SettingsActivity$6(SettingsActivity paramSettingsActivity) {}
  
  public void handleMessage(Message paramMessage)
  {
    SettingsActivity.e(this.a).dismiss();
    SessionStore.a(this.a);
    SettingsActivity.c(this.a).a(10L);
    SettingsActivity.f(this.a);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.SettingsActivity.6
 * JD-Core Version:    0.7.0.1
 */