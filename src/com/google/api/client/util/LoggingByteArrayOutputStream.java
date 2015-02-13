package com.google.api.client.util;

import com.google.common.base.Preconditions;
import java.io.ByteArrayOutputStream;
import java.text.NumberFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingByteArrayOutputStream
  extends ByteArrayOutputStream
{
  private int a;
  private final int b;
  private boolean c;
  private final Level d;
  private final Logger e;
  
  public LoggingByteArrayOutputStream(Logger paramLogger, Level paramLevel, int paramInt)
  {
    this.e = ((Logger)Preconditions.a(paramLogger));
    this.d = ((Level)Preconditions.a(paramLevel));
    if (paramInt >= 0) {}
    for (boolean bool = true;; bool = false)
    {
      Preconditions.a(bool);
      this.b = paramInt;
      return;
    }
  }
  
  private static void a(StringBuilder paramStringBuilder, int paramInt)
  {
    if (paramInt == 1)
    {
      paramStringBuilder.append("1 byte");
      return;
    }
    paramStringBuilder.append(NumberFormat.getInstance().format(paramInt)).append(" bytes");
  }
  
  public void close()
  {
    try
    {
      if (!this.c)
      {
        if (this.a != 0)
        {
          StringBuilder localStringBuilder = new StringBuilder().append("Total: ");
          a(localStringBuilder, this.a);
          if ((this.count != 0) && (this.count < this.a))
          {
            localStringBuilder.append(" (logging first ");
            a(localStringBuilder, this.count);
            localStringBuilder.append(")");
          }
          this.e.config(localStringBuilder.toString());
          if (this.count != 0) {
            this.e.log(this.d, toString("UTF-8").replaceAll("[\\x00-\\x09\\x0B\\x0C\\x0E-\\x1F\\x7F]", " "));
          }
        }
        this.c = true;
      }
      return;
    }
    finally {}
  }
  
  /* Error */
  public void write(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 60	com/google/api/client/util/LoggingByteArrayOutputStream:c	Z
    //   6: ifne +38 -> 44
    //   9: iconst_1
    //   10: istore_3
    //   11: iload_3
    //   12: invokestatic 34	com/google/common/base/Preconditions:a	(Z)V
    //   15: aload_0
    //   16: iconst_1
    //   17: aload_0
    //   18: getfield 62	com/google/api/client/util/LoggingByteArrayOutputStream:a	I
    //   21: iadd
    //   22: putfield 62	com/google/api/client/util/LoggingByteArrayOutputStream:a	I
    //   25: aload_0
    //   26: getfield 70	com/google/api/client/util/LoggingByteArrayOutputStream:count	I
    //   29: aload_0
    //   30: getfield 36	com/google/api/client/util/LoggingByteArrayOutputStream:b	I
    //   33: if_icmpge +8 -> 41
    //   36: aload_0
    //   37: iload_1
    //   38: invokespecial 105	java/io/ByteArrayOutputStream:write	(I)V
    //   41: aload_0
    //   42: monitorexit
    //   43: return
    //   44: iconst_0
    //   45: istore_3
    //   46: goto -35 -> 11
    //   49: astore_2
    //   50: aload_0
    //   51: monitorexit
    //   52: aload_2
    //   53: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	54	0	this	LoggingByteArrayOutputStream
    //   0	54	1	paramInt	int
    //   49	4	2	localObject	Object
    //   10	36	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	9	49	finally
    //   11	41	49	finally
  }
  
  /* Error */
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 60	com/google/api/client/util/LoggingByteArrayOutputStream:c	Z
    //   6: ifne +69 -> 75
    //   9: iconst_1
    //   10: istore 5
    //   12: iload 5
    //   14: invokestatic 34	com/google/common/base/Preconditions:a	(Z)V
    //   17: aload_0
    //   18: iload_3
    //   19: aload_0
    //   20: getfield 62	com/google/api/client/util/LoggingByteArrayOutputStream:a	I
    //   23: iadd
    //   24: putfield 62	com/google/api/client/util/LoggingByteArrayOutputStream:a	I
    //   27: aload_0
    //   28: getfield 70	com/google/api/client/util/LoggingByteArrayOutputStream:count	I
    //   31: aload_0
    //   32: getfield 36	com/google/api/client/util/LoggingByteArrayOutputStream:b	I
    //   35: if_icmpge +37 -> 72
    //   38: iload_3
    //   39: aload_0
    //   40: getfield 70	com/google/api/client/util/LoggingByteArrayOutputStream:count	I
    //   43: iadd
    //   44: istore 6
    //   46: iload 6
    //   48: aload_0
    //   49: getfield 36	com/google/api/client/util/LoggingByteArrayOutputStream:b	I
    //   52: if_icmple +13 -> 65
    //   55: iload_3
    //   56: aload_0
    //   57: getfield 36	com/google/api/client/util/LoggingByteArrayOutputStream:b	I
    //   60: iload 6
    //   62: isub
    //   63: iadd
    //   64: istore_3
    //   65: aload_0
    //   66: aload_1
    //   67: iload_2
    //   68: iload_3
    //   69: invokespecial 108	java/io/ByteArrayOutputStream:write	([BII)V
    //   72: aload_0
    //   73: monitorexit
    //   74: return
    //   75: iconst_0
    //   76: istore 5
    //   78: goto -66 -> 12
    //   81: astore 4
    //   83: aload_0
    //   84: monitorexit
    //   85: aload 4
    //   87: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	88	0	this	LoggingByteArrayOutputStream
    //   0	88	1	paramArrayOfByte	byte[]
    //   0	88	2	paramInt1	int
    //   0	88	3	paramInt2	int
    //   81	5	4	localObject	Object
    //   10	67	5	bool	boolean
    //   44	19	6	i	int
    // Exception table:
    //   from	to	target	type
    //   2	9	81	finally
    //   12	65	81	finally
    //   65	72	81	finally
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.util.LoggingByteArrayOutputStream
 * JD-Core Version:    0.7.0.1
 */