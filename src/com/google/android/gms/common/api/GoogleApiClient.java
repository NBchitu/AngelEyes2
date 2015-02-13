package com.google.android.gms.common.api;

import android.os.Looper;

public abstract interface GoogleApiClient
{
  public abstract Looper a();
  
  public abstract <C extends Api.a> C a(Api.c<C> paramc);
  
  public abstract <A extends Api.a, T extends BaseImplementation.a<? extends Result, A>> T a(T paramT);
  
  public abstract void a(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks);
  
  public abstract void a(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener);
  
  public abstract void b();
  
  public abstract void b(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks);
  
  public abstract void b(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener);
  
  public abstract void c();
  
  public abstract boolean d();
  
  public abstract boolean e();
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.GoogleApiClient
 * JD-Core Version:    0.7.0.1
 */