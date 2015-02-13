package com.fridaylab.deeper.communication;

import android.os.Binder;
import android.os.Message;

public class CommunicationGateway
  extends Binder
  implements CommunicationProtocol
{
  private final CommunicationHandler a;
  
  CommunicationGateway(CommunicationHandler paramCommunicationHandler)
  {
    this.a = paramCommunicationHandler;
  }
  
  public void a()
  {
    this.a.obtainMessage(504).sendToTarget();
  }
  
  public void a(String paramString)
  {
    this.a.obtainMessage(501, 3, 1, paramString).sendToTarget();
  }
  
  public void a(String paramString, boolean paramBoolean)
  {
    CommunicationHandler localCommunicationHandler = this.a;
    if (paramBoolean) {}
    for (int i = 0;; i = 1)
    {
      localCommunicationHandler.obtainMessage(502, i, 0, paramString).sendToTarget();
      return;
    }
  }
  
  public void b()
  {
    this.a.obtainMessage(503).sendToTarget();
  }
  
  public CommunicationProtocol.ConnectionInfo c()
  {
    return this.a.a();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.deeper.communication.CommunicationGateway
 * JD-Core Version:    0.7.0.1
 */