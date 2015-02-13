package com.telesoftas.utilities;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;

final class ConnectionCheckUtils$4
  implements DialogInterface.OnClickListener
{
  ConnectionCheckUtils$4(Activity paramActivity) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    Intent localIntent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
    this.a.startActivityForResult(localIntent, 102);
    paramDialogInterface.dismiss();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.utilities.ConnectionCheckUtils.4
 * JD-Core Version:    0.7.0.1
 */