package com.telesoftas.deeper.activities;

import com.fridaylab.deeper.communication.CommunicationProtocol;
import com.fridaylab.deeper.communication.CommunicationProtocol.ConnectionInfo;
import com.fridaylab.deeper.communication.CommunicationProtocol.ConnectionState;
import com.telesoftas.deeper.DeeperApplication;
import com.telesoftas.services.DeeperDeviceManager;

class MainDeeperActivity$13$1
  implements Runnable
{
  MainDeeperActivity$13$1(MainDeeperActivity.13 param13) {}
  
  public void run()
  {
    if (this.a.a.I.d().b() != null)
    {
      this.a.a.a(new CommunicationProtocol.ConnectionInfo(CommunicationProtocol.ConnectionState.f, null), true);
      return;
    }
    this.a.a.a(MainDeeperActivity.d(this.a.a).c(), true);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.MainDeeperActivity.13.1
 * JD-Core Version:    0.7.0.1
 */