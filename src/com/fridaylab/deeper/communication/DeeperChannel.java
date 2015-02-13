package com.fridaylab.deeper.communication;

import com.google.common.base.Supplier;
import com.telesoftas.hardware.HardwareJni;

public class DeeperChannel
  implements Supplier<byte[]>
{
  private final ParseResult a = new ParseResult();
  private byte b = 0;
  
  public DeeperChannel()
  {
    a();
  }
  
  public void a() {}
  
  public void a(byte paramByte)
  {
    this.b = paramByte;
  }
  
  public void a(byte[] paramArrayOfByte, int paramInt, DeeperChannel.SignalObserver paramSignalObserver)
  {
    int i = 0;
    while (i < paramInt)
    {
      this.a.reset(this);
      if (HardwareJni.a(paramArrayOfByte, i, paramInt, this.b, this.a)) {
        paramSignalObserver.a(this.a.getSignal());
      }
      i += this.a.parsedLength();
    }
  }
  
  public byte[] b()
  {
    return new byte[1120];
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.deeper.communication.DeeperChannel
 * JD-Core Version:    0.7.0.1
 */