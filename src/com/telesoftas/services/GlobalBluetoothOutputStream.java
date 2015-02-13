package com.telesoftas.services;

public class GlobalBluetoothOutputStream
{
  private static GlobalBluetoothOutputStream a;
  private GlobalBluetoothOutputStream.BytesReceiver b;
  
  public static GlobalBluetoothOutputStream a()
  {
    try
    {
      if (a == null) {
        a = new GlobalBluetoothOutputStream();
      }
      GlobalBluetoothOutputStream localGlobalBluetoothOutputStream = a;
      return localGlobalBluetoothOutputStream;
    }
    finally {}
  }
  
  public void a(GlobalBluetoothOutputStream.BytesReceiver paramBytesReceiver)
  {
    try
    {
      this.b = paramBytesReceiver;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    try
    {
      if (this.b != null) {
        this.b.a(paramArrayOfByte);
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  /* Error */
  public boolean b()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 19	com/telesoftas/services/GlobalBluetoothOutputStream:b	Lcom/telesoftas/services/GlobalBluetoothOutputStream$BytesReceiver;
    //   6: astore_2
    //   7: aload_2
    //   8: ifnull +9 -> 17
    //   11: iconst_1
    //   12: istore_3
    //   13: aload_0
    //   14: monitorexit
    //   15: iload_3
    //   16: ireturn
    //   17: iconst_0
    //   18: istore_3
    //   19: goto -6 -> 13
    //   22: astore_1
    //   23: aload_0
    //   24: monitorexit
    //   25: aload_1
    //   26: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	27	0	this	GlobalBluetoothOutputStream
    //   22	4	1	localObject	Object
    //   6	2	2	localBytesReceiver	GlobalBluetoothOutputStream.BytesReceiver
    //   12	7	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	7	22	finally
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.services.GlobalBluetoothOutputStream
 * JD-Core Version:    0.7.0.1
 */