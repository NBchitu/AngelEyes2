package com.google.android.gms.internal;

import java.util.Arrays;

final class qy
{
  final int a;
  final byte[] b;
  
  int a()
  {
    return 0 + qp.f(this.a) + this.b.length;
  }
  
  void a(qp paramqp)
  {
    paramqp.e(this.a);
    paramqp.b(this.b);
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    qy localqy;
    do
    {
      return true;
      if (!(paramObject instanceof qy)) {
        return false;
      }
      localqy = (qy)paramObject;
    } while ((this.a == localqy.a) && (Arrays.equals(this.b, localqy.b)));
    return false;
  }
  
  public int hashCode()
  {
    return 31 * (527 + this.a) + Arrays.hashCode(this.b);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.qy
 * JD-Core Version:    0.7.0.1
 */