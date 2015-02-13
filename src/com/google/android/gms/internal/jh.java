package com.google.android.gms.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.util.Log;

public class jh
  implements DialogInterface.OnClickListener
{
  private final Activity a;
  private final Fragment b;
  private final Intent c;
  private final int d;
  
  public jh(Activity paramActivity, Intent paramIntent, int paramInt)
  {
    this.a = paramActivity;
    this.b = null;
    this.c = paramIntent;
    this.d = paramInt;
  }
  
  public jh(Fragment paramFragment, Intent paramIntent, int paramInt)
  {
    this.a = null;
    this.b = paramFragment;
    this.c = paramIntent;
    this.d = paramInt;
  }
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    try
    {
      if ((this.c != null) && (this.b != null)) {
        this.b.a(this.c, this.d);
      }
      for (;;)
      {
        paramDialogInterface.dismiss();
        return;
        if (this.c != null) {
          this.a.startActivityForResult(this.c, this.d);
        }
      }
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      Log.e("SettingsRedirect", "Can't redirect to app settings for Google Play services");
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.jh
 * JD-Core Version:    0.7.0.1
 */