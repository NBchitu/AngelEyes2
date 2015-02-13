package com.telesoftas.deeper.activities;

import android.os.Bundle;
import com.facebook.android.DialogError;
import com.facebook.android.Facebook.DialogListener;
import com.facebook.android.FacebookError;
import com.facebook.android.SessionStore;

final class SettingsActivity$FbLoginDialogListener
  implements Facebook.DialogListener
{
  private SettingsActivity$FbLoginDialogListener(SettingsActivity paramSettingsActivity) {}
  
  public void a() {}
  
  public void a(Bundle paramBundle)
  {
    SettingsActivity.b(this.a);
    SessionStore.a(SettingsActivity.c(this.a), this.a);
  }
  
  public void a(DialogError paramDialogError) {}
  
  public void a(FacebookError paramFacebookError) {}
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.SettingsActivity.FbLoginDialogListener
 * JD-Core Version:    0.7.0.1
 */