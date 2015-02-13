package com.fridaylab.deeper.communication;

import android.bluetooth.BluetoothSocket;
import com.fridaylab.util.ByteLogger;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

class BluetoothConnection
  extends Thread
{
  private static byte[] a = { 0 };
  private final BluetoothSocket b;
  private final InputStream c;
  private final OutputStream d;
  private final BluetoothConnection.Listener e;
  private boolean f = false;
  private volatile long g;
  
  public BluetoothConnection(BluetoothSocket paramBluetoothSocket, BluetoothConnection.Listener paramListener)
  {
    this.b = paramBluetoothSocket;
    this.e = paramListener;
    try
    {
      InputStream localInputStream2 = paramBluetoothSocket.getInputStream();
      localInputStream1 = localInputStream2;
    }
    catch (IOException localIOException1)
    {
      for (;;)
      {
        OutputStream localOutputStream2;
        label39:
        localOutputStream1 = null;
        InputStream localInputStream1 = null;
      }
    }
    try
    {
      localOutputStream2 = paramBluetoothSocket.getOutputStream();
      localOutputStream1 = localOutputStream2;
    }
    catch (IOException localIOException2)
    {
      localOutputStream1 = null;
      break label39;
    }
    this.c = localInputStream1;
    this.d = localOutputStream1;
    this.g = System.nanoTime();
  }
  
  public void a()
  {
    this.f = true;
    try
    {
      this.b.close();
      return;
    }
    catch (IOException localIOException) {}
  }
  
  public void a(long paramLong)
  {
    if (System.nanoTime() - this.g > paramLong) {
      a();
    }
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    a(paramArrayOfByte, paramArrayOfByte.length, true);
  }
  
  public void a(byte[] paramArrayOfByte, int paramInt, boolean paramBoolean)
  {
    if (paramBoolean) {}
    try
    {
      this.d.write(a);
      this.d.write(paramArrayOfByte, 0, paramInt);
      if (ByteLogger.a)
      {
        if (paramBoolean) {
          ByteLogger.a(a, 0, a.length);
        }
        ByteLogger.a(paramArrayOfByte, 0, paramInt);
      }
      return;
    }
    catch (IOException localIOException)
    {
      a();
    }
  }
  
  public void b(byte[] paramArrayOfByte)
  {
    a(paramArrayOfByte, paramArrayOfByte.length, false);
  }
  
  public void run()
  {
    setName("BluetoothConnection");
    byte[] arrayOfByte = new byte[1024];
    try
    {
      for (;;)
      {
        this.g = System.nanoTime();
        int i = this.c.read(arrayOfByte);
        this.e.a(arrayOfByte, i);
      }
      return;
    }
    catch (IOException localIOException)
    {
      if (!this.f) {
        a();
      }
      this.e.c();
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.deeper.communication.BluetoothConnection
 * JD-Core Version:    0.7.0.1
 */