package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class kv
  implements SafeParcelable
{
  public static final kw CREATOR = new kw();
  private final int a;
  private final HashMap<String, HashMap<String, kr.a<?, ?>>> b;
  private final ArrayList<kv.a> c;
  private final String d;
  
  kv(int paramInt, ArrayList<kv.a> paramArrayList, String paramString)
  {
    this.a = paramInt;
    this.c = null;
    this.b = a(paramArrayList);
    this.d = ((String)jx.a(paramString));
    a();
  }
  
  private static HashMap<String, HashMap<String, kr.a<?, ?>>> a(ArrayList<kv.a> paramArrayList)
  {
    HashMap localHashMap = new HashMap();
    int i = paramArrayList.size();
    for (int j = 0; j < i; j++)
    {
      kv.a locala = (kv.a)paramArrayList.get(j);
      localHashMap.put(locala.b, locala.a());
    }
    return localHashMap;
  }
  
  public HashMap<String, kr.a<?, ?>> a(String paramString)
  {
    return (HashMap)this.b.get(paramString);
  }
  
  public void a()
  {
    Iterator localIterator1 = this.b.keySet().iterator();
    while (localIterator1.hasNext())
    {
      String str = (String)localIterator1.next();
      HashMap localHashMap = (HashMap)this.b.get(str);
      Iterator localIterator2 = localHashMap.keySet().iterator();
      while (localIterator2.hasNext()) {
        ((kr.a)localHashMap.get((String)localIterator2.next())).a(this);
      }
    }
  }
  
  int b()
  {
    return this.a;
  }
  
  ArrayList<kv.a> c()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.b.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localArrayList.add(new kv.a(str, (HashMap)this.b.get(str)));
    }
    return localArrayList;
  }
  
  public String d()
  {
    return this.d;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator1 = this.b.keySet().iterator();
    while (localIterator1.hasNext())
    {
      String str1 = (String)localIterator1.next();
      localStringBuilder.append(str1).append(":\n");
      HashMap localHashMap = (HashMap)this.b.get(str1);
      Iterator localIterator2 = localHashMap.keySet().iterator();
      while (localIterator2.hasNext())
      {
        String str2 = (String)localIterator2.next();
        localStringBuilder.append("  ").append(str2).append(": ");
        localStringBuilder.append(localHashMap.get(str2));
      }
    }
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    kw.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.kv
 * JD-Core Version:    0.7.0.1
 */