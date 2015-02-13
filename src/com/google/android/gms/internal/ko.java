package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public final class ko
  implements SafeParcelable, kr.b<String, Integer>
{
  public static final kp CREATOR = new kp();
  private final int a;
  private final HashMap<String, Integer> b;
  private final HashMap<Integer, String> c;
  private final ArrayList<ko.a> d;
  
  public ko()
  {
    this.a = 1;
    this.b = new HashMap();
    this.c = new HashMap();
    this.d = null;
  }
  
  ko(int paramInt, ArrayList<ko.a> paramArrayList)
  {
    this.a = paramInt;
    this.b = new HashMap();
    this.c = new HashMap();
    this.d = null;
    a(paramArrayList);
  }
  
  private void a(ArrayList<ko.a> paramArrayList)
  {
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      ko.a locala = (ko.a)localIterator.next();
      a(locala.b, locala.c);
    }
  }
  
  int a()
  {
    return this.a;
  }
  
  public ko a(String paramString, int paramInt)
  {
    this.b.put(paramString, Integer.valueOf(paramInt));
    this.c.put(Integer.valueOf(paramInt), paramString);
    return this;
  }
  
  public String a(Integer paramInteger)
  {
    String str = (String)this.c.get(paramInteger);
    if ((str == null) && (this.b.containsKey("gms_unknown"))) {
      str = "gms_unknown";
    }
    return str;
  }
  
  ArrayList<ko.a> b()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.b.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localArrayList.add(new ko.a(str, ((Integer)this.b.get(str)).intValue()));
    }
    return localArrayList;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    kp.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ko
 * JD-Core Version:    0.7.0.1
 */