package com.fridaylab.deeper.communication;

import android.content.Context;
import com.telesoftas.services.GlobalBluetoothOutputStream.BytesReceiver;

public abstract interface DeeperOperator$Agent
  extends GlobalBluetoothOutputStream.BytesReceiver
{
  public abstract void a(byte paramByte);
  
  public abstract void a(DeeperOperator paramDeeperOperator);
  
  public abstract void a(boolean paramBoolean, float paramFloat);
  
  public abstract void f();
  
  public abstract boolean g();
  
  public abstract CommunicationHandler h();
  
  public abstract void i();
  
  public abstract Context j();
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.deeper.communication.DeeperOperator.Agent
 * JD-Core Version:    0.7.0.1
 */