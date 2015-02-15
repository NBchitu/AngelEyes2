package com.fridaylab.deeper.communication;

import android.content.IntentFilter;
import android.os.Message;

public abstract class BluetoothAgent
{
  protected static final IntentFilter a = new IntentFilter();
  protected boolean b;
  protected final CommunicationHandler c;
  
  static
  {
    a.addAction("android.bluetooth.device.action.ACL_CONNECTED");
  }
  
  BluetoothAgent(CommunicationHandler paramCommunicationHandler)
  {
    this.c = paramCommunicationHandler;
    this.b = false;
  }
  
  public abstract void a();
  
  public void a(CommunicationProtocol$ConnectionState paramConnectionState, DeeperModel paramDeeperModel)
  {
    this.c.a(paramConnectionState, paramDeeperModel);
  }
  
  public boolean a_()
  {
    return this.b;
  }
  
  public void b()
  {
    this.b = true;
  }
  
  public void b(CommunicationProtocol$ConnectionState paramConnectionState, DeeperModel paramDeeperModel)
  {
    this.c.obtainMessage(802, paramConnectionState.ordinal(), 0, paramDeeperModel).sendToTarget();
  }
  
  public void d()
  {
    this.c.obtainMessage(801, this).sendToTarget();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.deeper.communication.BluetoothAgent
 * JD-Core Version:    0.7.0.1
 */