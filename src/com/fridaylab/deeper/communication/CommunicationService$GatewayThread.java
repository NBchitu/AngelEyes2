package com.fridaylab.deeper.communication;

import android.os.Looper;
import java.util.concurrent.LinkedBlockingQueue;

class CommunicationService$GatewayThread
  extends Thread
{
  private final CommunicationService a;
  private CommunicationHandler b;
  private final LinkedBlockingQueue<CommunicationHandler> c = new LinkedBlockingQueue();
  
  public CommunicationService$GatewayThread(CommunicationService paramCommunicationService)
  {
    this.a = paramCommunicationService;
  }
  
  public CommunicationHandler a()
  {
    if (this.b != null) {
      return this.b;
    }
    try
    {
      CommunicationHandler localCommunicationHandler = (CommunicationHandler)this.c.take();
      return localCommunicationHandler;
    }
    catch (InterruptedException localInterruptedException)
    {
      throw new Error("LinkedBlockingQueue failed", localInterruptedException);
    }
  }
  
  public void run()
  {
    setName("BluetoothGateway");
    Looper.prepare();
    try
    {
      this.b = new CommunicationHandler(this.a);
      this.c.put(this.b);
      Looper.loop();
      CommunicationService.a(this.a);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      throw new Error("LinkedBlockingQueue failed", localInterruptedException);
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.deeper.communication.CommunicationService.GatewayThread
 * JD-Core Version:    0.7.0.1
 */