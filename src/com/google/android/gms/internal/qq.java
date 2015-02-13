package com.google.android.gms.internal;

public abstract class qq<M extends qq<M>>
  extends qw
{
  protected qs m;
  
  public void a(qp paramqp)
  {
    if (this.m == null) {}
    for (;;)
    {
      return;
      for (int i = 0; i < this.m.a(); i++) {
        this.m.a(i).a(paramqp);
      }
    }
  }
  
  protected final boolean a(M paramM)
  {
    if ((this.m == null) || (this.m.b())) {
      return (paramM.m == null) || (paramM.m.b());
    }
    return this.m.equals(paramM.m);
  }
  
  protected int c()
  {
    int i = 0;
    if (this.m != null)
    {
      j = 0;
      while (i < this.m.a())
      {
        j += this.m.a(i).a();
        i++;
      }
    }
    int j = 0;
    return j;
  }
  
  protected final int d()
  {
    if ((this.m == null) || (this.m.b())) {
      return 0;
    }
    return this.m.hashCode();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.qq
 * JD-Core Version:    0.7.0.1
 */