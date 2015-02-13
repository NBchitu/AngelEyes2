package com.fridaylab.deeper.communication;

import android.content.Context;
import com.telesoftas.services.Signal;

public class TransmissionAssistant
{
  private final byte a = paramArrayOfByte1[1];
  private final byte[] b;
  private final byte[] c;
  private final byte[] d;
  private final byte[] e;
  private byte[] f;
  private byte[] g;
  private long h;
  private int i;
  
  public TransmissionAssistant(String paramString, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    this.b = paramArrayOfByte1;
    this.c = paramArrayOfByte2;
    byte[] arrayOfByte1 = new byte[1];
    arrayOfByte1[0] = this.b[3];
    this.d = arrayOfByte1;
    byte[] arrayOfByte2 = new byte[1];
    arrayOfByte2[0] = this.c[3];
    this.e = arrayOfByte2;
    this.i = 0;
  }
  
  public void a(Context paramContext, Signal paramSignal)
  {
    if (paramSignal.a(this.a, this.f, false))
    {
      this.g = this.f;
      this.i = 0;
    }
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == this.b)
    {
      this.f = this.d;
      this.g = null;
      this.h = System.nanoTime();
    }
    while (paramArrayOfByte != this.c) {
      return;
    }
    this.f = this.e;
    this.g = null;
    this.h = System.nanoTime();
  }
  
  public byte[] a()
  {
    if (b()) {}
    while (System.nanoTime() - this.h < 200000000L) {
      return null;
    }
    if (this.f == this.d) {}
    for (byte[] arrayOfByte1 = this.b;; arrayOfByte1 = null)
    {
      if (this.f == this.e) {
        arrayOfByte1 = this.c;
      }
      if (arrayOfByte1 != null)
      {
        this.i = (1 + this.i);
        if ((this.i == 2) || (this.i == 5))
        {
          byte[] arrayOfByte2 = new byte[250 + arrayOfByte1.length];
          System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 250, arrayOfByte1.length);
          return arrayOfByte2;
        }
        if ((this.i == 3) || (this.i == 6)) {
          break;
        }
      }
      return arrayOfByte1;
    }
  }
  
  public boolean b()
  {
    if (this.f == null) {}
    do
    {
      return true;
      if (this.g == null) {
        return false;
      }
    } while (this.f == this.g);
    return false;
  }
  
  public void c()
  {
    this.f = null;
    this.g = null;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.deeper.communication.TransmissionAssistant
 * JD-Core Version:    0.7.0.1
 */