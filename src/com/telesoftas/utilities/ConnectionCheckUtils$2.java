package com.telesoftas.utilities;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;

final class ConnectionCheckUtils$2
  implements DialogInterface.OnClickListener
{
  ConnectionCheckUtils$2(Activity paramActivity) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    Intent localIntent = new Intent("android.settings.WIRELESS_SETTINGS");
    this.a.startActivityForResult(localIntent, 101);
    paramDialogInterface.dismiss();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.utilities.ConnectionCheckUtils.2
 * JD-Core Version:    0.7.0.1
 */