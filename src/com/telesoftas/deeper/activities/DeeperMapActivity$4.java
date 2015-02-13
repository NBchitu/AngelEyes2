package com.telesoftas.deeper.activities;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.telesoftas.deeper.database.DeeperDatabase;
import com.telesoftas.deeper.database.LocationData;

class DeeperMapActivity$4
  implements DialogInterface.OnClickListener
{
  DeeperMapActivity$4(DeeperMapActivity paramDeeperMapActivity) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    DeeperMapActivity.d(this.a).e(DeeperMapActivity.c(this.a).f());
    int i = DeeperMapActivity.e(this.a);
    DeeperMapActivity.a(this.a, i);
    DeeperMapActivity.b(this.a, i);
    DeeperMapActivity.c(this.a, i);
    paramDialogInterface.dismiss();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.DeeperMapActivity.4
 * JD-Core Version:    0.7.0.1
 */