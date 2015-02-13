package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class ky
  extends kr
  implements SafeParcelable
{
  public static final kz CREATOR = new kz();
  private final int a;
  private final Parcel b;
  private final int c;
  private final kv d;
  private final String e;
  private int f;
  private int g;
  
  ky(int paramInt, Parcel paramParcel, kv paramkv)
  {
    this.a = paramInt;
    this.b = ((Parcel)jx.a(paramParcel));
    this.c = 2;
    this.d = paramkv;
    if (this.d == null) {}
    for (this.e = null;; this.e = this.d.d())
    {
      this.f = 2;
      return;
    }
  }
  
  public static HashMap<String, String> a(Bundle paramBundle)
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localHashMap.put(str, paramBundle.getString(str));
    }
    return localHashMap;
  }
  
  private static HashMap<Integer, Map.Entry<String, kr.a<?, ?>>> a(HashMap<String, kr.a<?, ?>> paramHashMap)
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = paramHashMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localHashMap.put(Integer.valueOf(((kr.a)localEntry.getValue()).g()), localEntry);
    }
    return localHashMap;
  }
  
  private void a(StringBuilder paramStringBuilder, int paramInt, Object paramObject)
  {
    switch (paramInt)
    {
    default: 
      throw new IllegalArgumentException("Unknown type = " + paramInt);
    case 0: 
    case 1: 
    case 2: 
    case 3: 
    case 4: 
    case 5: 
    case 6: 
      paramStringBuilder.append(paramObject);
      return;
    case 7: 
      paramStringBuilder.append("\"").append(li.a(paramObject.toString())).append("\"");
      return;
    case 8: 
      paramStringBuilder.append("\"").append(lb.a((byte[])paramObject)).append("\"");
      return;
    case 9: 
      paramStringBuilder.append("\"").append(lb.b((byte[])paramObject));
      paramStringBuilder.append("\"");
      return;
    case 10: 
      lj.a(paramStringBuilder, (HashMap)paramObject);
      return;
    }
    throw new IllegalArgumentException("Method does not accept concrete type.");
  }
  
  private void a(StringBuilder paramStringBuilder, kr.a<?, ?> parama, Parcel paramParcel, int paramInt)
  {
    switch (parama.d())
    {
    default: 
      throw new IllegalArgumentException("Unknown field out type = " + parama.d());
    case 0: 
      a(paramStringBuilder, parama, a(parama, Integer.valueOf(a.f(paramParcel, paramInt))));
      return;
    case 1: 
      a(paramStringBuilder, parama, a(parama, a.i(paramParcel, paramInt)));
      return;
    case 2: 
      a(paramStringBuilder, parama, a(parama, Long.valueOf(a.h(paramParcel, paramInt))));
      return;
    case 3: 
      a(paramStringBuilder, parama, a(parama, Float.valueOf(a.j(paramParcel, paramInt))));
      return;
    case 4: 
      a(paramStringBuilder, parama, a(parama, Double.valueOf(a.k(paramParcel, paramInt))));
      return;
    case 5: 
      a(paramStringBuilder, parama, a(parama, a.l(paramParcel, paramInt)));
      return;
    case 6: 
      a(paramStringBuilder, parama, a(parama, Boolean.valueOf(a.c(paramParcel, paramInt))));
      return;
    case 7: 
      a(paramStringBuilder, parama, a(parama, a.m(paramParcel, paramInt)));
      return;
    case 8: 
    case 9: 
      a(paramStringBuilder, parama, a(parama, a.p(paramParcel, paramInt)));
      return;
    case 10: 
      a(paramStringBuilder, parama, a(parama, a(a.o(paramParcel, paramInt))));
      return;
    }
    throw new IllegalArgumentException("Method does not accept concrete type.");
  }
  
  private void a(StringBuilder paramStringBuilder, kr.a<?, ?> parama, Object paramObject)
  {
    if (parama.c())
    {
      a(paramStringBuilder, parama, (ArrayList)paramObject);
      return;
    }
    a(paramStringBuilder, parama.b(), paramObject);
  }
  
  private void a(StringBuilder paramStringBuilder, kr.a<?, ?> parama, ArrayList<?> paramArrayList)
  {
    paramStringBuilder.append("[");
    int i = paramArrayList.size();
    for (int j = 0; j < i; j++)
    {
      if (j != 0) {
        paramStringBuilder.append(",");
      }
      a(paramStringBuilder, parama.b(), paramArrayList.get(j));
    }
    paramStringBuilder.append("]");
  }
  
  private void a(StringBuilder paramStringBuilder, String paramString, kr.a<?, ?> parama, Parcel paramParcel, int paramInt)
  {
    paramStringBuilder.append("\"").append(paramString).append("\":");
    if (parama.j())
    {
      a(paramStringBuilder, parama, paramParcel, paramInt);
      return;
    }
    b(paramStringBuilder, parama, paramParcel, paramInt);
  }
  
  private void a(StringBuilder paramStringBuilder, HashMap<String, kr.a<?, ?>> paramHashMap, Parcel paramParcel)
  {
    HashMap localHashMap = a(paramHashMap);
    paramStringBuilder.append('{');
    int i = a.b(paramParcel);
    int j = 0;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.a(paramParcel);
      Map.Entry localEntry = (Map.Entry)localHashMap.get(Integer.valueOf(a.a(k)));
      if (localEntry != null)
      {
        if (j != 0) {
          paramStringBuilder.append(",");
        }
        a(paramStringBuilder, (String)localEntry.getKey(), (kr.a)localEntry.getValue(), paramParcel, k);
        j = 1;
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    }
    paramStringBuilder.append('}');
  }
  
  private void b(StringBuilder paramStringBuilder, kr.a<?, ?> parama, Parcel paramParcel, int paramInt)
  {
    if (parama.e())
    {
      paramStringBuilder.append("[");
      switch (parama.d())
      {
      default: 
        throw new IllegalStateException("Unknown field type out.");
      case 0: 
        la.a(paramStringBuilder, a.r(paramParcel, paramInt));
      }
      for (;;)
      {
        paramStringBuilder.append("]");
        return;
        la.a(paramStringBuilder, a.t(paramParcel, paramInt));
        continue;
        la.a(paramStringBuilder, a.s(paramParcel, paramInt));
        continue;
        la.a(paramStringBuilder, a.u(paramParcel, paramInt));
        continue;
        la.a(paramStringBuilder, a.v(paramParcel, paramInt));
        continue;
        la.a(paramStringBuilder, a.w(paramParcel, paramInt));
        continue;
        la.a(paramStringBuilder, a.q(paramParcel, paramInt));
        continue;
        la.a(paramStringBuilder, a.x(paramParcel, paramInt));
        continue;
        throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
        Parcel[] arrayOfParcel = a.A(paramParcel, paramInt);
        int j = arrayOfParcel.length;
        for (int k = 0; k < j; k++)
        {
          if (k > 0) {
            paramStringBuilder.append(",");
          }
          arrayOfParcel[k].setDataPosition(0);
          a(paramStringBuilder, parama.l(), arrayOfParcel[k]);
        }
      }
    }
    switch (parama.d())
    {
    default: 
      throw new IllegalStateException("Unknown field type out");
    case 0: 
      paramStringBuilder.append(a.f(paramParcel, paramInt));
      return;
    case 1: 
      paramStringBuilder.append(a.i(paramParcel, paramInt));
      return;
    case 2: 
      paramStringBuilder.append(a.h(paramParcel, paramInt));
      return;
    case 3: 
      paramStringBuilder.append(a.j(paramParcel, paramInt));
      return;
    case 4: 
      paramStringBuilder.append(a.k(paramParcel, paramInt));
      return;
    case 5: 
      paramStringBuilder.append(a.l(paramParcel, paramInt));
      return;
    case 6: 
      paramStringBuilder.append(a.c(paramParcel, paramInt));
      return;
    case 7: 
      String str2 = a.m(paramParcel, paramInt);
      paramStringBuilder.append("\"").append(li.a(str2)).append("\"");
      return;
    case 8: 
      byte[] arrayOfByte2 = a.p(paramParcel, paramInt);
      paramStringBuilder.append("\"").append(lb.a(arrayOfByte2)).append("\"");
      return;
    case 9: 
      byte[] arrayOfByte1 = a.p(paramParcel, paramInt);
      paramStringBuilder.append("\"").append(lb.b(arrayOfByte1));
      paramStringBuilder.append("\"");
      return;
    case 10: 
      Bundle localBundle = a.o(paramParcel, paramInt);
      Set localSet = localBundle.keySet();
      localSet.size();
      paramStringBuilder.append("{");
      Iterator localIterator = localSet.iterator();
      for (int i = 1; localIterator.hasNext(); i = 0)
      {
        String str1 = (String)localIterator.next();
        if (i == 0) {
          paramStringBuilder.append(",");
        }
        paramStringBuilder.append("\"").append(str1).append("\"");
        paramStringBuilder.append(":");
        paramStringBuilder.append("\"").append(li.a(localBundle.getString(str1))).append("\"");
      }
      paramStringBuilder.append("}");
      return;
    }
    Parcel localParcel = a.z(paramParcel, paramInt);
    localParcel.setDataPosition(0);
    a(paramStringBuilder, parama.l(), localParcel);
  }
  
  protected Object a(String paramString)
  {
    throw new UnsupportedOperationException("Converting to JSON does not require this method.");
  }
  
  public HashMap<String, kr.a<?, ?>> a()
  {
    if (this.d == null) {
      return null;
    }
    return this.d.a(this.e);
  }
  
  protected boolean b(String paramString)
  {
    throw new UnsupportedOperationException("Converting to JSON does not require this method.");
  }
  
  public int d()
  {
    return this.a;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Parcel e()
  {
    switch (this.f)
    {
    }
    for (;;)
    {
      return this.b;
      this.g = b.a(this.b);
      b.a(this.b, this.g);
      this.f = 2;
      continue;
      b.a(this.b, this.g);
      this.f = 2;
    }
  }
  
  kv f()
  {
    switch (this.c)
    {
    default: 
      throw new IllegalStateException("Invalid creation type: " + this.c);
    case 0: 
      return null;
    case 1: 
      return this.d;
    }
    return this.d;
  }
  
  public String toString()
  {
    jx.a(this.d, "Cannot convert to JSON on client side.");
    Parcel localParcel = e();
    localParcel.setDataPosition(0);
    StringBuilder localStringBuilder = new StringBuilder(100);
    a(localStringBuilder, this.d.a(this.e), localParcel);
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    kz.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ky
 * JD-Core Version:    0.7.0.1
 */