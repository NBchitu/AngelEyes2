package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import java.util.HashSet;

final class jn$a
{
  private final String b;
  private final jn.a.a c;
  private final HashSet<jl<?>.f> d;
  private int e;
  private boolean f;
  private IBinder g;
  private ComponentName h;
  
  public jn$a(jn paramjn, String paramString)
  {
    this.b = paramString;
    this.c = new jn.a.a(this);
    this.d = new HashSet();
    this.e = 2;
  }
  
  public void a()
  {
    Intent localIntent = new Intent(this.b).setPackage("com.google.android.gms");
    this.f = jn.b(this.a).bindService(localIntent, this.c, 129);
    if (this.f)
    {
      this.e = 3;
      return;
    }
    jn.b(this.a).unbindService(this.c);
  }
  
  public void a(jl<?>.f paramjl)
  {
    this.d.add(paramjl);
  }
  
  public void b()
  {
    jn.b(this.a).unbindService(this.c);
    this.f = false;
    this.e = 2;
  }
  
  public void b(jl<?>.f paramjl)
  {
    this.d.remove(paramjl);
  }
  
  public String c()
  {
    return this.b;
  }
  
  public boolean c(jl<?>.f paramjl)
  {
    return this.d.contains(paramjl);
  }
  
  public boolean d()
  {
    return this.f;
  }
  
  public int e()
  {
    return this.e;
  }
  
  public boolean f()
  {
    return this.d.isEmpty();
  }
  
  public IBinder g()
  {
    return this.g;
  }
  
  public ComponentName h()
  {
    return this.h;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.jn.a
 * JD-Core Version:    0.7.0.1
 */