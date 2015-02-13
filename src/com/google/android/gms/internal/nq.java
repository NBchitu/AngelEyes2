package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class nq
  implements SafeParcelable
{
  public static final nr CREATOR = new nr();
  final int a;
  final boolean b;
  final List<oa> c;
  private final Set<oa> d;
  
  nq(int paramInt, boolean paramBoolean, List<oa> paramList)
  {
    this.a = paramInt;
    this.b = paramBoolean;
    if (paramList == null) {}
    for (List localList = Collections.emptyList();; localList = Collections.unmodifiableList(paramList))
    {
      this.c = localList;
      if (!this.c.isEmpty()) {
        break;
      }
      this.d = Collections.emptySet();
      return;
    }
    this.d = Collections.unmodifiableSet(new HashSet(this.c));
  }
  
  public boolean a()
  {
    return this.b;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    nq localnq;
    do
    {
      return true;
      if (!(paramObject instanceof nq)) {
        return false;
      }
      localnq = (nq)paramObject;
    } while ((this.d.equals(localnq.d)) && (this.b == localnq.b));
    return false;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this.d;
    arrayOfObject[1] = Boolean.valueOf(this.b);
    return jv.a(arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    nr.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.nq
 * JD-Core Version:    0.7.0.1
 */