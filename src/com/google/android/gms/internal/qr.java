package com.google.android.gms.internal;

import java.io.IOException;
import java.lang.reflect.Array;

public class qr<M extends qq<M>, T>
{
  protected final int a;
  protected final Class<T> b;
  public final int c;
  protected final boolean d;
  
  int a(Object paramObject)
  {
    if (this.d) {
      return b(paramObject);
    }
    return c(paramObject);
  }
  
  void a(Object paramObject, qp paramqp)
  {
    if (this.d)
    {
      c(paramObject, paramqp);
      return;
    }
    b(paramObject, paramqp);
  }
  
  protected int b(Object paramObject)
  {
    int i = 0;
    int j = Array.getLength(paramObject);
    for (int k = 0; k < j; k++) {
      if (Array.get(paramObject, k) != null) {
        i += c(Array.get(paramObject, k));
      }
    }
    return i;
  }
  
  protected void b(Object paramObject, qp paramqp)
  {
    try
    {
      paramqp.e(this.c);
      switch (this.a)
      {
      default: 
        throw new IllegalArgumentException("Unknown type " + this.a);
      }
    }
    catch (IOException localIOException)
    {
      throw new IllegalStateException(localIOException);
    }
    qw localqw = (qw)paramObject;
    int i = qz.a(this.c);
    paramqp.a(localqw);
    paramqp.c(i, 4);
    return;
    paramqp.b((qw)paramObject);
  }
  
  protected int c(Object paramObject)
  {
    int i = qz.a(this.c);
    switch (this.a)
    {
    default: 
      throw new IllegalArgumentException("Unknown type " + this.a);
    case 10: 
      return qp.b(i, (qw)paramObject);
    }
    return qp.c(i, (qw)paramObject);
  }
  
  protected void c(Object paramObject, qp paramqp)
  {
    int i = Array.getLength(paramObject);
    for (int j = 0; j < i; j++)
    {
      Object localObject = Array.get(paramObject, j);
      if (localObject != null) {
        b(localObject, paramqp);
      }
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.qr
 * JD-Core Version:    0.7.0.1
 */