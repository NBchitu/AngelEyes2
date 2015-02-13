package com.google.android.gms.internal;

public final class d$a
  extends qq<a>
{
  private static volatile a[] o;
  public int a;
  public String b;
  public a[] c;
  public a[] d;
  public a[] e;
  public String f;
  public String g;
  public long h;
  public boolean i;
  public a[] j;
  public int[] k;
  public boolean l;
  
  public d$a()
  {
    b();
  }
  
  public static a[] a()
  {
    if (o == null) {}
    synchronized (qu.a)
    {
      if (o == null) {
        o = new a[0];
      }
      return o;
    }
  }
  
  public void a(qp paramqp)
  {
    paramqp.a(1, this.a);
    if (!this.b.equals("")) {
      paramqp.a(2, this.b);
    }
    if ((this.c != null) && (this.c.length > 0)) {
      for (int i4 = 0; i4 < this.c.length; i4++)
      {
        a locala4 = this.c[i4];
        if (locala4 != null) {
          paramqp.a(3, locala4);
        }
      }
    }
    if ((this.d != null) && (this.d.length > 0)) {
      for (int i3 = 0; i3 < this.d.length; i3++)
      {
        a locala3 = this.d[i3];
        if (locala3 != null) {
          paramqp.a(4, locala3);
        }
      }
    }
    if ((this.e != null) && (this.e.length > 0)) {
      for (int i2 = 0; i2 < this.e.length; i2++)
      {
        a locala2 = this.e[i2];
        if (locala2 != null) {
          paramqp.a(5, locala2);
        }
      }
    }
    if (!this.f.equals("")) {
      paramqp.a(6, this.f);
    }
    if (!this.g.equals("")) {
      paramqp.a(7, this.g);
    }
    if (this.h != 0L) {
      paramqp.a(8, this.h);
    }
    if (this.l) {
      paramqp.a(9, this.l);
    }
    if ((this.k != null) && (this.k.length > 0)) {
      for (int i1 = 0; i1 < this.k.length; i1++) {
        paramqp.a(10, this.k[i1]);
      }
    }
    if (this.j != null)
    {
      int m = this.j.length;
      int n = 0;
      if (m > 0) {
        while (n < this.j.length)
        {
          a locala1 = this.j[n];
          if (locala1 != null) {
            paramqp.a(11, locala1);
          }
          n++;
        }
      }
    }
    if (this.i) {
      paramqp.a(12, this.i);
    }
    super.a(paramqp);
  }
  
  public a b()
  {
    this.a = 1;
    this.b = "";
    this.c = a();
    this.d = a();
    this.e = a();
    this.f = "";
    this.g = "";
    this.h = 0L;
    this.i = false;
    this.j = a();
    this.k = qz.a;
    this.l = false;
    this.m = null;
    this.n = -1;
    return this;
  }
  
  protected int c()
  {
    int m = super.c() + qp.b(1, this.a);
    if (!this.b.equals("")) {
      m += qp.b(2, this.b);
    }
    if ((this.c != null) && (this.c.length > 0))
    {
      int i8 = m;
      for (int i9 = 0; i9 < this.c.length; i9++)
      {
        a locala4 = this.c[i9];
        if (locala4 != null) {
          i8 += qp.c(3, locala4);
        }
      }
      m = i8;
    }
    if ((this.d != null) && (this.d.length > 0))
    {
      int i6 = m;
      for (int i7 = 0; i7 < this.d.length; i7++)
      {
        a locala3 = this.d[i7];
        if (locala3 != null) {
          i6 += qp.c(4, locala3);
        }
      }
      m = i6;
    }
    if ((this.e != null) && (this.e.length > 0))
    {
      int i4 = m;
      for (int i5 = 0; i5 < this.e.length; i5++)
      {
        a locala2 = this.e[i5];
        if (locala2 != null) {
          i4 += qp.c(5, locala2);
        }
      }
      m = i4;
    }
    if (!this.f.equals("")) {
      m += qp.b(6, this.f);
    }
    if (!this.g.equals("")) {
      m += qp.b(7, this.g);
    }
    if (this.h != 0L) {
      m += qp.b(8, this.h);
    }
    if (this.l) {
      m += qp.b(9, this.l);
    }
    if ((this.k != null) && (this.k.length > 0))
    {
      int i2 = 0;
      int i3 = 0;
      while (i2 < this.k.length)
      {
        i3 += qp.b(this.k[i2]);
        i2++;
      }
      m = m + i3 + 1 * this.k.length;
    }
    if (this.j != null)
    {
      int n = this.j.length;
      int i1 = 0;
      if (n > 0) {
        while (i1 < this.j.length)
        {
          a locala1 = this.j[i1];
          if (locala1 != null) {
            m += qp.c(11, locala1);
          }
          i1++;
        }
      }
    }
    if (this.i) {
      m += qp.b(12, this.i);
    }
    return m;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool2;
    if (paramObject == this) {
      bool2 = true;
    }
    a locala;
    label69:
    do
    {
      String str2;
      do
      {
        boolean bool5;
        do
        {
          boolean bool4;
          do
          {
            boolean bool3;
            do
            {
              String str3;
              do
              {
                int m;
                int n;
                do
                {
                  boolean bool1;
                  do
                  {
                    return bool2;
                    bool1 = paramObject instanceof a;
                    bool2 = false;
                  } while (!bool1);
                  locala = (a)paramObject;
                  m = this.a;
                  n = locala.a;
                  bool2 = false;
                } while (m != n);
                if (this.b != null) {
                  break;
                }
                str3 = locala.b;
                bool2 = false;
              } while (str3 != null);
              bool3 = qu.a(this.c, locala.c);
              bool2 = false;
            } while (!bool3);
            bool4 = qu.a(this.d, locala.d);
            bool2 = false;
          } while (!bool4);
          bool5 = qu.a(this.e, locala.e);
          bool2 = false;
        } while (!bool5);
        if (this.f != null) {
          break label303;
        }
        str2 = locala.f;
        bool2 = false;
      } while (str2 != null);
      if (this.g != null) {
        break label320;
      }
      str1 = locala.g;
      bool2 = false;
    } while (str1 != null);
    label153:
    label303:
    label320:
    while (this.g.equals(locala.g))
    {
      String str1;
      boolean bool6 = this.h < locala.h;
      bool2 = false;
      if (bool6) {
        break;
      }
      boolean bool7 = this.i;
      boolean bool8 = locala.i;
      bool2 = false;
      if (bool7 != bool8) {
        break;
      }
      boolean bool9 = qu.a(this.j, locala.j);
      bool2 = false;
      if (!bool9) {
        break;
      }
      boolean bool10 = qu.a(this.k, locala.k);
      bool2 = false;
      if (!bool10) {
        break;
      }
      boolean bool11 = this.l;
      boolean bool12 = locala.l;
      bool2 = false;
      if (bool11 != bool12) {
        break;
      }
      return a(locala);
      if (this.b.equals(locala.b)) {
        break label69;
      }
      return false;
      if (this.f.equals(locala.f)) {
        break label153;
      }
      return false;
    }
    return false;
  }
  
  public int hashCode()
  {
    int m = 1231;
    int n = 31 * (527 + this.a);
    int i1;
    int i3;
    label76:
    int i5;
    label100:
    int i7;
    label137:
    int i8;
    if (this.b == null)
    {
      i1 = 0;
      int i2 = 31 * (31 * (31 * (31 * (i1 + n) + qu.a(this.c)) + qu.a(this.d)) + qu.a(this.e));
      if (this.f != null) {
        break label200;
      }
      i3 = 0;
      int i4 = 31 * (i3 + i2);
      String str = this.g;
      i5 = 0;
      if (str != null) {
        break label212;
      }
      int i6 = 31 * (31 * (i4 + i5) + (int)(this.h ^ this.h >>> 32));
      if (!this.i) {
        break label224;
      }
      i7 = m;
      i8 = 31 * (31 * (31 * (i7 + i6) + qu.a(this.j)) + qu.a(this.k));
      if (!this.l) {
        break label232;
      }
    }
    for (;;)
    {
      return 31 * (i8 + m) + d();
      i1 = this.b.hashCode();
      break;
      label200:
      i3 = this.f.hashCode();
      break label76;
      label212:
      i5 = this.g.hashCode();
      break label100;
      label224:
      i7 = 1237;
      break label137;
      label232:
      m = 1237;
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.d.a
 * JD-Core Version:    0.7.0.1
 */