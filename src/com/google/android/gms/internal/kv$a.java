package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class kv$a
  implements SafeParcelable
{
  public static final kx CREATOR = new kx();
  final int a;
  final String b;
  final ArrayList<kv.b> c;
  
  kv$a(int paramInt, String paramString, ArrayList<kv.b> paramArrayList)
  {
    this.a = paramInt;
    this.b = paramString;
    this.c = paramArrayList;
  }
  
  kv$a(String paramString, HashMap<String, kr.a<?, ?>> paramHashMap)
  {
    this.a = 1;
    this.b = paramString;
    this.c = a(paramHashMap);
  }
  
  private static ArrayList<kv.b> a(HashMap<String, kr.a<?, ?>> paramHashMap)
  {
    if (paramHashMap == null) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramHashMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localArrayList.add(new kv.b(str, (kr.a)paramHashMap.get(str)));
    }
    return localArrayList;
  }
  
  HashMap<String, kr.a<?, ?>> a()
  {
    HashMap localHashMap = new HashMap();
    int i = this.c.size();
    for (int j = 0; j < i; j++)
    {
      kv.b localb = (kv.b)this.c.get(j);
      localHashMap.put(localb.b, localb.c);
    }
    return localHashMap;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    kx.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.kv.a
 * JD-Core Version:    0.7.0.1
 */