package com.fridaylab.deeper.communication;

import android.content.Context;
import android.content.res.Resources;
import android.util.SparseArray;
import com.fridaylab.util.Flog;
import com.telesoftas.hardware.HardwareJni;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public abstract class DeeperUpdateFirmware
  extends DeeperOperator
{
  public static final byte[] e = ".OK".getBytes();
  public static final byte[] f = ".NEXT".getBytes();
  public static final byte[] g = ".ERROR".getBytes();
  public static final byte[] h = ".DONE".getBytes();
  public static final SparseArray<byte[]> i = new SparseArray(3);
  private InputStream d;
  private final byte[] j = new byte['ð'];
  private final byte[] k = new byte[260];
  private boolean l;
  private float m;
  private float n;
  private final float o;
  private final float p;
  
  static
  {
    i.append(2131034112, new byte[] { -96, -115, 0, 0 });
    i.append(2131034113, new byte[] { 96, 117, 0, 0 });
    i.append(2131034114, new byte[] { 96, 91, 0, 0 });
  }
  
  public DeeperUpdateFirmware(DeeperOperator paramDeeperOperator, float paramFloat1, float paramFloat2)
  {
    super(paramDeeperOperator);
    this.o = paramFloat1;
    this.p = (paramFloat2 - paramFloat1);
  }
  
  private void i()
  {
    if (this.d == null)
    {
      this.d = this.b.j().getResources().openRawResource(f());
      this.l = false;
    }
    if (!this.l)
    {
      byte[] arrayOfByte2 = h();
      byte[] arrayOfByte3 = HardwareJni.a((byte)7, arrayOfByte2);
      this.a.b(arrayOfByte3);
      this.l = true;
      this.n = (3 + (0xFF & arrayOfByte2[1]));
      this.m = 0.0F;
      HardwareJni.initFirmwareSlicing();
      return;
    }
    int i1 = 1;
    while (i1 != 0)
    {
      int i2 = this.d.read(this.j);
      if (i2 < 0)
      {
        i2 = 0;
        i1 = 0;
      }
      int i3 = HardwareJni.a(this.j, i2, this.k);
      if (i3 > 0)
      {
        if (i3 == this.k.length) {}
        for (byte[] arrayOfByte1 = this.k;; arrayOfByte1 = Arrays.copyOf(this.k, i3))
        {
          this.a.b(arrayOfByte1);
          this.m = (1.0F + this.m);
          i1 = 0;
          break;
        }
      }
    }
    this.b.a(true, this.o + this.m / this.n * this.p);
  }
  
  public void a()
  {
    super.a();
    this.b.a(true, this.o);
    g();
  }
  
  public void b()
  {
    super.b();
    if (this.d != null) {}
    try
    {
      this.d.close();
      return;
    }
    catch (IOException localIOException)
    {
      Flog.a("failed to close asset stream", localIOException);
      return;
    }
    finally
    {
      this.d = null;
    }
  }
  
  public void c()
  {
    super.c();
  }
  
  public int e()
  {
    return 100;
  }
  
  protected abstract int f();
  
  /* Error */
  protected void g()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 172	com/fridaylab/deeper/communication/DeeperUpdateFirmware:i	()V
    //   4: return
    //   5: astore_1
    //   6: aload_0
    //   7: getfield 82	com/fridaylab/deeper/communication/DeeperUpdateFirmware:d	Ljava/io/InputStream;
    //   10: invokevirtual 160	java/io/InputStream:close	()V
    //   13: aload_0
    //   14: aconst_null
    //   15: putfield 82	com/fridaylab/deeper/communication/DeeperUpdateFirmware:d	Ljava/io/InputStream;
    //   18: aload_0
    //   19: iconst_0
    //   20: putfield 108	com/fridaylab/deeper/communication/DeeperUpdateFirmware:l	Z
    //   23: aload_0
    //   24: getfield 119	com/fridaylab/deeper/communication/DeeperUpdateFirmware:a	Lcom/fridaylab/deeper/communication/BluetoothConnection;
    //   27: invokevirtual 173	com/fridaylab/deeper/communication/BluetoothConnection:a	()V
    //   30: return
    //   31: astore_3
    //   32: aload_0
    //   33: aconst_null
    //   34: putfield 82	com/fridaylab/deeper/communication/DeeperUpdateFirmware:d	Ljava/io/InputStream;
    //   37: aload_0
    //   38: iconst_0
    //   39: putfield 108	com/fridaylab/deeper/communication/DeeperUpdateFirmware:l	Z
    //   42: aload_0
    //   43: getfield 119	com/fridaylab/deeper/communication/DeeperUpdateFirmware:a	Lcom/fridaylab/deeper/communication/BluetoothConnection;
    //   46: invokevirtual 173	com/fridaylab/deeper/communication/BluetoothConnection:a	()V
    //   49: return
    //   50: astore_2
    //   51: aload_0
    //   52: aconst_null
    //   53: putfield 82	com/fridaylab/deeper/communication/DeeperUpdateFirmware:d	Ljava/io/InputStream;
    //   56: aload_0
    //   57: iconst_0
    //   58: putfield 108	com/fridaylab/deeper/communication/DeeperUpdateFirmware:l	Z
    //   61: aload_0
    //   62: getfield 119	com/fridaylab/deeper/communication/DeeperUpdateFirmware:a	Lcom/fridaylab/deeper/communication/BluetoothConnection;
    //   65: invokevirtual 173	com/fridaylab/deeper/communication/BluetoothConnection:a	()V
    //   68: aload_2
    //   69: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	70	0	this	DeeperUpdateFirmware
    //   5	1	1	localIOException1	IOException
    //   50	19	2	localObject	Object
    //   31	1	3	localIOException2	IOException
    // Exception table:
    //   from	to	target	type
    //   0	4	5	java/io/IOException
    //   6	13	31	java/io/IOException
    //   6	13	50	finally
  }
  
  public byte[] h()
  {
    return (byte[])i.get(f(), new byte[] { -1, 0, 0, 0 });
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.deeper.communication.DeeperUpdateFirmware
 * JD-Core Version:    0.7.0.1
 */