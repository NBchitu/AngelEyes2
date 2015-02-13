package com.fridaylab.deeper.communication;

public class CommunicationProtocol$Recorder
  implements CommunicationProtocol
{
  private CommunicationProtocol$ConnectionInfo a = new CommunicationProtocol$ConnectionInfo(CommunicationProtocol.ConnectionState.g, DeeperModel.a);
  private int b = -1;
  private String c;
  private boolean d;
  
  public void a(CommunicationProtocol paramCommunicationProtocol)
  {
    if (this.b == 1) {
      paramCommunicationProtocol.a(this.c);
    }
    while (this.b != 2) {
      return;
    }
    paramCommunicationProtocol.a(this.c, this.d);
  }
  
  public void a(String paramString)
  {
    this.a = new CommunicationProtocol$ConnectionInfo(CommunicationProtocol$ConnectionState.c, DeeperModel.a);
    this.b = 1;
    this.c = paramString;
  }
  
  public void a(String paramString, boolean paramBoolean)
  {
    this.a = new CommunicationProtocol$ConnectionInfo(CommunicationProtocol$ConnectionState.c, DeeperModel.a);
    this.b = 2;
    this.c = paramString;
    this.d = paramBoolean;
  }
  
  public void b()
  {
    this.a = new CommunicationProtocol.ConnectionInfo(CommunicationProtocol.ConnectionState.g, DeeperModel.a);
    this.b = -1;
  }
  
  public CommunicationProtocol.ConnectionInfo c()
  {
    return this.a;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.deeper.communication.CommunicationProtocol.Recorder
 * JD-Core Version:    0.7.0.1
 */