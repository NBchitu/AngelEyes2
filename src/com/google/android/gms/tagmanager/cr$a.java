package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.d.a;
import java.util.Collections;
import java.util.Map;

public class cr$a
{
  private final Map<String, d.a> a;
  private final d.a b;
  
  public Map<String, d.a> a()
  {
    return Collections.unmodifiableMap(this.a);
  }
  
  public void a(String paramString, d.a parama)
  {
    this.a.put(paramString, parama);
  }
  
  public d.a b()
  {
    return this.b;
  }
  
  public String toString()
  {
    return "Properties: " + a() + " pushAfterEvaluate: " + this.b;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.tagmanager.cr.a
 * JD-Core Version:    0.7.0.1
 */