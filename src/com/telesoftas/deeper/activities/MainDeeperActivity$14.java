package com.telesoftas.deeper.activities;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.TextView;
import com.fridaylab.deeper.communication.CommunicationProtocol;

class MainDeeperActivity$14
  implements DialogInterface.OnClickListener
{
  MainDeeperActivity$14(MainDeeperActivity paramMainDeeperActivity) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    MainDeeperActivity.r(this.a).setText(2131427394);
    paramDialogInterface.cancel();
    MainDeeperActivity.d(this.a).b();
    this.a.w = false;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.MainDeeperActivity.14
 * JD-Core Version:    0.7.0.1
 */