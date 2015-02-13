package com.telesoftas.hardware;

import com.telesoftas.services.Signal;
import java.util.Arrays;

public class NotificationPacket
  extends Signal
{
  public final int a;
  public final byte[] b;
  
  public NotificationPacket(int paramInt, byte[] paramArrayOfByte)
  {
    this.a = paramInt;
    this.b = paramArrayOfByte;
  }
  
  public boolean a(byte paramByte1, byte paramByte2)
  {
    int i = 1;
    int k = paramByte1 & 0xFF;
    if (this.a != k) {}
    while (this.b.length != i) {
      return false;
    }
    if (this.b[0] == paramByte2) {}
    for (;;)
    {
      return i;
      int j = 0;
    }
  }
  
  public boolean a(byte paramByte1, byte paramByte2, byte paramByte3)
  {
    int i = paramByte1 & 0xFF;
    if (this.a != i) {}
    while ((this.b.length != 1) || ((this.b[0] != paramByte2) && (this.b[0] != paramByte3))) {
      return false;
    }
    return true;
  }
  
  public boolean a(byte paramByte, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    int i = paramByte & 0xFF;
    if (this.a != i) {}
    int j;
    int k;
    do
    {
      return false;
      if (paramArrayOfByte == c) {
        return true;
      }
      if (!paramBoolean) {
        return Arrays.equals(this.b, paramArrayOfByte);
      }
      for (j = this.b.length; (j > 0) && (this.b[(j - 1)] == 0); j--) {}
      for (k = paramArrayOfByte.length; (k > 0) && (paramArrayOfByte[(k - 1)] == 0); k--) {}
    } while (j != k);
    for (int m = 0;; m++)
    {
      if (m >= k) {
        break label131;
      }
      if (this.b[m] != paramArrayOfByte[m]) {
        break;
      }
    }
    label131:
    return true;
  }
  
  public int c()
  {
    return 0;
  }
  
  public String d()
  {
    return "info packet";
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.hardware.NotificationPacket
 * JD-Core Version:    0.7.0.1
 */