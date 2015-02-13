package com.google.android.gms.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class qt
{
  private qr<?, ?> a;
  private Object b;
  private List<qy> c = new ArrayList();
  
  private byte[] b()
  {
    byte[] arrayOfByte = new byte[a()];
    a(qp.a(arrayOfByte));
    return arrayOfByte;
  }
  
  int a()
  {
    int i;
    if (this.b != null) {
      i = this.a.a(this.b);
    }
    for (;;)
    {
      return i;
      Iterator localIterator = this.c.iterator();
      i = 0;
      while (localIterator.hasNext()) {
        i += ((qy)localIterator.next()).a();
      }
    }
  }
  
  void a(qp paramqp)
  {
    if (this.b != null) {
      this.a.a(this.b, paramqp);
    }
    for (;;)
    {
      return;
      Iterator localIterator = this.c.iterator();
      while (localIterator.hasNext()) {
        ((qy)localIterator.next()).a(paramqp);
      }
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool2;
    if (paramObject == this) {
      bool2 = true;
    }
    qt localqt;
    qr localqr1;
    qr localqr2;
    do
    {
      boolean bool1;
      do
      {
        return bool2;
        bool1 = paramObject instanceof qt;
        bool2 = false;
      } while (!bool1);
      localqt = (qt)paramObject;
      if ((this.b == null) || (localqt.b == null)) {
        break;
      }
      localqr1 = this.a;
      localqr2 = localqt.a;
      bool2 = false;
    } while (localqr1 != localqr2);
    if (!this.a.b.isArray()) {
      return this.b.equals(localqt.b);
    }
    if ((this.b instanceof byte[])) {
      return Arrays.equals((byte[])this.b, (byte[])localqt.b);
    }
    if ((this.b instanceof int[])) {
      return Arrays.equals((int[])this.b, (int[])localqt.b);
    }
    if ((this.b instanceof long[])) {
      return Arrays.equals((long[])this.b, (long[])localqt.b);
    }
    if ((this.b instanceof float[])) {
      return Arrays.equals((float[])this.b, (float[])localqt.b);
    }
    if ((this.b instanceof double[])) {
      return Arrays.equals((double[])this.b, (double[])localqt.b);
    }
    if ((this.b instanceof boolean[])) {
      return Arrays.equals((boolean[])this.b, (boolean[])localqt.b);
    }
    return Arrays.deepEquals((Object[])this.b, (Object[])localqt.b);
    if ((this.c != null) && (localqt.c != null)) {
      return this.c.equals(localqt.c);
    }
    try
    {
      boolean bool3 = Arrays.equals(b(), localqt.b());
      return bool3;
    }
    catch (IOException localIOException)
    {
      throw new IllegalStateException(localIOException);
    }
  }
  
  public int hashCode()
  {
    try
    {
      int i = Arrays.hashCode(b());
      return i + 527;
    }
    catch (IOException localIOException)
    {
      throw new IllegalStateException(localIOException);
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.qt
 * JD-Core Version:    0.7.0.1
 */