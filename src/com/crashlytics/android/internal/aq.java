package com.crashlytics.android.internal;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.logging.Level;
import java.util.logging.Logger;

public class aq
  implements Closeable
{
  private static final Logger a = Logger.getLogger(aq.class.getName());
  private final RandomAccessFile b;
  private int c;
  private int d;
  private as e;
  private as f;
  private final byte[] g = new byte[16];
  
  public aq(File paramFile)
  {
    if (!paramFile.exists())
    {
      File localFile = new File(paramFile.getPath() + ".tmp");
      RandomAccessFile localRandomAccessFile = a(localFile);
      try
      {
        localRandomAccessFile.setLength(4096L);
        localRandomAccessFile.seek(0L);
        byte[] arrayOfByte = new byte[16];
        a(arrayOfByte, new int[] { 4096, 0, 0, 0 });
        localRandomAccessFile.write(arrayOfByte);
        localRandomAccessFile.close();
        if (!localFile.renameTo(paramFile)) {
          throw new IOException("Rename failed!");
        }
      }
      finally
      {
        localRandomAccessFile.close();
      }
    }
    this.b = a(paramFile);
    this.b.seek(0L);
    this.b.readFully(this.g);
    this.c = a(this.g, 0);
    if (this.c > this.b.length()) {
      throw new IOException("File is truncated. Expected length: " + this.c + ", Actual length: " + this.b.length());
    }
    this.d = a(this.g, 4);
    int i = a(this.g, 8);
    int j = a(this.g, 12);
    this.e = a(i);
    this.f = a(j);
  }
  
  private static int a(byte[] paramArrayOfByte, int paramInt)
  {
    return ((0xFF & paramArrayOfByte[paramInt]) << 24) + ((0xFF & paramArrayOfByte[(paramInt + 1)]) << 16) + ((0xFF & paramArrayOfByte[(paramInt + 2)]) << 8) + (0xFF & paramArrayOfByte[(paramInt + 3)]);
  }
  
  private as a(int paramInt)
  {
    if (paramInt == 0) {
      return as.a;
    }
    this.b.seek(paramInt);
    return new as(paramInt, this.b.readInt());
  }
  
  private static RandomAccessFile a(File paramFile)
  {
    return new RandomAccessFile(paramFile, "rwd");
  }
  
  private void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    a(this.g, new int[] { paramInt1, paramInt2, paramInt3, paramInt4 });
    this.b.seek(0L);
    this.b.write(this.g);
  }
  
  private void a(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    int i = b(paramInt1);
    if (i + paramInt3 <= this.c)
    {
      this.b.seek(i);
      this.b.write(paramArrayOfByte, paramInt2, paramInt3);
      return;
    }
    int j = this.c - i;
    this.b.seek(i);
    this.b.write(paramArrayOfByte, paramInt2, j);
    this.b.seek(16L);
    this.b.write(paramArrayOfByte, paramInt2 + j, paramInt3 - j);
  }
  
  private static void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    paramArrayOfByte[paramInt1] = ((byte)(paramInt2 >> 24));
    paramArrayOfByte[(paramInt1 + 1)] = ((byte)(paramInt2 >> 16));
    paramArrayOfByte[(paramInt1 + 2)] = ((byte)(paramInt2 >> 8));
    paramArrayOfByte[(paramInt1 + 3)] = ((byte)paramInt2);
  }
  
  private static void a(byte[] paramArrayOfByte, int... paramVarArgs)
  {
    int i = 0;
    int j = paramVarArgs.length;
    int k = 0;
    while (i < j)
    {
      a(paramArrayOfByte, k, paramVarArgs[i]);
      k += 4;
      i++;
    }
  }
  
  private int b(int paramInt)
  {
    if (paramInt < this.c) {
      return paramInt;
    }
    return paramInt + 16 - this.c;
  }
  
  private static <T> T b(T paramT, String paramString)
  {
    if (paramT == null) {
      throw new NullPointerException(paramString);
    }
    return paramT;
  }
  
  private void b(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    int i = b(paramInt1);
    if (i + paramInt3 <= this.c)
    {
      this.b.seek(i);
      this.b.readFully(paramArrayOfByte, paramInt2, paramInt3);
      return;
    }
    int j = this.c - i;
    this.b.seek(i);
    this.b.readFully(paramArrayOfByte, paramInt2, j);
    this.b.seek(16L);
    this.b.readFully(paramArrayOfByte, paramInt2 + j, paramInt3 - j);
  }
  
  private void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      b(paramArrayOfByte, "buffer");
      if (((paramInt2 | 0x0) < 0) || (paramInt2 > paramArrayOfByte.length)) {
        throw new IndexOutOfBoundsException();
      }
    }
    finally {}
    c(paramInt2);
    boolean bool = b();
    int i;
    as localas;
    if (bool)
    {
      i = 16;
      localas = new as(i, paramInt2);
      a(this.g, 0, paramInt2);
      a(localas.b, this.g, 0, 4);
      a(4 + localas.b, paramArrayOfByte, 0, paramInt2);
      if (!bool) {
        break label197;
      }
    }
    label197:
    for (int j = localas.b;; j = this.e.b)
    {
      a(this.c, 1 + this.d, j, localas.b);
      this.f = localas;
      this.d = (1 + this.d);
      if (bool) {
        this.e = this.f;
      }
      return;
      i = b(4 + this.f.b + this.f.c);
      break;
    }
  }
  
  private void c(int paramInt)
  {
    int i = paramInt + 4;
    int j = this.c - a();
    if (j >= i) {
      return;
    }
    int k = this.c;
    do
    {
      j += k;
      k <<= 1;
    } while (j < i);
    d(k);
    int m = b(4 + this.f.b + this.f.c);
    if (m < this.e.b)
    {
      FileChannel localFileChannel = this.b.getChannel();
      localFileChannel.position(this.c);
      int i1 = m - 4;
      if (localFileChannel.transferTo(16L, i1, localFileChannel) != i1) {
        throw new AssertionError("Copied insufficient number of bytes!");
      }
    }
    if (this.f.b < this.e.b)
    {
      int n = -16 + (this.c + this.f.b);
      a(k, this.d, this.e.b, n);
      this.f = new as(n, this.f.c);
    }
    for (;;)
    {
      this.c = k;
      return;
      a(k, this.d, this.e.b, this.f.b);
    }
  }
  
  private void d(int paramInt)
  {
    this.b.setLength(paramInt);
    this.b.getChannel().force(true);
  }
  
  public final int a()
  {
    if (this.d == 0) {
      return 16;
    }
    if (this.f.b >= this.e.b) {
      return 16 + (4 + (this.f.b - this.e.b) + this.f.c);
    }
    return 4 + this.f.b + this.f.c + this.c - this.e.b;
  }
  
  public final void a(au paramau)
  {
    int i = 0;
    try
    {
      int j = this.e.b;
      while (i < this.d)
      {
        as localas = a(j);
        paramau.a(new at(this, localas, (byte)0), localas.c);
        int k = b(4 + localas.b + localas.c);
        j = k;
        i++;
      }
      return;
    }
    finally {}
  }
  
  public final void a(byte[] paramArrayOfByte)
  {
    b(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public final boolean a(int paramInt1, int paramInt2)
  {
    return paramInt1 + (4 + a()) <= paramInt2;
  }
  
  /* Error */
  public final boolean b()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 124	com/crashlytics/android/internal/aq:d	I
    //   6: istore_2
    //   7: iload_2
    //   8: ifne +9 -> 17
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
    //   0	27	0	this	aq
    //   22	4	1	localObject	Object
    //   6	2	2	i	int
    //   12	7	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	7	22	finally
  }
  
  public void close()
  {
    try
    {
      this.b.close();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(getClass().getSimpleName()).append('[');
    localStringBuilder.append("fileLength=").append(this.c);
    localStringBuilder.append(", size=").append(this.d);
    localStringBuilder.append(", first=").append(this.e);
    localStringBuilder.append(", last=").append(this.f);
    localStringBuilder.append(", element lengths=[");
    try
    {
      a(new ar(this, localStringBuilder));
      localStringBuilder.append("]]");
      return localStringBuilder.toString();
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        a.log(Level.WARNING, "read error", localIOException);
      }
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.crashlytics.android.internal.aq
 * JD-Core Version:    0.7.0.1
 */