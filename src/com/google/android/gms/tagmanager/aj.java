package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.d.a;
import java.util.Map;
import java.util.Set;

abstract class aj
{
  private final Set<String> a;
  
  public abstract d.a a(Map<String, d.a> paramMap);
  
  public abstract boolean a();
  
  boolean a(Set<String> paramSet)
  {
    return paramSet.containsAll(this.a);
  }
  
  public Set<String> b()
  {
    return this.a;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.tagmanager.aj
 * JD-Core Version:    0.7.0.1
 */