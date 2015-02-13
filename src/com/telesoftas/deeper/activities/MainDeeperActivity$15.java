package com.telesoftas.deeper.activities;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.fridaylab.deeper.communication.CommunicationProtocol;
import com.fridaylab.deeper.communication.DeeperModel;

class MainDeeperActivity$15
  implements DialogInterface.OnClickListener
{
  MainDeeperActivity$15(MainDeeperActivity paramMainDeeperActivity, DeeperModel paramDeeperModel) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.b.c(this.a.c());
    paramDialogInterface.cancel();
    MainDeeperActivity.d(this.b).b();
    this.b.w = false;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.MainDeeperActivity.15
 * JD-Core Version:    0.7.0.1
 */