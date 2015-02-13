package com.google.android.gms.maps.internal;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.maps.GoogleMapOptions;

public abstract interface IMapFragmentDelegate
  extends IInterface
{
  public abstract d a(d paramd1, d paramd2, Bundle paramBundle);
  
  public abstract IGoogleMapDelegate a();
  
  public abstract void a(Bundle paramBundle);
  
  public abstract void a(d paramd, GoogleMapOptions paramGoogleMapOptions, Bundle paramBundle);
  
  public abstract void a(m paramm);
  
  public abstract void b();
  
  public abstract void b(Bundle paramBundle);
  
  public abstract void c();
  
  public abstract void d();
  
  public abstract void e();
  
  public abstract void f();
  
  public abstract boolean g();
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.internal.IMapFragmentDelegate
 * JD-Core Version:    0.7.0.1
 */