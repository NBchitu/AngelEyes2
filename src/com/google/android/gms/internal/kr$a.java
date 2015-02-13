package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.HashMap;

public class kr$a<I, O>
  implements SafeParcelable
{
  public static final kt CREATOR = new kt();
  protected final int a;
  protected final boolean b;
  protected final int c;
  protected final boolean d;
  protected final String e;
  protected final int f;
  protected final Class<? extends kr> g;
  protected final String h;
  private final int i;
  private kv j;
  private kr.b<I, O> k;
  
  kr$a(int paramInt1, int paramInt2, boolean paramBoolean1, int paramInt3, boolean paramBoolean2, String paramString1, int paramInt4, String paramString2, km paramkm)
  {
    this.i = paramInt1;
    this.a = paramInt2;
    this.b = paramBoolean1;
    this.c = paramInt3;
    this.d = paramBoolean2;
    this.e = paramString1;
    this.f = paramInt4;
    if (paramString2 == null) {
      this.g = null;
    }
    for (this.h = null; paramkm == null; this.h = paramString2)
    {
      this.k = null;
      return;
      this.g = ky.class;
    }
    this.k = paramkm.c();
  }
  
  public int a()
  {
    return this.i;
  }
  
  public I a(O paramO)
  {
    return this.k.a(paramO);
  }
  
  public void a(kv paramkv)
  {
    this.j = paramkv;
  }
  
  public int b()
  {
    return this.a;
  }
  
  public boolean c()
  {
    return this.b;
  }
  
  public int d()
  {
    return this.c;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean e()
  {
    return this.d;
  }
  
  public String f()
  {
    return this.e;
  }
  
  public int g()
  {
    return this.f;
  }
  
  public Class<? extends kr> h()
  {
    return this.g;
  }
  
  String i()
  {
    if (this.h == null) {
      return null;
    }
    return this.h;
  }
  
  public boolean j()
  {
    return this.k != null;
  }
  
  km k()
  {
    if (this.k == null) {
      return null;
    }
    return km.a(this.k);
  }
  
  public HashMap<String, a<?, ?>> l()
  {
    jx.a(this.h);
    jx.a(this.j);
    return this.j.a(this.h);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder1 = new StringBuilder();
    localStringBuilder1.append("Field\n");
    localStringBuilder1.append("            versionCode=").append(this.i).append('\n');
    localStringBuilder1.append("                 typeIn=").append(this.a).append('\n');
    localStringBuilder1.append("            typeInArray=").append(this.b).append('\n');
    localStringBuilder1.append("                typeOut=").append(this.c).append('\n');
    localStringBuilder1.append("           typeOutArray=").append(this.d).append('\n');
    localStringBuilder1.append("        outputFieldName=").append(this.e).append('\n');
    localStringBuilder1.append("      safeParcelFieldId=").append(this.f).append('\n');
    localStringBuilder1.append("       concreteTypeName=").append(i()).append('\n');
    if (h() != null) {
      localStringBuilder1.append("     concreteType.class=").append(h().getCanonicalName()).append('\n');
    }
    StringBuilder localStringBuilder2 = localStringBuilder1.append("          converterName=");
    if (this.k == null) {}
    for (String str = "null";; str = this.k.getClass().getCanonicalName())
    {
      localStringBuilder2.append(str).append('\n');
      return localStringBuilder1.toString();
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    kt.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.kr.a
 * JD-Core Version:    0.7.0.1
 */